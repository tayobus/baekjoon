import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        List<String> strs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (!strs.contains(str)) {
                strs.add(str);
            }
        }

        Collections.sort(strs, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        for (String str : strs) {
            sb.append(str).append('\n');
        }
        
        System.out.print(sb);
        br.close();
    }
}
