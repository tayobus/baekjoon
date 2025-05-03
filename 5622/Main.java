import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int sum = 0;
        String str = br.readLine();
        for (char c : str.toCharArray()) {
            sum += char2int(c) + 1;
        }

        sb.append(sum);
        
        System.out.print(sb);
    }

    private static int char2int(char c) {
        String[] strs = {
            "ABC",
            "DEF",
            "GHI",
            "JKL",
            "MNO",
            "PQRS",
            "TUV",
            "WXYZ"
        };
        for (int i = 2; i <= 9; i++) {
            if (strs[i-2].contains(Character.toString(c))) return i;
        }
        return 1;
    }
}
