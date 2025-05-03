import java.io.*;
import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        List<Integer> nums = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int min = Collections.min(nums);
        int max = Collections.max(nums);

        sb.append(min).append(' ').append(max);
        
        System.out.print(sb);
    }
}