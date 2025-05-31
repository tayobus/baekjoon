import java.io.*;

public class Main {

    static int N;
    static int[] nums, ops;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        ops = new int[4];
        String[] line;
        line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        line = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            ops[i] = Integer.parseInt(line[i]);
        }

        backtrack(0, nums[0]);

        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(min));

        bw.flush();
        bw.close();
    }

    static void backtrack(int depth, int sofar) {
        if (depth == N - 1) {
            max = Math.max(max, sofar);
            min = Math.min(min, sofar);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (ops[i] == 0)
                continue;

            ops[i]--;
            backtrack(depth + 1, calc(i, sofar, depth));
            ops[i]++;
        }
    }

    static int calc(int op, int sofar, int depth) {
        switch (op) {
            case 0:
                return sofar + nums[depth + 1];
            case 1:
                return sofar - nums[depth + 1];
            case 2:
                return sofar * nums[depth + 1];
            case 3:
                return sofar / nums[depth + 1];
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
