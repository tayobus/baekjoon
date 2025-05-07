import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        String[] nums = br.readLine().split(" ");

        for (String num1 : nums) {
            int num = Integer.parseInt(num1);
            if (num == 1) {
                N--;
                continue;
            }
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    N--;
                    break;
                }
            }
        }

        sb.append(N);
        
        System.out.print(sb);
    }
}
