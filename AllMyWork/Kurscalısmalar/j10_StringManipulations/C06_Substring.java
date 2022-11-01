package Kurscalısmalar.j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
        String str = "java bilen sırtı yere gelmez :) ";
        System.out.println(str.substring(10)); // sırtı yere gelmez :)

        //son 10 karakteri yazmak için
        System.out.println(str.substring(str.length() - 10));

        // ilk 10 karakteri yazmak için
        System.out.println(str.substring(0, 10));

        // ilk karakteri bulmak için
        System.out.println(str.substring(0, 1));

        // girilen 4 harfli kelimeyi tersten print eden code create ediniz.
        Scanner sc =  new Scanner(System.in);
        System.out.println("dört harfli kelime giriniz : " );
        String kelime = sc.next();
        if (kelime.length()!=4) {
            System.out.println("ağam sana 4 harfli gir demedik mi :) ");
        }else {
            System.out.println(kelime.substring(kelime.length() - 1));
            System.out.println(kelime.substring(kelime.length() - 2));
            System.out.println(kelime.substring(1,2));
            System.out.println(kelime.substring(0,1));

        }

    }
}
