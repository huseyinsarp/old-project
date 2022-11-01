package Kurscalısmalar.j12_Loop.L01_ForLoop.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //TASK: Girilen tamsayıyı tam bölen sayısını print eden code create ediniz.
        //Örn:20'yi tam bölen 1,2,4,5,10,20 olmak üzere 6 tane tam böleni vardır.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz: ");
        int sayi = sc.nextInt();
        int bolenSayi = 1;
        int tamBolenAdedi =0;
        while (bolenSayi<=sayi) {
            if (sayi%bolenSayi==0) { // sayi bolenSayi ya tam bölünme şartı
                tamBolenAdedi++;

            }
            bolenSayi++; // Loop sonsuza düşmemesi için ve diğer sayıların böldüğü kontrol edilmesi için yazılmıştır.

        }
        System.out.println("Girdiğiniz sayının " + sayi +  "nin" + tamBolenAdedi + "tane tam böleni vardır." );

    } // main sonu

}