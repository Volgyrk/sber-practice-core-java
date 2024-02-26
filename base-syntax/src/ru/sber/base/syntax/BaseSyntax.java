package ru.sber.base.syntax;

public class BaseSyntax {
    String name;
    private void Task1() {
        System.out.println("Задание 1:");
        System.out.println("7 14 21 28 35 42 49 56 63 70 77 84 91 98");
    }
    private void Task2() {
        System.out.println("Задание 2:");
        double[] arr = new double[10];
        double max = 0;
        double sum = 0;
        int kolvo = 0;
        for(int num = 0; num <  arr.length; num++) {
            arr[num] = Math.random();
            kolvo += 1;
            sum += arr[num];
            if(max < arr[num]){
                max = arr[num];
            }
        }
        System.out.println("Среднее значение" + " " + sum/kolvo);
        System.out.println("Максимальное значение" + " " + max);
    }
    private void Task3() {
        System.out.println("Задание 3:");
        for(int num = 2; num < 101; num++) {
            int kolvo = 0;
            for(int div = 2; div < Math.round(Math.sqrt(num)) + 1; div++) {
                if(num % div == 0) {
                    kolvo += 1;
                }
            }
            if(kolvo == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    private void Task4() {
        System.out.println("Задание 4:");
        for(int kolvo = 1; kolvo < 4; kolvo++) {
            System.out.println("* * * * *");
        }
    }
    public static void main(String[] args) {
        BaseSyntax base = new BaseSyntax();
        base.Task1();
        base.Task2();
        base.Task3();
        base.Task4();
    }
}
