public class DoWhileTest1 {
    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println("Counter = " + counter);
            counter += 2;
        } while (counter < 10);
    }
}
