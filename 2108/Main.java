import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int sum = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            arr[i] = num;
        }

        int maxCount = Collections.max(counts.values());
        Set<Integer> dominants = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == maxCount) {
                dominants.add(entry.getKey());
            }
        }

        Iterator<Integer> iter = dominants.iterator();
        int mode = iter.next();
        if (iter.hasNext()) {
            mode = iter.next();
        }

        Arrays.sort(arr);

        sb.append(Math.round((double) sum / N)).append('\n')
                .append(arr[N / 2]).append('\n')
                .append(mode).append('\n')
                .append(max - min);

        System.out.print(sb);
    }
}
