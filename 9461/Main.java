import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static long[] sides = new long[101];
    
    public static void main(String[] args) throws IOException {

        sides[1] = 1;
        sides[2] = 1;
        sides[3] = 1;
        sides[4] = 2;
        sides[5] = 2;

        for (int i = 6; i < 101; i++) {
            sides[i] = sides[i-1] + sides[i-5];
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            bw.write(sides[Integer.parseInt(br.readLine())] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
