package com.careerit.jfs.day1;

public class Factorialofnumber {
    public static void main(String[] args) {
        int num = 5;
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        System.out.println(String.format("Factorial of %s is %s",num,res));
    }
}
