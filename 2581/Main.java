import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                smallest = smallest < i ? smallest : i;
            }
        }

        if (sum == 0) {
            sum = -1;
            sb.append(sum);
        } else {
            sb.append(sum).append('\n').append(smallest);
        }
        System.out.print(sb);
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
