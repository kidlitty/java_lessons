public class SuperCar {
    String color;

    public SuperCar(String color) {
        this.color = color;
    }

    public void showColor() {
        System.out.println("This super car is "+color);
    }
}

public class Main {
    public static void main(String[] args) {
        SuperCar car1 = new SuperCar("red");
        SuperCar car2 = new SuperCar("blue");
        SuperCar car3 = new SuperCar("Black")

        car1.showColor();
        car2.showColor();
        car3.showColor();
    }
}