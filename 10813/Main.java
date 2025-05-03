import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        int[] buckets = new int[N];
        for (int i = 1; i <= N; i++) buckets[i-1] = i;

        for (int index = 1; index <= M; index++) {
            String[] line = br.readLine().split(" ");
            int i = Integer.parseInt(line[0]);
            int j = Integer.parseInt(line[1]);
            swap(buckets, i - 1, j - 1);
        }
        
        for (int i = 0; i < N; i++) sb.append(buckets[i]).append(' ');
        sb.append('\n');
        System.out.print(sb);
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
}