package Domaci1;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Unesi dva broja i operaciju sabiranje ili oduzimanje");
        int broj1 = s.nextInt();
        int broj2 = s.nextInt();
        int sabiranje = broj1 + broj2;
        int oduzimanje = broj1 + broj2;
        int zbir= s.nextInt();
        int razlika= s.nextInt();
        char o = s.next().charAt(0);
        if (sabiranje == zbir)
            System.out.println("Zbir je");
        else if( oduzimanje== razlika){
            System.out.println("Razlika je");}}
}
