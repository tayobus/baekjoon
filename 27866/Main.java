import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String S = br.readLine();
        int n = Integer.parseInt(br.readLine());

        sb.append(S.charAt(n-1));
        
        System.out.print(sb);
    }
}