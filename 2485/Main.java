import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        
        int gcd = trees[1] - trees[0];
        for (int i = 2; i < N; i++) {
            gcd = getGcd(gcd, trees[i] - trees[i - 1]);
        }

        int totalTrees = (trees[N - 1] - trees[0]) / gcd + 1;
        int needToPlant = totalTrees - N;
        
        System.out.print(needToPlant);
        br.close();
    }

    static int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}