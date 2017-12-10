package TypTasks111;

public class HomeTask2Job4ElWatches {
    public static void main(String[] args) {
        int n = 0;

        for (int h = 00; h < 24; h++) {
            int x1 = h / 10;
            int x2 = h % 10;
            for (int m = 00; m < 60; m++) {
                int y1 = m / 10;
                int y2 = m % 10;
                if (x1 == y2 & x2 == y1)
                    n++;
            }
        }
        System.out.println("Количество симметрий " + n);
    }
}
