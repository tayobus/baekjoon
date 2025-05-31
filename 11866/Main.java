import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int K = Integer.parseInt(meta[1]);

        List<Integer> ls = new ArrayList<>(N);

        for (Integer i = 1; i <= N; i++) {
            ls.add(i);
        }

        int current = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                do {
                    current = ++current % N;
                } while (ls.get(current) == null);
            }
            sb.append(ls.get(current)).append(", ");
            ls.set(current, null);
        }

        sb.delete(sb.length() - 2, sb.length()).insert(0, '<').append('>');

        System.out.print(sb);
        br.close();
    }
}
