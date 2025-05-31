import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] meta = br.readLine().split(" ");
        
        String[] line;

        Set<String> set = new HashSet<>();

        line = br.readLine().split(" ");
        for (String s : line) {
            set.add(s);
        }

        line = br.readLine().split(" ");
        for (String s : line) {
            if (set.contains(s)) {
                set.remove(s);
            } else {
                set.add(s);
            }
        }

        sb.append(set.size());
        
        System.out.print(sb);
        br.close();
    }
}
