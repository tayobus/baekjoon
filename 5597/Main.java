import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        boolean[] sheet = new boolean[30];

        for (int i = 0; i < 28; i++) sheet[Integer.parseInt(br.readLine()) - 1] = true;

        for (int i = 0; i < 30; i++) if (!sheet[i]) sb.append(i + 1).append('\n');
        
        System.out.print(sb);
    }
}