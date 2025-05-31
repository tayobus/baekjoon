import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static boolean[] used;
    static int[] output;

    public static void main(String[] args) throws IOException {

        String[] meta = br.readLine().split(" ");
        N = Integer.parseInt(meta[0]);
        M = Integer.parseInt(meta[1]);

        used = new boolean[N + 1];
        output = new int[M];

        backtrack(M);

        bw.flush();
        bw.close();
    }

    static void backtrack(int remaining) throws IOException {
        if (remaining <= 0) {
            for (int i : output) {
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }

        for (int j = 1; j <= N; j++) {
            if (!used[j]) {
                output[M - remaining] = j;
                used[j] = true;
                backtrack(remaining - 1);
                used[j] = false;
            } 
        }

    }
}
