import java.io.*;

public class Main {
    static int count = 0, dest = 0, result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        dest = Integer.parseInt(meta[1]);
        String[] line = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        br.close();

        mergeSort(arr, 0, N - 1);

        sb.append(result);

        System.out.print(sb);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int left, int middle, int right) {
        int i = left;
        int j = middle + 1;
        int t = 0;
        int[] sorted = new int[right - left + 1];

        while (i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                sorted[t++] = arr[i++];
            } else {
                sorted[t++] = arr[j++];
            }
        }

        while (i <= middle) {
            sorted[t++] = arr[i++];
        }
        while (j <= right) {
            sorted[t++] = arr[j++];
        }

        i = left;
        t = 0;
        while (i <= right) {
            arr[i++] = sorted[t++];
            if (++count == dest) {
                result = arr[i - 1];
            }
        }
    }
}
