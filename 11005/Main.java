import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().trim().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        // 최대자릿수 찾기
        int maxExp = 0;
        while (Math.pow(B, maxExp + 1) <= N) maxExp++;

        // 최대자릿수부터 첫째자리까지 계수찾고 N 축소해나가기 반복
        for (int i = maxExp; i >= 0; i--) {
            // 해당 자리에 대해서 계수가 얼마가 돼야하는지 0부터 시작해서 찾기
            int coeff = 0;
            while (N <= (coeff+1)*Math.pow(B, i)) {
                coeff++;
                sb.append(coeff).append('\n');
            }
        }
        

        System.out.print(sb);
    }

    // static char int2char(int n, int b) {
    //     return Character.
    // }
}
