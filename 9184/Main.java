import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {
                for (int k = 0; k <= 20; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        StringTokenizer st;
        int a, b, c;
        while (true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1)
                break;

            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(fn(a, b, c)).append("\n");
        }
        
        System.out.print(sb);
    }

    static int fn(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return 1;

        if (a > 20 || b > 20 || c > 20)
            return fn(20, 20, 20);

        if (dp[a][b][c] != -1)
            return dp[a][b][c];

        if (a < b && b < c) {
            dp[a][b][c] = fn(a, b, c - 1) + fn(a, b - 1, c - 1) - fn(a, b - 1, c);
        } else {
            dp[a][b][c] = fn(a - 1, b, c) + fn(a - 1, b - 1, c) + fn(a - 1, b, c - 1) - fn(a - 1, b - 1, c - 1);
        }

        return dp[a][b][c];
    }
}
