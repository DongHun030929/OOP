import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            long id = scanner.nextLong();
            String name = scanner.next();
            String major = scanner.next();
            long phone = scanner.nextLong();

            students[i] = new Student(id, name, major, phone);
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        System.out.printf("첫번째 학생: %d %s %s %s\n",
                students[0].getStudentId(),
                students[0].getName(),
                students[0].getMajor(),
                students[0].getFormattedPhoneNumber());

        System.out.printf("두번째 학생: %d %s %s %s\n",
                students[1].getStudentId(),
                students[1].getName(),
                students[1].getMajor(),
                students[1].getFormattedPhoneNumber());

        System.out.printf("세번째 학생: %d %s %s %s\n",
                students[2].getStudentId(),
                students[2].getName(),
                students[2].getMajor(),
                students[2].getFormattedPhoneNumber());

        scanner.close();
    }
}