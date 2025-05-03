import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int h = (b + c) / 60;

        b = (b + c) % 60;

        a = (a + h) % 24;

        System.out.println(a + " " + b);

    }
}