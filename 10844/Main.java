import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    private static final int MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[10];

        for (int i = 1; i < 10; i++) {
            dp[i] = 1;
        }

        for (int length = 1; length < N; length++) {

            int[] nextDp = new int[10];

            nextDp[0] = dp[1];
            for (int digit = 1; digit < 9; digit++) {
                nextDp[digit] = (dp[digit - 1] + dp[digit + 1]) % MOD;
            }
            nextDp[9] = dp[8];

            dp = nextDp;
        }

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[i]) % MOD;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
