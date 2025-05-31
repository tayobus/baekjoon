import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] numberInBalloon = new int[N];
        for (int i = 0; i < N; i++) {
            numberInBalloon[i] = Integer.parseInt(line[i]);
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int move = 1;
        while (!deque.isEmpty()) {
            int chosen = 0;
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
                chosen = deque.pollFirst();
            } else if (move < 0) {
                for (int i = 0; i < -1 * move - 1; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                chosen = deque.pollLast();
            }
            sb.append(chosen).append(' ');
            move = numberInBalloon[chosen - 1];
        }

        System.out.print(sb);
        br.close();
    }
}