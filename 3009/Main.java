import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Set<Integer> Xs = new HashSet<>();
        Set<Integer> Ys = new HashSet<>();

        for (int i = 0; i<3;i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            if (Xs.contains(x)) Xs.remove(x);
            else Xs.add(x);
            if (Ys.contains(y)) Ys.remove(y);
            else Ys.add(y);
        }

        sb.append(Xs.iterator().next()).append(' ').append(Ys.iterator().next());
        
        System.out.print(sb);
    }
}
