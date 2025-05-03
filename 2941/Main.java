import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] specialTokens = {"dz=", "c=", "c-", "lj", "s=", "z=", "nj", "d-"};
        String input = br.readLine();

        int count = 0;
        int i = 0;
        while (i < input.length()) {
            boolean found = false;
            for (String token : specialTokens) {
                if (i+token.length() <= input.length() &&
                input.substring(i, i+token.length()).equals(token)) {
                    i += token.length();
                    count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                i++;
                count++;
            }
        }
        sb.append(count);

        System.out.print(sb); 
    }
}
