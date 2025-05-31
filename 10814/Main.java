import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < N ; i++) {
            String[] line = br.readLine().split(" ");
            members.add(new Member(i, Integer.parseInt(line[0]), line[1]));
        }

        Collections.sort(members, (member1, member2) -> {
            if (member1.age == member2.age) {
                return Integer.compare(member1.order, member2.order);
            } else {
                return Integer.compare(member1.age, member2.age);
            }
        });

        for (Member member : members) {
            sb.append(member.age).append(' ').append(member.name).append('\n');
        }
        
        System.out.print(sb);
        br.close();
    }

    static class Member {
        int order;
        int age;
        String name;

        Member(int order, int age, String name) {
            this.order = order;
            this.age = age;
            this.name = name;
        }
    }
}
