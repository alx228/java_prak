package ru.mirea.lab2.ex1;
import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        String email;
        Author k1 = new Author("Alex", "alex555@yandex.ru", 'm');
        System.out.println(k1.toString());
        System.out.println("Name: " + k1.getName());
        System.out.println("Email: " + k1.getEmail());
        Scanner source = new Scanner(System.in);
        System.out.println("Enter new email ");
        email = source.next();
        k1.setEmail(email);
        System.out.println("New email: " + k1.getEmail());
        System.out.println("Gender: " + k1.getGender());
        System.out.println(k1.toString());
    }
}
