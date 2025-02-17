public class BreakTest3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < 3) {
            System.out.println("outer:" + i);
            i++;
            while (j < 3) {
                System.out.println("inner:" + j);
                j++;
                while (k < 3) {
                    System.out.println("innest:" + k);
                    k++;
                }
            }
        }
    }
}
