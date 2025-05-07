import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] sides = new int[3];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 3; i++) {
            sides[i] = Integer.parseInt(input[i]);
        }

        int sum = 0;
        int longest = Integer.MIN_VALUE;
        for (int side : sides) {
            if (longest < side)
                longest = side;
            sum += side;
        }
        if (sum - longest > longest) {
            sb.append(sum);
        } else {
            sb.append(2 * (sum - longest) - 1);
        }

        System.out.print(sb);
    }
}
