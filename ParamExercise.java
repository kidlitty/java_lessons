public class ParamExercise {
    public void addsMethod(int num1, int num2) {
        int numSum = num1 + num2;
        System.out.println("The sum of " + num1 + " + " + num2 + " is " + numSum);
    }

    public void subtractsMethod(int num1, int num2) {
        int numSum = num1 - num2;
        System.out.println("The difference of " + num1 + " - " + num2 + " is " + numSum);
    }

    public void dividesMethod(int num1, int num2) {
        int numSum = num1 / num2;
        System.out.println("The division of " + num1 + " - " + num2 + " is " + numSum);
    }

    public void compareMethod(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + " is the largest"); 
        }
    }

    public  void longestString(String str1, String str2, String str3) {
        int str1Len = str1.length();
        int str2Len = str2.length();
        int str3Len = str3.length();

        if (str1Len >= str2Len && str1Len >= str3Len) {
            System.out.println(str1 + " is the longest");
        } else if (str2Len >= str1Len && str2Len >= str3Len) {
            System.out.println(str2 + " is the longest");
        } else {
            System.out.println(str3 + " is the longest");
        }
    }

    public static void main(String[] args) {
        ParamExercise obj = new ParamExercise();
        obj.addsMethod(90, 80);
        obj.subtractsMethod(53, 20);
        obj.dividesMethod(58, 6);
        obj.compareMethod(245, 264, 777);
        obj.longestString("Hello World!!", "Hi my name is Uphile", "Im 20 years old");
}

}