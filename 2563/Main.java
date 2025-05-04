import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        boolean[][] board = new boolean[100][100]; // 모두 false로 초기화됨

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    board[x+j][y+k] = true;
                }
            }
        }

        int pixelCount = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (board[i][j]) pixelCount++;
            }
        }

        sb.append(pixelCount);
        System.out.print(sb);
    }
}
