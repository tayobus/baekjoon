import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Set<Integer> nums = new TreeSet<>();
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(line[i]));
        }

        Map<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for (int e : nums) {
            map.put(e, idx++);
        }

        for (String num : line) {
            sb.append(map.get(Integer.parseInt(num))).append(' ');
        }

        System.out.print(sb);
        br.close();
    }
}
