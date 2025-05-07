import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] as = br.readLine().split(" ");
        int a1 = Integer.parseInt(as[0]);
        int a0 = Integer.parseInt(as[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if (c - a1 < 0) {
            System.out.print(0);
            return;
        }

        if (a0 <= (c - a1) * n0)
            System.out.print(1);
        else
            System.out.print(0);
    }
}
