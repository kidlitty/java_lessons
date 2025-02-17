import java.util.Scanner;

public class MethodsAssignment {
    public void printRoses(){
        String poem = "Roses are red \nViolets are blue \nSugar is sweet \nAnd so are you";
        String author = "-Edmund Spenser";
        String title = "Roses Are Red";

        System.out.println(title);
        System.out.println();
        System.out.println(poem);
        System.out.println(author);

    }
    public void printMrWH() {
        String title = "Mr WH";
        String author = "William Shakespeare";
        String sonnet = "TO.THE.ONLIE.BEGETTER.OF. \n THESE.INSUING.SONNETS. \nMr.W.H ALL.HAPPINESSE. \nAND.THAT.ETERNITIE. \nPROMISED. \nBY. \nOUR.EVER.LIVING.POET. \nWISHETH. \nTHE.WELL-WISHING. \nADVENTURER.IN. \nSETTING. \nFORTH. \n \nT.T.";

        System.out.println(title);
        System.out.println(author);
        System.out.println();
        System.out.println(sonnet);
    }
    public void printGrandchildGuide() {
        String title = "A Grandchild's Guide to Using Grandpa's Computer";
        String author = "Gene Ziegler";
        String poem = "If a packet hits a pocket on a socket on a port \nAnd the bus is interrupted as a very last resort \nAnd the address of the memory makes your floopy disk abort \nThe the socket packet pocket has an error to report!";

        System.out.println(title);
        System.out.println(author);
        System.out.println();
        System.out.println(poem);

    }
    public static void main(String[] args) {
        MethodsAssignment obj = new MethodsAssignment();
        
        System.out.println("Please type a poem you would like to view: \nRoses Are Red \nMr.WH \nA Grandchild's Guide to Using Grandpa's Computer");

        Scanner obj2 = new Scanner(System.in);
        String userInput = obj2.nextLine();
        
        if (userInput.equals("Roses Are Red")) {
            obj.printRoses();
        } else if (userInput.equals("Mr.WH")) {
            obj.printMrWH();
        } else if (userInput.equals("A Granchild's Guide to Using Grandpa's Computer")) {
            obj.printGrandchildGuide();
        } else {
            System.out.println("Invalid Input.");
        }
    }
}