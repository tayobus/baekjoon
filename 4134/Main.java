import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(getGreatestPrimeOver(Long.parseLong(br.readLine()))).append('\n');
        }

        System.out.print(sb);
        br.close();
    }

    static long getGreatestPrimeOver(long n) {
        while (true) {
            if (isPrime(n))
                return n;
            n++;
        }
    }

    static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
