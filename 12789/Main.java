import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean possible = true;
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> aux = new Stack<>();

        for (int i = 1; i <= N; i++) {
            if (!aux.isEmpty()) {
                if (aux.peek() == i) {
                    aux.pop();
                    continue;
                }
            }
            boolean found = false;
            while (st.hasMoreTokens()) {
                int next = Integer.parseInt(st.nextToken());
                if (next == i) {
                    found = true;
                    break;
                }
                aux.push(next);
            }
            if (!found) {
                possible = false;
                break;
            }
        }

        sb.append(possible ? "Nice" : "Sad");
        System.out.print(sb);
        br.close();
    }
}
