import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int k = Integer.parseInt(meta[1]);

        int[] arr = new int[N];

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        bubbleSort(arr);

        sb.append(arr[N-k]);

        System.out.print(sb);
    }

    static void bubbleSort(int[] arr) {
        int sorted = 0;
        while (sorted < arr.length) {
            for (int j = 0; j < arr.length - sorted - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            sorted++;
        }
    }
}