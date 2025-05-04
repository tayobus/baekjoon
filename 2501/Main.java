import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) factors.add(i);
        }

        if (factors.size() < K) {
            sb.append(0);
        }
        else {
            sb.append((int)factors.get(K-1));
        }
        
        System.out.print(sb);
    }
}
