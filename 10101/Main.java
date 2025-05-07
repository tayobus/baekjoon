import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> angles = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            int angle = Integer.parseInt(br.readLine());
            sum += angle;
            angles.add(angle);
        }

        if (sum != 180) {
            System.out.print("Error");
            return;
        }

        switch (angles.size()) {
            case 1:
                System.out.print("Equilateral");
                break;
            case 2:
                System.out.print("Isosceles");
                break;
            case 3:
                System.out.print("Scalene");
                break;
        }
    }
}