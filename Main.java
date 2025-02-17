public class Main {
    public static void main(String[] args) {
        int option = 2;

        switch (option) {
            case 1: {
                System.out.println("Option is not 1");
            } break;
            case 2: {
                System.out.println("Option is not 2");
            } break;
            case 3: {
                System.out.println("Option is 3");
            }
            default: {
                System.out.println("Option is not 3");
            }
        }
    }
}