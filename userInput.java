import java.util.Scanner;

public class userInput {
    public static void main(String [] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("What is your name?: ");

        String userName = obj.nextLine();

        System.out.println("What is your surname");

        String userSurname = obj.nextLine();

        System.out.println("Enter your date of birth (DD/MM/YYYY): ");
        String dateOfBirth = obj.nextLine();

        System.out.println("How far is your favourite store from your home? ");
        double distanceFromStore = obj.nextDouble();

        System.out.println("Hello " + userName + userSurname);

        String birthYear = dateOfBirth.substring(6);

        int age = 2025 - Integer.parseInt(birthYear);

        System.out.println("You are " + age + " years old");
        
        double distanceInMiles = distanceFromStore * 0.62137;

        System.out.println("This is your distance in Miles: " + String.format("%.2f", distanceInMiles) + "mi");

        double distanceInMeters = distanceFromStore * 1000;
        System.out.println("The distance in Meters is: " + String.format("%.2f", distanceInMeters) + "m");

        double ageInSeconds = age * 365 * 24 * 60 * 60;
        System.out.println("Your age in seconds is: " + String.format("%.2f", ageInSeconds) + " seconds");
        
        double ageInMilliSeconds = ageInSeconds * 1000;
        System.out.println("Your age in milliseconds is: " + String.format("%.2f", ageInMilliSeconds) + "ms");

        String hexNum = Double.toHexString(ageInSeconds);
        System.out.println("Your age in hex is: " + hexNum);

        obj.close();
    }
}