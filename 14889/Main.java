import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] S;
    static int minDiff = Integer.MAX_VALUE;
    static boolean[] selected;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        S = new int[N][N];
        selected = new boolean[N];
        
        // 능력치 배열 입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        selected[0] = true;
        // 조합 생성 시작 (N명 중 N/2명 선택)
        combination(1, 1);
        
        System.out.println(minDiff);
    }
    
    // depth: 현재까지 선택한 사람 수, start: 선택을 시작할 인덱스
    static void combination(int depth, int start) {
        // N/2명을 모두 선택했다면 팀 나누기 완료
        if (depth == N / 2) {
            calculateDifference();
            return;
        }
        
        // start부터 N-1까지 중에서 선택
        for (int i = start; i < N; i++) {
            selected[i] = true;           // i번 사람을 스타트팀에 선택
            combination(depth + 1, i + 1); // 다음 사람 선택
            selected[i] = false;          // 백트래킹
        }
    }
    
    // 두 팀의 능력치 차이 계산
    static void calculateDifference() {
        List<Integer> startTeam = new ArrayList<>();
        List<Integer> linkTeam = new ArrayList<>();
        
        // 선택된 사람은 스타트팀, 선택되지 않은 사람은 링크팀
        for (int i = 0; i < N; i++) {
            if (selected[i]) {
                startTeam.add(i);
            } else {
                linkTeam.add(i);
            }
        }
        
        // 각 팀의 능력치 계산
        int startPower = getTeamPower(startTeam);
        int linkPower = getTeamPower(linkTeam);
        
        // 능력치 차이의 절댓값 계산
        int diff = Math.abs(startPower - linkPower);
        minDiff = Math.min(minDiff, diff);
    }
    
    // 팀의 능력치 계산
    static int getTeamPower(List<Integer> team) {
        int power = 0;
        
        // 팀 내 모든 쌍에 대해 능력치 합산
        for (int i = 0; i < team.size(); i++) {
            for (int j = i + 1; j < team.size(); j++) {
                int a = team.get(i);
                int b = team.get(j);
                power += S[a][b] + S[b][a];
            }
        }
        
        return power;
    }
}