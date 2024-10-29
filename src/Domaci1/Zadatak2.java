package Domaci1;

public class Zadatak2 {
    public static void main(String[] args) {
        //1. Napisati program koji izracunava povrsinu i obim kruga za radijus r. (2 * r * PI)//
        int r=23;
        double povrsina= r*r* Math.PI;
        System.out.println("Povrsina je " +povrsina);
        double obim= 2*r*Math.PI;
        System.out.println("Obim je " +obim);
    }
}
