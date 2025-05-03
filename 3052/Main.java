import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        TreeSet<Integer> remainders = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            remainders.add(n % 42);
        }

        sb.append(remainders.size());
        
        System.out.print(sb);
    }
}