import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] line;
        line = br.readLine().split(" ");
        int an = Integer.parseInt(line[0]);
        int ad = Integer.parseInt(line[1]);
        line = br.readLine().split(" ");
        int bn = Integer.parseInt(line[0]);
        int bd = Integer.parseInt(line[1]);

        int numerator = an * bd + bn * ad;
        int denominator = ad * bd;

        int gcd = gcd(numerator, denominator);

        sb.append(numerator / gcd).append(' ').append(denominator / gcd);

        System.out.print(sb);
        br.close();
    }

    static int gcd(int A, int B) {
        int a = Math.max(A, B);
        int b = Math.min(A, B);

        int remainder = a % b;

        if (remainder == 0) {
            return b;
        } else {
            return gcd(b, remainder);
        }
    }
}
