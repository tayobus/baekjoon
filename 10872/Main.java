import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            sb.append('1');
        }
        else {
            long fact = 1;
            for (int i = 1; i <= N; i++) {
                fact *= i;
            }
            sb.append(fact);
        }
        
        System.out.print(sb);
    }
}
