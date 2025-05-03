import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();

        int answer = 0;

        for (int i=0; i < 3; i++) {
            int digit = M % 10;
            System.out.println(N*digit);
            answer += N*digit*(int)Math.pow(10, i);
            M /= 10;
        }
        System.out.println(answer);
    }
}