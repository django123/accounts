package io.django.accounts;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Sum of 3 and 5 is " + calculate("+", 3, 5));
    }
    /**
     * This method performs an arithmetic operation on two numbers.
     *
     * @param op
     *            The operation to be performed. The possible values are '+',
     *            '-', '*', '/'
     * @param num1
     *            The first number
     * @param num2
     *            The second number
     * @return The result of the operation
     * @throws ArithmeticException
     *             If the operation is '/' and num2 is 0
     */
    public static double calculate(String op, double num1, double num2)
            throws ArithmeticException {
        switch (op) {
        case "+":
            return num1 + num2;
        case "-":
            return num1 - num2;
        case "*":
            return num1 * num2;
        case "/":
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return num1 / num2;
        default:
            throw new ArithmeticException("Unknown operator: " + op);
        }
    }

}
