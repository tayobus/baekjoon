import java.io.*;

public class Main {
    static boolean[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());

        br.close();

        arr = new boolean[size][size];

        process(size, 0, 0);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                bw.write(arr[i][j] ? ' ' : '*');
            }
            bw.write('\n');
        }

        bw.flush();
        bw.close();
    }

    static void process(int size, int row, int col) {
        if (size == 1)
            return;
        int N = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == 1 && j == 1) {
                    for (int k = 0; k < N; k++) {
                        for (int l = 0; l < N; l++) {
                            arr[row + N + k][col + N + l] = true;
                        }
                    }
                }

                else {
                    process(N, row + i * N, col + j * N);
                }

            }
        }
    }
}