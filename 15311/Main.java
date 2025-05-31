import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.println(2000);
        
        for (int i = 0; i < 1000; i++) {
            System.out.print(1 + " ");
        }
        
        for (int i = 0; i < 1000; i++) {
            System.out.print(1000);
            if (i < 999) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}