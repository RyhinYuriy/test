package TypTasks111;

public class HomeTask2Job3Biletiki {
    public static void main(String[] args) {
        int n=0;
        for (int i=000001; i<1000000; i++)
        {int x1=i/100000;
        int x2 = (i-x1*100000)/10000;
        int x3=(i-(x1*100000+x2*10000))/1000;
        int y1=(i-(x1*100000+x2*10000+x3*1000))/100;
        int y2=(i-(x1*100000+x2*10000+x3*1000+y1*100))/10;
        int y3=i%10;
        if (x1+x2+x3==y1+y2+y3)
        n++;}
        System.out.println("Счастливых билетов в одном рулоне "+n);
    }
}
