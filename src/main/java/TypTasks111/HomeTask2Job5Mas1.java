package TypTasks111;

public class HomeTask2Job5Mas1 {
    public static void main(String[] args) {
        int[][] mas1 = new int[8][5];

        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                mas1[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(mas1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}