package com.win.junit;
import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dividend");
        double firstInput = scanner.nextDouble();
        System.out.println("Divisor");
        double secondInput = scanner.nextDouble();
        division(firstInput, secondInput);
    }
    public static double division(double number1, double number2) {
        System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
    return number1 /number2;
    }
}