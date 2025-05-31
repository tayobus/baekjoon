import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        Set<String> infected = new HashSet<>();
        infected.add("ChongChong");

        for (int i = 0; i < N; i++) {
            String[] interaction = br.readLine().split(" ");
            if (infected.contains(interaction[0]) || infected.contains(interaction[1])) {
                infected.add(interaction[0]);
                infected.add(interaction[1]);
            }
        }

        sb.append(infected.size());
        
        System.out.print(sb);
    }
}
