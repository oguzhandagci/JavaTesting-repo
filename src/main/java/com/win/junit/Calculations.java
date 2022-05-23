package com.win.junit;


public class Calculations {
    public static void main(String[] args) {
       addition(5,5);
       subtraction(8,3);
       division(21,7);
       multiplication(12,12);

    }

    public static int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public static int division (int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    public static int multiplication(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public static int modulus(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }
}