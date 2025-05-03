import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().trim().split(" ");
        String nStr = input[0];
        int B = Integer.parseInt(input[1]);

        double result = 0;

        char[] nChars = nStr.toCharArray();
        for (int i = 0; i < nChars.length ; i++) {
            int digit;
            if (Character.isAlphabetic(nChars[nChars.length -1 -i])) digit = alphabet2num(nChars[nChars.length - 1 -i]);
            else digit = Character.getNumericValue(nChars[nChars.length -1-i]);
            result += digit * Math.pow(B, i);
        }
        sb.append(new BigDecimal(result).toPlainString());
        
        System.out.print(sb);
    }

    static int alphabet2num(char c) {
        int result;
        result = c - 'A' + 10;
        return result;
    }
}
