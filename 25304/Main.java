import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long total = sc.nextLong();
        int n = sc.nextInt();

        long calculated = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int ea = sc.nextInt();

            calculated += price * ea;
        } 

        System.out.println(total == calculated ? "Yes" : "No");
    }
}