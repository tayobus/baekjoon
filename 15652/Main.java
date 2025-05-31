import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, M;
    static int[] sequence;

    public static void main(String[] args) throws IOException {

        String[] meta = br.readLine().split(" ");
        N = Integer.parseInt(meta[0]);
        M = Integer.parseInt(meta[1]);

        sequence = new int[M];
        backtrack(0);

        bw.flush();
        bw.close();
    }

    static void backtrack(int depth) throws IOException {
        if (depth == M) {
            for (int i : sequence) {
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (depth == 0 || sequence[depth - 1] <= i) {
                sequence[depth] = i;
                backtrack(depth + 1);
            }
        }
    }
}
