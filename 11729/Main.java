import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        sb.append((int) Math.pow(2, N) - 1).append('\n');

        move(N, 1, 3);

        System.out.println(sb);
    }

    static void move(int plate, int from, int to) {
        if (plate == 1) {
            sb.append(from).append(' ').append(to).append('\n');
        } else {
            int other = 6 - from - to;
            move(plate - 1, from, other);
            sb.append(from).append(' ').append(to).append('\n');
            move(plate - 1, other, to);
        }
    }
}