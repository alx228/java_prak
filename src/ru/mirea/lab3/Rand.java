package ru.mirea.lab3;
import java.util.Arrays;
import java.util.Random;

public class Rand {
    public static void main(String[] args){
        int n = 10;
        double dic1[] = new double[n];
        double dic2[] = new double[n];
        Random rand = new Random();
        for (int i=0;i<n;i++){
            dic1[i] = rand.nextInt(1000);
            System.out.print(dic1[i] + " ");
        }
        System.out.println();
        Arrays.sort(dic1);
        for (int i=0;i<n;i++){
            System.out.print(dic1[i] + " ");
        }
        System.out.println();
        for (int i=0;i<n;i++) {
            dic2[i] = (int) (Math.random()*1000);
            System.out.print(dic2[i] + " ");
        }
        System.out.println();
        Arrays.sort(dic2);
        for (int i=0;i<n;i++){
            System.out.print(dic2[i] + " ");
        }
    }
}
