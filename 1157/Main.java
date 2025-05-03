import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Character dominant = null;
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : str.toCharArray()) {
            c = Character.toUpperCase(c);
            counts.put(c, counts.getOrDefault(c, 0)+1);
        }

        int maxCount = Collections.max(counts.values());

        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            if (e.getValue() == maxCount)
            dominant = (dominant == null) ? e.getKey() : '?';
        }

        sb.append(dominant);
        
        System.out.print(sb);
    }
}
