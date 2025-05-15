import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bubbleSort(arr);

        int sum = 0;
        for (int i : arr) sum += i;
        sb.append(sum/5).append('\n').append(arr[5/2]);

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
