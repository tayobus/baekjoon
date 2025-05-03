import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        String [] line = br.readLine().split(" ");

        int M =  Arrays.stream(line).mapToInt(Integer::parseInt).max().getAsInt();
        double avg = Arrays.stream(line).mapToInt(Integer::parseInt).average().getAsDouble();
            
        sb.append(avg*100/M);
        
        System.out.print(sb);
    }
}