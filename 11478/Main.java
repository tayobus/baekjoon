import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        Set<String> set = new HashSet<>();

        for (int i = 1; i <= input.length(); i++) {
            for (int j = 0; j <= input.length() - i; j++) {
                set.add(input.substring(j, j + i));
            }
        }

        sb.append(set.size());

        System.out.print(sb);
        br.close();
    }
}
