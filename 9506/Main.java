import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1)
                break;
            else
                sb.append(n);

            List<Integer> factors = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    factors.add(i);
                }
            }
            int sum = 0;
            for (int i : factors) {
                sum += i;
            }
            if (sum == n) {
                sb.append(" = ");
                for (int i : factors) {
                    sb.append(i).append(" + ");
                }
                sb.delete(sb.length() - 3, sb.length());
            } else {
                sb.append(" is NOT perfect.");
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}