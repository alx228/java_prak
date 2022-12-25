package ru.mirea.lab25;

public class Prices {
    public static void main(String[] args){
        String line = "55 USD, 0.005 EU, 321 RUB";
        String[] words = line.split(", ");
        for(String word: words){
            System.out.println(word);
        }
    }
}
