package student;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        System.out.println("***********************************");
        System.out.println(" \t Student Details \t");
        System.out.println("***********************************");

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name : ");
        student.setName(scanner.nextLine());

        System.out.println("Enter email : ");
        student.setEmail(scanner.next());

        System.out.println("Enter the gender : ");
        student.setGender(scanner.next().charAt(0));

        System.out.println("Name - " + student.getName());
        System.out.println("Email - " + student.getEmail());
        System.out.println("Gender - " + student.getGender());

    }

}
