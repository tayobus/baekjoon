import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[n + 1]; // 1-indexed로 사용
        
        // 포도주 양 입력
        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }
        
        // 예외 처리
        if (n == 1) {
            System.out.println(wine[1]);
            return;
        }
        if (n == 2) {
            System.out.println(wine[1] + wine[2]);
            return;
        }
        
        // DP 배열 초기화
        int[] dp = new int[n + 1];
        
        // 기저 조건
        dp[0] = 0;
        dp[1] = wine[1];
        dp[2] = wine[1] + wine[2];
        
        // 동적계획법 적용
        for (int i = 3; i <= n; i++) {
            // 세 가지 경우 중 최댓값 선택
            // 1. i번째 잔을 마시지 않는 경우
            // 2. i번째 잔을 마시고 i-1번째 잔을 마시지 않는 경우  
            // 3. i번째, i-1번째 잔을 마시고 i-2번째 잔을 마시지 않는 경우
            dp[i] = Math.max(dp[i-1], 
                    Math.max(wine[i] + dp[i-2], 
                            wine[i] + wine[i-1] + dp[i-3]));
        }
        
        System.out.println(dp[n]);
    }
}