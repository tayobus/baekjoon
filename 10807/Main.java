import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String v = br.readLine();

        long count = Arrays.stream(line.split(" ")).filter(s -> s.equals(v)).count();
        sb.append(count).append('\n');
        
        System.out.print(sb);
    }
}