import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int reward;

        if (a==b && b==c) reward = 10000 + 1000*a;
        else if (a==b) reward = 1000 + 100*a;
        else if (b==c) reward = 1000 + 100*b;
        else if (c==a) reward = 1000 + 100*c;
        else reward = 100 * Collections.max(List.of(a, b, c));

        System.out.println(reward);
    }
}