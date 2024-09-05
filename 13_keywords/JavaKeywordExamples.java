public class JavaKeywordExamples {
    public static void main(String[] args){

    char luckyNumber = '7';
    int age = 25;
    int moneyInBank = 584;
    int ps5Price = 499;
    String name = "Uphile";
    String surname = "Ntuli";

        System.out.println("My name is " + name + " " + surname + " I am " + age + " years old and i wanna buy a ps5 my luckyNumber is " + luckyNumber);
        System.out.println("I think i have around $" + moneyInBank + " and a ps5 is like $" + ps5Price);
        if (moneyInBank >= ps5Price) {
            System.out.println("I can afford to buy the ps5"); }
            else {
                System.out.println("Im too broke and need to start grinding");
        }
        
        double moneyLeft = moneyInBank - ps5Price;

        if (moneyLeft < 0) {
            System.out.println("I still need $" + moneyLeft);
        }   else if (moneyLeft > 0) {
            System.out.println("At least i still have $" + moneyLeft);
        }   else {
            System.out.println("Im completely broke now");
        }

    }
}