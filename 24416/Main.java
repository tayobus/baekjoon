import java.io.*;

public class Main {

    static int rCount = 0, dCount = 0;
    static int[] dpArr;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        dpArr = new int[N + 1];
        dpArr[0] = 1;
        dpArr[1] = 1;

        recurse(N);
        dynamic(N);

        bw.write(rCount + " " + dCount);
        bw.flush();
        bw.close();
    }

    static int recurse(int n) {
        if (n < 3) {
            rCount++;
            return 1;
        } else {
            return recurse(n - 1) + recurse(n - 2);
        }
    }

    static int dynamic(int n) {
        for (int i = 3; i <= n; i++) {
            dCount++;
            dpArr[n] = dpArr[n - 1] + dpArr[n - 2];
        }
        return dpArr[n];
    }
}
