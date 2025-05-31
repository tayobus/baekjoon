import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // N이 1 또는 2인 경우 직접 처리
        if (N == 1 || N == 2) {
            System.out.println(N);
            return;
        }

        // 동적 계획법으로 해결
        // dp[i] = 길이 i인 수열을 만드는 방법의 수
        int[] dp = new int[N + 1];
        dp[1] = 1; // 길이 1: "1"만 가능
        dp[2] = 2; // 길이 2: "00", "11" 가능

        // 점화식: dp[i] = dp[i-1] + dp[i-2]
        // 마지막이 "1"인 경우: dp[i-1]가지
        // 마지막이 "00"인 경우: dp[i-2]가지
        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

        System.out.println(dp[N]);
        sc.close();
    }
}