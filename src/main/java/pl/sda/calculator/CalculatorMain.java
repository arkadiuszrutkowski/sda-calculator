package pl.sda.calculator;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number = calculator.add(4, 3);
        System.out.println("number = " + number);
    }
}
