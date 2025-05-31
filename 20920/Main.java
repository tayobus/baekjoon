import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M)
                continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,
                Comparator.<Map.Entry<String, Integer>, Integer>comparing(Map.Entry::getValue,
                        Comparator.reverseOrder())
                        .thenComparing(e -> e.getKey().length(), Comparator.reverseOrder())
                        .thenComparing(Map.Entry::getKey));

        for (Map.Entry<String, Integer> entry : list) {
            sb.append(entry.getKey()).append("\n");
        }
        System.out.print(sb);
    }
}
