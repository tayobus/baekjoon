import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String digits = br.readLine();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Character.getNumericValue(digits.charAt(i));
        }

        sb.append(sum);
        
        System.out.print(sb);
    }
}