import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            int input = Integer.parseInt(line);
            char[] chars = new char[(int) Math.pow(3, input)];
            process(chars, 0, chars.length);
            System.out.println(new String(chars));
        }
    }

    static void process(char[] chars, int from, int to) {
        if (to - from <= 1) {
            chars[from] = '-';
            return;
        }

        int third = (to - from) / 3;

        process(chars, from, from + third);

        for (int i = from + third; i < to - third; i++) {
            chars[i] = ' ';
        }

        process(chars, to - third, to);
    }
}
