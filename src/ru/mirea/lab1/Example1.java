package ru.mirea.lab1;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[5];
        for (int ch=0; ch<5; ch++){
            arr[ch]=sc.nextInt();
            sum = sum + arr[ch];
        }
        int aver;
        aver = sum / arr.length;
        System.out.println(sum);
        System.out.println(aver);
    }
}
