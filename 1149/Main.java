import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int dpR = 0, dpG = 0, dpB = 0;
        
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int r = Integer.parseInt(line[0]);
            int g = Integer.parseInt(line[1]);
            int b = Integer.parseInt(line[2]);
            
            int prevR = dpR, prevG = dpG, prevB = dpB;
            dpR = r + Math.min(prevG, prevB);
            dpG = g + Math.min(prevR, prevB);
            dpB = b + Math.min(prevR, prevG);
        }

        int result = Math.min(Math.min(dpR, dpG), dpB);
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
}
