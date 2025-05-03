import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[] sum = new int[T];
        for (int i = 0; i < T; i++) {
            int streak = 0;
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'O') streak++;
                else streak = 0;
                sum[i] += streak;
            }
        }

        for (int i : sum) sb.append(i).append('\n');   
        System.out.print(sb);
    }
}
