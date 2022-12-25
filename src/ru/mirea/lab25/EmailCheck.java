package ru.mirea.lab25;

public class EmailCheck {
    public static void main(String[] args){
        String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        String email1 = "mirea@mail.ru";
        String email2 = "edumirea@@gmail..ru";

        boolean isValid = email1.matches(regex);
        System.out.println(email1 +" : "+ isValid);

        isValid = email2.matches(regex);
        System.out.println(email2 +" : "+ isValid);
    }
}
