import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = obj.nextLine();
        System.out.println("Enter your surname: ");
        String userSurname = obj.nextLine();
        System.out.println("You are " + userName.trim() + " " + userSurname.trim());
    }
}