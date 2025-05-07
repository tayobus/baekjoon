import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int fives = N / 5; fives >= 0; fives--) {
            int remainder = N - fives * 5;
            if (remainder % 3 == 0) {
                System.out.print(fives + remainder / 3);
                return;
            }
        }
        
        System.out.print(-1);
    }
}
