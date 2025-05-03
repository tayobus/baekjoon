import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int mat[][] = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String[] tokens = br.readLine().split(" ");
            for (int j = 0; j < 9; j++)
                mat[i][j] = Integer.parseInt(tokens[j]);
        }

        int max = 0;
        int maxRow = 1;
        int maxCol = 1;
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (max < mat[i][j]) {
                    max = mat[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }

        sb.append(max).append('\n').append(maxRow).append(' ').append(maxCol);

        System.out.print(sb);
    }
}
