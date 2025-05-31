import java.io.*;

public class Main {

    static int N, count = 0;
    static int cols[]; // cols[row]는 i번째 행에 퀸이 배치된 열을 나타냄.

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        br.close();

        cols = new int[N];

        recurse(0);

        System.out.print(count);
    }

    static void recurse(int nth) {

        if (nth == N) {
            count++;
            return;
        }

        for (int row = 0; row < N; row++) {
            cols[nth] = row;
            if (isValid(nth))
                recurse(nth + 1);
        }

    }

    static boolean isValid(int nth) {

        for (int row = 0; row < nth; row++)
            if (cols[row] == cols[nth] || Math.abs(nth - row) == Math.abs(cols[nth] - cols[row]))
                return false;
        return true;

    }

}
