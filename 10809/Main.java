import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String word = br.readLine();

        int[] containsX = new int[26];
        Arrays.fill(containsX, -1);

        for (int i = 0; i < word.length(); i++) {
            int loc = (int) word.charAt(i) - (int) 'a';
            if (-1 == containsX[loc]) containsX[loc] = i;
        }

        for (int i : containsX) sb.append(i).append(' ');
        
        System.out.print(sb);
    }
}
