import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // 도화지의 크기
        final int BOARD_SIZE = 100;
        // 색종이의 크기
        final int PAPER_SIZE = 10;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 색종이의 수
        int n = Integer.parseInt(br.readLine().trim());
        
        // 1차원 배열로 도화지 표현 (메모리 접근 최적화)
        boolean[] board = new boolean[BOARD_SIZE * BOARD_SIZE];
        
        // 각 색종이 처리
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            // 색종이가 덮는 영역 표시
            for (int dx = 0; dx < PAPER_SIZE; dx++) {
                int pos = (x + dx) * BOARD_SIZE + y;
                for (int dy = 0; dy < PAPER_SIZE; dy++) {
                    board[pos + dy] = true;
                }
            }
        }
        
        // 검은 영역의 넓이 계산 (단순 카운팅)
        int area = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i]) {
                area++;
            }
        }
        
        System.out.println(area);
    }
}