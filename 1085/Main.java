import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");

        int[] distances = new int[4];

        distances[0] = Integer.parseInt(input[0]);
        distances[1] = Integer.parseInt(input[1]);
        distances[2] = Integer.parseInt(input[2]) - distances[0];
        distances[3] = Integer.parseInt(input[3]) - distances[1];

        int nearest = 1000;

        for (int distance : distances)
            nearest = nearest < distance ? nearest : distance;

        sb.append(nearest);

        System.out.print(sb);
    }
}
