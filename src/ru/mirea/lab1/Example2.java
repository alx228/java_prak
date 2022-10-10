package ru.mirea.lab1;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args){
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[]arr = new int[5];
        while (i<5){
            arr[i]=sc.nextInt();
            sum = sum + arr[i];
            i++;
        }
        int max=arr[0];
        int min=arr[0];
        int ch=4;
        do{
            if (max<arr[ch]){
                max=arr[ch];
            }
            if (min>arr[ch]){
                min=arr[ch];
            }
            ch--;
        }while (ch>0);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
    }
}
