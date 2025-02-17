import java.util.Scanner;

public class ReturnTypes {
    Scanner obj = new Scanner(System.in);

    public void printOutcome() {
        System.out.println("Hello World!");
    }

    public void getInput() {
        System.out.println("What is your name?");
        String userInput = obj.nextLine();
        System.out.println("Your name is " + userInput);
    }

    public void parameters(String country, String continent) {
        System.out.println("What is your favourite country and which continent is it on?");
        System.out.print("Your country and continent are " + country + ", " + continent);
    }

    public static void main(String[] args) {
        ReturnTypes obj = new ReturnTypes();
        obj.printOutcome();
        obj.getInput();
        obj.parameters("Brazil", "South America");
        
    }

}