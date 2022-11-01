package AllMyWork.Kurscalısmalar.j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // Girilen ad ve soyadın ilk harfleri büyük, diğerlerini küçük yapan metod create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz: ");
        String ad = sc.next();

        System.out.println("Soyadınızı giriniz: ");
        String soyad = sc.next();

        ebikGabık(ad, soyad);

    }


private static void ebikGabık(String ad, String soyad) {
        ad= ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad= soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
    System.out.println(ad +  soyad);


}



}
