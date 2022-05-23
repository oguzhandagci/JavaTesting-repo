package com.win.junit;

public class CountToEleven {
    public static void main(String[] args) {

    }

    public static int count(int input) {
        System.out.println("Enter a number less than 11");
        int total = 0;
        while (input <= 11) {
            System.out.println(input);
            total += input++;
        }
        System.out.println(total);
        return total;
    }
}