import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        if (N <= 1)
            return;

        int divisor = 2;
        while (N != 1) {
            while (N % divisor == 0) {
                sb.append(divisor).append('\n');
                N /= divisor;
            }
            divisor++;
        }

        System.out.print(sb);
    }
}
