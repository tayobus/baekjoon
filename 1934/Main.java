import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] line = br.readLine().split(" ");
            int A = Integer.parseInt(line[0]);
            int B = Integer.parseInt(line[1]);
            sb.append(getCM(A, B)).append('\n');
        }

        System.out.print(sb);
        br.close();
    }

    static int getCM(int A, int B) {
        int product = 1;
        boolean foundCommon = true;

        while (foundCommon) {
            foundCommon = false;
            for (int i = 2; i <= Math.min(A, B); i++) {
                if (A % i == 0 && B % i == 0) {
                    A /= i;
                    B /= i;
                    product *= i;
                    foundCommon = true;
                    break;
                }
            }
        }

        return product * A * B;
    }
}
