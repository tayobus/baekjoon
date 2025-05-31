import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Set<String> attendance = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            String name = line[0];
            String el = line[1];

            switch (el) {
                case "enter":
                    attendance.add(name);
                    break;
                case "leave":
                    attendance.remove(name);
                    break;
            }
        }

        for (String name : attendance) {
            sb.append(name).append('\n');
        }

        System.out.print(sb);
        br.close();
    }
}
