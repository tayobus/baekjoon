import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String S = br.readLine();
        int count = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (' ' != S.charAt(i)) {
                count++;
                try {
                    while (S.charAt(i) != ' ') i++;
                } catch (StringIndexOutOfBoundsException e) {
                    break;
                }
            }
        }

        sb.append(count);
        
        System.out.print(sb);
    }
}