package TypTasks111;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeTask2Job1Mas2 {
    public static void main(String[] args) {
        int[][] mas1 = new int[7][4];
        int[] mas2 = new int[7];
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                mas1[i][j] = (int) (Math.random() * 11 - 5);
                System.out.print(mas1[i][j] + "\t");

                if (j == 0) mas2[i] = mas1[i][j];
                else mas2[i] *= mas1[i][j];
                if (j == mas1[i].length - 1) ;
            }
            System.out.println();

        }
        int max = 0;
        int index = 0;
        for (int n = 0; n < mas2.length; n++) {
            if (Math.abs(mas2[n]) > max) {
                max = mas2[n];
                index = n;
            }
        }
        System.out.println("Индекс строки с наибольшим по модулю произведением элементов - " + index);

       // String mas2String = Arrays.toString(mas2);
       // System.out.println(mas2String);
    }

}

