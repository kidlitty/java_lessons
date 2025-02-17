public class AssertTest2 {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 4;

        boolean aTest = a > 0 ? true : false;
        boolean bTest = b > 10 ? true : false;

        assert aTest : "a must be greater than 0";
        assert bTest : "b must be greater than 10";

        System.out.println("Finished");
    }
}
