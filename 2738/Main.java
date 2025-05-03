import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        int[][] mat1 = readMat(br, N,M);
        int[][] mat2 = readMat(br, N,M);

        int[][] sum = new int[N][M];
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                sb.append(sum[i][j]).append(' ');
            }
            sb.append('\n');
        }
        
        System.out.print(sb);
    }

    static int[][] readMat(BufferedReader br, int row, int col) throws IOException {
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < col; j++) result[i][j] = Integer.parseInt(line[j]);
        }
        return result;
    }
}
