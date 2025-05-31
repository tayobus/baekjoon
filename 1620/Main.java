import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            
            String[] meta = br.readLine().split(" ");
            int N = Integer.parseInt(meta[0]);
            int M = Integer.parseInt(meta[1]);
            
            String[] idxToStr = new String[N];
            Map<String, Integer> strToIdx = new HashMap<>();
            
            for (int i = 0; i < N; i++) {
                idxToStr[i] = br.readLine();
                strToIdx.put(idxToStr[i], i);
            }

            for (int i = 0; i < M; i++) {
                String quiz = br.readLine();
                try {
                    sb.append(idxToStr[Integer.parseInt(quiz) - 1]);
                } catch (NumberFormatException e) {
                    sb.append(strToIdx.get(quiz) + 1);
                }
                sb.append('\n');
            }
            
            System.out.print(sb);
        }
    }
}
