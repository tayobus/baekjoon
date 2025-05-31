import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            
            switch (command[0]) {
                case "1":
                    deque.offerFirst(Integer.valueOf(command[1]));
                    break;
                case "2":
                    deque.offerLast(Integer.valueOf(command[1]));
                    break;
                case "3":
                    Integer a = deque.pollFirst();
                    sb.append(a == null ? -1 : a).append('\n');
                    break;
                case "4":
                    Integer b = deque.pollLast();
                    sb.append(b == null ? -1 : b).append('\n');
                    break;
                case "5":
                    sb.append(deque.size()).append('\n');
                    break;
                case "6":
                    sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "7":
                    Integer c = deque.peekFirst();
                    sb.append(c == null ? -1 : c).append('\n');
                    break;
                case "8":
                    Integer d = deque.peekLast();
                    sb.append(d == null ? -1 : d).append('\n');
                    break;
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}
