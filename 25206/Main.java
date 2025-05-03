import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Set<Assesment> assesments = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            String[] tokens = br.readLine().split(" ");
            Course course = new Course(tokens[0], Float.parseFloat(tokens[1]));
            Grades grade = null;
            for (Grades g : Grades.values()) {
                if (g.grade.equals(tokens[2])) {
                    grade = g;
                    break;
                }
            }
            
            assesments.add(new Assesment(course, grade));
        }

        double numerator = 0;
        double denominator = 0;

        for (Assesment ass : assesments) {
            if (!ass.grade.grade.equals(Grades.P.grade)) {
                numerator += ass.course.credit * ass.grade.score;
                denominator += ass.course.credit;
            }
        }

        sb.append(numerator/denominator);
        
        System.out.print(sb);
    }

    enum Grades {
        AP("A+", 4.5),
        A0("A0", 4.0),
        BP("B+", 3.5),
        B0("B0", 3.0),
        CP("C+", 2.5),
        C0("C0", 2.0),
        DP("D+", 1.5),
        D0("D0", 1.0),
        F("F", 0.0),
        P("P", -1.0); // P는 계산 제외 처리


        public final String grade;
        public final double score;

        Grades(String grade, double score) {
            this.grade = grade;
            this.score = score;
        }
    }

    static class Course {
        public final String name;
        public final float credit;

        Course(String name, float credit) {
            this.name = name;
            this.credit = credit;
        }
    }

    static class Assesment {
        public final Course course;
        public final Grades grade;

        Assesment(Course course, Grades grade) {
            this.course = course;
            this.grade = grade;
        }
    }
}
