package Kurscalısmalar.j12_Loop.L01_ForLoop.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //Başlangıç ve bitiş değerleri net (bilinen değerler) olan tekrarlarda for loop kullanılır.
        //Adım sayısı belli olmayıp bir şarta (duruma) bağlı olan tekrarlarda while loop kullanılır.

        //Task -> 11'den 20'ye kadar olan tamsayıları print eden code create ediniz.

    //   //********** for çözümü
    //   for (int i =11; i < 21; i++) {
    //       System.out.println(i+ " ");
    //   }

        // ********* while çözümü
        int basla =11;
        while (basla<21) { // başla değeri 21 den küçük olduğu sürece body action uygula
            System.out.println(basla + " ");
            basla++;
        }

          // 7 kez JAVACAN print eden code create ediniz.
        int b =1;
        while (b<8) {
            System.out.println("JAVACAN");
            b++;
        }

        // 2 basamaklı tek sayıları yan yana print eden code create ediniz.

        int bb = 11;
        while (bb<100) {
            System.out.print(bb+ " ");
            bb+=2;
        }

        // Girilen metni tersten print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("\nBir atasözü giriniz: ");
        String metin = sc.nextLine();

        int metinUzunluk = metin.length();
        while (metinUzunluk>=1){
            System.out.print(metin.charAt(metinUzunluk-1));
            metinUzunluk--;
        }

        // Task : Girilen tamsayıya kadar tamsayıların toplamını print eden code create ediniz.

        System.out.println("Bir tamsayı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int toplam = 0; //Döngü actiondan oluşacak toplam için boş int oluşturuldu.
        while (sayi>0){ // sayı 1 olana kadar
            toplam+=sayi;  // her döngüde sayıyı toplama ekle
            sayi--;
        }
        System.out.println("Girdiğiniz sayıların toplamı: " + toplam);

        // TASK 6 ************Girilen tamsayının faktöriyelini print eden code create ediniz.








    }// main sonu

}
