import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 1; i < N; i++) {
            int sumOfDigits = 0;
            for (char c : Integer.toString(i).toCharArray()) {
                sumOfDigits += Character.getNumericValue(c);
            }
            if (i + sumOfDigits == N) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}
