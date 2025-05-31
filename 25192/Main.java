import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int result = 0;
        for (int i = 0; i < N; i++) {
            String entry = br.readLine();
            if (entry.equals("ENTER")) {
                result += set.size();
                set = new HashSet<>();
            }
            else {
                set.add(entry);
            }
        }
        result += set.size();
        sb.append(result);
        
        System.out.print(sb);
    }
}
