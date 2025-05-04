import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int X = Integer.parseInt(br.readLine());

        int line = 1;
        int idx = 1;

        while (idx <= X) {
            idx += line++;
        }
        idx -= --line;

        int diff = X - idx;

        int numerator, denominator;
        if (line % 2 == 0) {
            numerator = 1 + diff;
            denominator = line - diff;
        } else {
            numerator = line - diff;
            denominator = 1 + diff;
        }

        sb.append(numerator).append('/').append(denominator);
        System.out.print(sb);
    }
}
