import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        List<String> groupWords = new ArrayList<>();

        for (int i = 0; i< N; i++) {
            words[i] = br.readLine();
        }

        for (String word : words) {
            if(isGW(word)) {
                groupWords.add(word);
            }
        }

        sb.append(groupWords.size());
        
        System.out.print(sb);
    }

    private static boolean isGW(String word) {
        Set<Character> found = new HashSet<>();
        boolean result = true;
        for (int i = 0; i < word.length(); i++) {
            if (!found.contains(word.charAt(i)) || i > 0 && word.charAt(i-1) == word.charAt(i)) {
                found.add(word.charAt(i));
            }
            else {
                result = false;
                break;
            }
        }

        return result;
    }
}
