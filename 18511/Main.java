import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int ans, N, K;
    static int[] nums;

    public static void main(String[] args) throws IOException {

        String[] meta = br.readLine().split(" ");
        N = Integer.parseInt(meta[0]);
        K = Integer.parseInt(meta[1]);

        String[] line = br.readLine().split(" ");
        nums = new int[K];
        for (int i = 0; i < K; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(nums);

        recurse(0);

        bw.write(Integer.toString(ans));

        bw.flush();
        bw.close();
    }

    static void recurse(int current) {
        if (current > N) {
            return;
        }

        if (ans < current) {
            ans = current;
        }

        for (int i = K - 1; i >= 0; i--) {
            recurse(10*current + nums[i]);
        }
    }
}
