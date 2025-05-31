import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static final String[] MESSAGES = {
        "\"재귀함수가 뭔가요?\"",
        "\"재귀함수는 자기 자신을 호출하는 함수라네\"",
        "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.",
        "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.",
        "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"",
        "라고 답변하였지."
    };

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        br.close();

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append('\n');
        recurse(N);
        System.out.print(sb);
    }

    static void recurse(int r) {
        printLine(r, MESSAGES[0]);
        
        if (r == 0) {
            printLine(r, MESSAGES[1]);
        } else {
            for (int i = 2; i <= 4; i++) {
                printLine(r, MESSAGES[i]);
            }
            recurse(r - 1);
        }
        
        printLine(r, MESSAGES[5]);
    }
    
    static void printLine(int recursionLevel, String message) {
        StringBuilder indentBuilder = new StringBuilder();
        int indentCount = N - recursionLevel;
        for (int i = 0; i < indentCount; i++) {
            indentBuilder.append("____");
        }
        sb.append(indentBuilder).append(message).append('\n');
    }
}
