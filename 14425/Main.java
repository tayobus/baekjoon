import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        Set<String> S = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            S.add(br.readLine().trim());
        }
        for (int i = 0; i < M; i++) {
            if (S.contains(br.readLine().trim())) {
                count++;
            }
        }
        sb.append(count);

        System.out.print(sb);
        br.close();
    }
}
