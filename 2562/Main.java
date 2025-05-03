import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int max = Integer.MIN_VALUE;
        int index = 1;

        for (int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > max) {
                max = n;
                index = i;
            }
        }

        sb.append(max).append('\n').append(index).append('\n');
        
        System.out.print(sb);
    }
}