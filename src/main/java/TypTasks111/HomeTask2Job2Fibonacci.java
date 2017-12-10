package TypTasks111;

import java.util.Scanner;

public class HomeTask2Job2Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 1;

        System.out.print(b + " ");
        for (int i = 0; i < 10; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }

}
