package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen en sevdiğiniz meyvenin adını giriniz: ");
        String meyve = sc.nextLine().toUpperCase();

        System.out.println("En sevdiğiniz meyve  " + meyve + "dir." );




    }
}
