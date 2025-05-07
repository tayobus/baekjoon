import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] meta = br.readLine().split(" ");
        int N = Integer.parseInt(meta[0]);
        int M = Integer.parseInt(meta[1]);

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;
        // 체스판의 좌상단 칸 좌표 브루트 포스 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 8x8 범위의 재채색 필요 칸수 계산
                char[] colors = { 'W', 'B' };
                for (int tmp = 0; tmp < colors.length; tmp++) {
                    int cnt = 0;
                    for (int k = i; k < i + 8; k++) {
                        for (int l = j; l < j + 8; l++) {
                            if (board[k][l] != colors[tmp]) {
                                cnt++;
                            }
                            tmp = ++tmp % colors.length;
                        }
                        tmp = ++tmp % colors.length;
                    }
                    if (min > cnt)
                        min = cnt;
                }
            }
        }
        sb.append(min);
        System.out.print(sb);
    }
}
