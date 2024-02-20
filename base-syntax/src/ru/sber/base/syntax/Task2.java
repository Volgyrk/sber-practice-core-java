package ru.sber.base.syntax;

public class Task2 {
    public static void main(String[] args) {
        double[] ar1 = new double[100];
        int max = 0;
        int k = 0;
        for(int i = 0; i <  ar1.length; i++) {
            ar1[i] = Math.random();
            System.out.print(ar1[i] + "  ");
        }
    }
}
