package CalculatorTwo;

public class Operations {
    public static int arithmeticOperations(int arab, int arab1, String sign) {

        int n = 0;

        switch (sign) {
            case "+":
                n = arab + arab1;
                break;
            case "_":
                n = arab - arab1;
                break;
            case "*":
                n = arab * arab1;
                break;
            case "/":
                n = arab / arab1;
                break;
            default:
                System.out.println("Don`t right sign");

        }
        return n;
    }
}
