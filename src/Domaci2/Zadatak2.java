package Domaci2;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*2. Napisi program koji koristi for petlju da proveri da li je broj N prost.
        Korisnik treba da unese vrednost N, a program treba da ispita da li je taj broj deljiv samo sa 1
        i sa samim sobom.
        Ispiši odgovarajuću poruku.*/
        Scanner d= new Scanner(System.in);
        System.out.println("Unesi broj");
        int N= d.nextInt();
        boolean prost= true;
        if (N <=1);{
            System.out.println("Broj nije prost");
        }
        for (int i=2;i<=Math.sqrt(N);i++){
            if (N/i==0){
                prost=true;
                break;
            }
        } if (prost=true) {
            System.out.println("Broj je prost");
        } else {
            System.out.println("Broj nije prost");
        }
    }
}
