package ru.mirea.lab8.ex2;

public class Numbers {
    public static void main(String[] args) {
        print1ton(6,1);
    }
    public static void print1ton(int n,int i){
        System.out.print(i + " ");
        if(n != i){
            print1ton(n,i+1);
        }

    }
}
