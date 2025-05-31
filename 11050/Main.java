import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        sb.append(permutation(N, K) / fact(K));

        System.out.print(sb);
    }

    static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int permutation(int n, int m) {
        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n--;
        }
        return result;
    }
}
