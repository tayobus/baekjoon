import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] ideal = {1, 1, 2, 2, 2, 8};
        int[] diff = new int[ideal.length];
        int[] current = new int[ideal.length];
        
        String[] line = br.readLine().split(" ");

        for (int i = 0; i < line.length; i++) current[i] = Integer.parseInt(line[i]);

        for (int i = 0; i < current.length; i++) diff[i] = ideal[i] - current[i];

        for (int i = 0; i < diff.length; i++) sb.append(diff[i]).append(' ');
        
        System.out.print(sb);
    }
}
