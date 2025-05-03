import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45) {
            h = (h+23)%24;
            m += 15;
        } else m -= 45;

        System.out.println(h + " " + m);
    }
}