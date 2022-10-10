package ru.mirea.lab1;

public class Example5 {
    public static int fak(int a){
        int result=1;
        for (int i=1; i<a+1; i++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print(fak(3));
    }
}
