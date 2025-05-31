import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            set.add(name);
        }

        Set<String> intersection = new TreeSet<>();

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                intersection.add(name);
            }
        }

        sb.append(intersection.size()).append('\n');
        for (String name : intersection) {
            sb.append(name).append('\n');
        }

        System.out.print(sb);
        br.close();
    }
}
