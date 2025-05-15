import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] exists = new int[2_000_001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            exists[num + 1_000_000]++;
        }

        for (int i = 0; i < 2_000_001; i++) {
            for (int j = 0; j < exists[i]; j++) {
                sb.append(i - 1_000_000).append('\n');
            }
        }

        System.out.print(sb);
        br.close();
    }
}