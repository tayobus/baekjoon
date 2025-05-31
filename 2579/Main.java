import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[N + 1][2];

        dp[0][0] = 0;
        dp[0][1] = 0;

        dp[1][0] = Integer.parseInt(br.readLine());
        dp[1][1] = dp[1][0];

        for (int stair = 2; stair <= N; stair++) {
            int cur = Integer.parseInt(br.readLine());

            dp[stair][0] = dp[stair - 1][1] + cur;
            dp[stair][1] = Math.max(dp[stair - 2][0], dp[stair - 2][1]) + cur;
        }

        bw.write("" + Math.max(dp[N][0], dp[N][1]));

        bw.flush();
        bw.close();
    }
}
