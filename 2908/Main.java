import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        /*
        스트링 배열에 br로 A, B 받기
        
        A와 B에 대해서 메서드로 역순 배열
        역순 배열된 거 정수로 변환
        변환한 거 합해서 sb에 append

        문자열 역순 배열 메서드 직접 정의
        */

        String[] strs = br.readLine().split(" ");
        String A = strs[0];
        String B = strs[1];

        int n = Integer.parseInt(reverse(A));
        int m = Integer.parseInt(reverse(B));

        sb.append(Math.max(n, m));
        
        System.out.print(sb);
    }

    private static String reverse(String s) {
        char[] arr = s.toCharArray();
        char temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length-1-i] = temp;
        }
        return new String(arr);
    }
}
