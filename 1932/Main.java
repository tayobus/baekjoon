import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        int[][] triangle = new int[N][];
        triangle[0] = new int[1];
        triangle[0][0] = Integer.parseInt(br.readLine());

        for (int level = 1; level < N; level++) {

            triangle[level] = new int[level + 1];
            String[] line = br.readLine().split(" ");

            triangle[level][0] = Integer.parseInt(line[0]) + triangle[level - 1][0];
            for (int i = 1; i < level; i++) {
                triangle[level][i] = Integer.parseInt(line[i])
                        + Math.max(triangle[level - 1][i - 1], triangle[level - 1][i]);
            }
            triangle[level][level] = Integer.parseInt(line[level]) + triangle[level - 1][level - 1];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, triangle[N - 1][i]);
        }

        System.out.println(max);
    }
}
