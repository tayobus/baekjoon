import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        final int quarter = 25;
        final int dime = 10;
        final int nickel = 5;
        final int penny = 1;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int remainder = Integer.parseInt(br.readLine());

            sb.append(remainder / quarter).append(' ');
            remainder %= quarter;
            sb.append(remainder/dime).append(' ');
            remainder %= dime;
            sb.append(remainder/nickel).append(' ');
            remainder %= nickel;
            sb.append(remainder/penny).append('\n');
        }
        
        System.out.print(sb);
    }
}
