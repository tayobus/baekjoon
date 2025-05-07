import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int best = 0;

        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        int[] cards = new int[N];
        String[] cardStrs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) cards[i] = Integer.parseInt(cardStrs[i]);
        
        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (best < sum && sum <= M) best = sum;
                }
            }
        }

        sb.append(best);
        
        System.out.print(sb);
    }
}
