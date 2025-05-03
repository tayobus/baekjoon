import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        int distance=1;
        int start =1;
        int end=1;
        while(true) {
            if (start <= N && N <= end) {
                sb.append(distance);
                break;
            }
            start += 1;
            end += 6*distance;
            distance++;
        }
        
        System.out.print(sb);
    }
}
