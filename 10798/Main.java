import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        char[][] input = new char[5][15];

        for (int i=0;i<5;i++) {
            input[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= input[j].length) continue;
                sb.append(input[j][i]);
            }
        }
        
        System.out.print(sb);
    }
}
