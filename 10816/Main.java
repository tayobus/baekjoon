import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> counts = new HashMap<>();
        String[] line;

        br.readLine();

        line = br.readLine().trim().split(" ");
        for (String s : line) {
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }

        br.readLine();

        line = br.readLine().trim().split(" ");
        for (String s : line) {
            sb.append(counts.getOrDefault(s, 0)).append(' ');
        }

        System.out.print(sb);
        br.close();
    }
}
