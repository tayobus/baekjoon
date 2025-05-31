import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        int maxSum = Integer.parseInt(line[0]);
        int currentSum = maxSum;
        
        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(line[i]);
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.print(maxSum);
    }
}
