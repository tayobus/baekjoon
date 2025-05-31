import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static List<Integer> output;

    public static void main(String[] args) throws IOException {

        String[] meta = br.readLine().split(" ");
        N = Integer.parseInt(meta[0]);
        M = Integer.parseInt(meta[1]);

        output = new ArrayList<>();

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
            if (output.size() > M - remaining) {
                output.set(M - remaining, j);
            } else {
                output.add(j);
            }
            backtrack(remaining - 1);
        }
    }
}
