import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int ascii = (int) br.readLine().charAt(0);
        sb.append(ascii);
        
        System.out.print(sb);
    }
}