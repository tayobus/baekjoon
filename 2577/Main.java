import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        String result = Integer.toString(A*B*C);
        int[] counts = new int[10];

        for (char c : result.toCharArray()) {
            counts[Character.getNumericValue(c)] += 1;
        }
        for (int i : counts) sb.append(i).append('\n');
        
        System.out.print(sb);
    }
}
