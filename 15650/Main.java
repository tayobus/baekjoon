import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static boolean[] used;
    static List<Integer> output;
    static Set<Set<Integer>> printed;

    public static void main(String[] args) throws IOException {

        String[] meta = br.readLine().split(" ");
        N = Integer.parseInt(meta[0]);
        M = Integer.parseInt(meta[1]);

        used = new boolean[N + 1];
        output = new ArrayList<>();
        printed = new HashSet<>();

        backtrack(M);

        bw.flush();
        bw.close();
    }

    static void backtrack(int remaining) throws IOException {
        if (remaining <= 0) {
            if (printed.contains(new HashSet<>(output))) {
                return;
            }
            for (int i : output) {
                bw.write(i + " ");
            }
            bw.newLine();
            printed.add(new HashSet<>(output));
            return;
        }

        for (int j = 1; j <= N; j++) {
            if (!used[j]) {
                if (output.size() > M - remaining) {
                    output.set(M - remaining, j);
                } else {
                    output.add(j);
                }
                used[j] = true;
                backtrack(remaining - 1);
                used[j] = false;
            } 
        }
    }
}
