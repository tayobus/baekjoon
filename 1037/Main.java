import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            int factor = Integer.parseInt(line[i]);
            max = Math.max(max, factor);
            min = Math.min(min, factor);
        }
        sb.append(max * min);

        System.out.print(sb);
    }
}
