import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            if (A == 0 && B == 0) break;

            if (B % A == 0) {
                sb.append("factor\n");
            }
            else if (A % B == 0) {
                sb.append("multiple\n");
            }
            else {
                sb.append("neither\n");
            }
        }
        
        System.out.print(sb);
    }
}
