import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] coordinates = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(coordinates[0]);
            arr[i][1] = Integer.parseInt(coordinates[1]);
        }

        bubbleSort(arr);

        for (int[] xy : arr) {
            sb.append(xy[0]).append(' ').append(xy[1]).append('\n');
        }

        System.out.print(sb);
        br.close();
    }

    static void bubbleSort(int[][] arr) {
        for (int sorted = 0; sorted < arr.length; sorted++) {
            for (int target = 0; target < arr.length - sorted - 1; target++) {
                if (arr[target][0] > arr[target + 1][0]
                        || (arr[target][0] == arr[target + 1][0] && arr[target][1] > arr[target + 1][1])) {
                    int[] tmp = arr[target];
                    arr[target] = arr[target + 1];
                    arr[target + 1] = tmp;
                }
            }
        }
    }
}
