import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        int[] buckets = new int[N];
        for (int i = 1; i <= N; i++) buckets[i-1] = i;

        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            buckets = invert(buckets, a - 1, b - 1);
        }

        for (int e : buckets) sb.append(e).append('\n');
        
        System.out.print(sb);
    }

    private static int[] invert(int[] arr, int i, int j) {
        int[] retArr = Arrays.copyOf(arr, arr.length);
        for (int k = i; k <= j; k++) {
            retArr[k] = arr[j - k + i];
        }
        return retArr;
    }
}