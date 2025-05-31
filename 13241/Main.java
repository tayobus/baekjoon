import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        long A = Integer.parseInt(line[0]);
        long B = Integer.parseInt(line[1]);
        sb.append(A * B / gcd(A, B)).append('\n');

        System.out.print(sb);
        br.close();
    }

    static long gcd(long A, long B) {
        long a = Math.max(A, B);
        long b = Math.min(A, B);

        long remainder = a % b;

        if (remainder == 0) {
            return b;
        } else {
            return gcd(b, remainder);
        }
    }
}
