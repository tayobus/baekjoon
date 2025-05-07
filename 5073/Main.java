import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Set<Integer>> triangles = new ArrayList<>();

        while (true) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);

            if (a == 0 && b == 0 && c == 0) break;

            Set<Integer> sides = new HashSet<>();
            if (!isPolygon(a, b, c)) sides.add(-1);
            else {
                sides.add(a);
                sides.add(b);
                sides.add(c);
            }
            triangles.add(sides);
        }

        for (Set<Integer> sides : triangles) {
            if (sides.contains(-1)) {
                System.out.println("Invalid");
                continue;
            }
    
            switch (sides.size()) {
                case 1:
                    System.out.println("Equilateral");
                    break;
                case 2:
                    System.out.println("Isosceles");
                    break;
                case 3:
                    System.out.println("Scalene");
                    break;
            }
        }
    }

    static boolean isPolygon(int a, int b, int c) {
        int[] sides = {a,b,c};
        int sum = 0;
        int longest = Integer.MIN_VALUE;
        for (int side : sides) {
            if (longest < side) longest = side;
            sum += side;
        }
        return sum - longest > longest;
    }
}