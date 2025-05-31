import java.io.*;

public class Main {

    static int[][] board = new int[9][9];

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        for (int row = 0; row < 9; row++) {
            String[] line = br.readLine().split(" ");
            for (int col = 0; col < 9; col++) {
                board[row][col] = Integer.parseInt(line[col]);
            }
        }

        backtrack(0);
    }

    static boolean backtrack(int idx) throws IOException {

        // 글 읽는 순서로 탐색. 단, 인자로 받은 값부터. 즉 이전에 탐색한 부분 이후부터
        for (int i = idx; i < 9 * 9; i++) {

            // 평탄화된 인덱스를 행렬 좌표로 환산
            int row = i / 9;
            int col = i % 9;

            // 이미 숫자가 할당돼있으면 패스
            if (board[row][col] != 0) {
                continue;
            }

            // 1부터 9까지 숫자 넣어보기
            for (int j = 1; j <= 9; j++) {
                if (isValid(row, col, j)) {
                    board[row][col] = j;
                    backtrack(i + 1);
                    board[row][col] = 0;
                }
            }

            return false;
        }

        // 여기까지 왔다는 것은 판을 다 채웠다는 것이므로 exit
        print();

        return true;
    }

    private static void print() throws IOException {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(board[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        System.exit(0);
    }

    static boolean isValid(int row, int col, int num) {

        // 속한 행과 열에 같은 값이 있는지
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num)
                return false;
        }

        // 근처 9칸 내에 같은 값이 있는지
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[(row / 3) * 3 + i][(col / 3) * 3 + j] == num)
                    return false;
            }
        }

        return true;
    }
}
