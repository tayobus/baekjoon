import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        br.readLine();

        Set<Integer> mycards = new HashSet<>();

        String[] line = br.readLine().split(" ");
        for (String s : line) {
            mycards.add(Integer.valueOf(s));
        }

        br.readLine();

        line = br.readLine().split(" ");
        for (String s : line) {
            sb.append(mycards.contains(Integer.valueOf(s)) ? 1 : 0).append(' ');
        }

        System.out.print(sb);
        br.close();
    }
}
