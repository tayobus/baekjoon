import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line = br.readLine();

        int isPal = 1;
        for (int i=0; i < line.length()/2; i++) {
            if (line.charAt(i) != line.charAt(line.length()-i-1)) {
                isPal = 0;
                break;
            }
        }

        sb.append(isPal);
        
        System.out.print(sb);
    }
}
