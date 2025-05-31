import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] meta = br.readLine().split(" ");
        int M = Integer.parseInt(meta[0]);
        int N = Integer.parseInt(meta[1]);

        boolean[] falseIsPrime = sieve(N);

        for (int i = M; i <= N; i++) {
            if (!falseIsPrime[i])
                sb.append(i).append('\n');
        }

        System.out.print(sb);
        br.close();
    }

    static boolean[] sieve(int n) {
        boolean[] falseIsPrime = new boolean[n + 1];
        falseIsPrime[0] = true;
        falseIsPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (falseIsPrime[i])
                continue;
            for (int j = i * i; j <= n; j += i) {
                falseIsPrime[j] = true;
            }
        }

        return falseIsPrime;
    }
}
