import java.util.Scanner;


public class NameAndGradeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();
        
        System.out.println("Enter your grade:");
        int grade = input.nextInt();

        String juniorPrimaryTeacher = "Mrs Rose";
        String seniorPrimaryTeacher = "Mr Robert";
        String juniorHighTeacher = "Mr Einstein";
        String seniorHighTeacher = "Miss Gabby";

        char block = '0';

        if (grade > 0 && grade <= 4) {
            block = 'B';

            System.out.println(" Hi " + name + " you are a Junior in Primary School and your teacher is " + juniorPrimaryTeacher + ", you are in block " + block);

        } else if (grade >= 5 && grade <= 7) {
            block = 'B';

            System.out.println("Hi " + name + " you are a Senior in Primary School and your teacher is " + seniorPrimaryTeacher + ", you are in block " + block);

        } else if (grade >= 8 && grade <= 9) {
            block = 'A';

            System.out.println("Hi " + name + " you are a Junior in High School and your teacher is " + juniorHighTeacher + ", you are in block " + block);

        } else if (grade >= 10 && grade <= 12) {
            block = 'A';

            System.out.println("Hi " + name + " you are a Senior in High School and your teacher is " + seniorHighTeacher + ", you are in block " + block);
        } else if (grade > 12 || name == "") {
            System.out.println("Invalid Input");
        }
    }
}
