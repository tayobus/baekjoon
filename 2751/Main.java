import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        // 수의 범위가 -1,000,000 ~ 1,000,000이므로 배열 크기를 2,000,001로 설정
        // 인덱스 0은 -1,000,000에, 인덱스 1,000,000은 0에, 인덱스 2,000,000은 1,000,000에 대응
        boolean[] exists = new boolean[2_000_001];
        
        // 각 수의 존재 여부를 표시
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            exists[num + 1_000_000] = true;  // 음수를 인덱스로 사용하기 위한 오프셋
        }
        
        // 존재하는 수를 오름차순으로 출력
        for (int i = 0; i < 2_000_001; i++) {
            if (exists[i]) {
                sb.append(i - 1_000_000).append('\n');
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}