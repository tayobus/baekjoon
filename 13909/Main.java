import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print((int) Math.sqrt(Integer.parseInt(br.readLine())));
        br.close();
    }
}