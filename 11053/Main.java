import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        int[] input = new int[N];
        int[] maxLen = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(line[i]);
        }

        // 뒤에서부터 탐색
        for (int i = N - 1; i > -1; i--) {
            int max = 0;
            for (int j = i + 1; j < N; j++) {
                if (input[i] < input[j]) {
                    max = Math.max(max, maxLen[j]);
                }
            }
            maxLen[i] = 1 + max;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, maxLen[i]);
        }
        bw.write("" + max);

        bw.flush();
        bw.close();
    }
}
