import java.io.*;

public class Main {
    static boolean[] isNotPrime;
    static final int MAX_N = 1000000; // 문제 최대값에 맞게 조정

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 에라토스테네스의 체로 소수 미리 계산
        sieveOfEratosthenes(MAX_N);
        
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            
            for (int j = 2; j <= n / 2; j++) {
                if (!isNotPrime[j] && !isNotPrime[n - j]) {
                    count++;
                }
            }
            
            sb.append(count).append('\n');
        }

        System.out.print(sb);
        br.close();
    }
    
    // 에라토스테네스의 체
    static void sieveOfEratosthenes(int n) {
        isNotPrime = new boolean[n + 1];
        isNotPrime[0] = isNotPrime[1] = true;
        
        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}