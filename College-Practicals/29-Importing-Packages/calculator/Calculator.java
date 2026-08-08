package calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void displayResult(int a, int b) {
        System.out.println("Addition: " + add(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
    }
}
