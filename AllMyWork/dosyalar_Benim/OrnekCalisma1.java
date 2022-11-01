package dosyalar_Benim;

import java.util.Scanner;

public class OrnekCalisma1 {
    public static void main(String[] args) {
        System.out.println("java dersleri"); // sout yazdırmak için kullanılır. "" içine yazılır.
        System.out.print("Hüseyin"); // println alt satırdan devam eder, print yanına yazdırır.
        // satırı yorum satırı yapar ve bu java tarafından kod olarak okunmaz.

        /*
        bu ibare arasına satır değil istediğimiz kadar bilgi, metin ekleyebiliriz.
        .
        .
         */
        int sayi1=20;
        int sayi2=34;
        int sene= 2022;
        sayi1 = sayi2;
        System.out.println(sayi2+sayi1);


        byte yas = 20;
        short yas1 = 50;
        int yas2 =100;
        long yas3 = 200;

        float oran1 =20.5f; // float olduğunu belirtmek için değerin sonuna f harfi eklenmesi gerekir.
        double oran2 = 50.55;

        char aHarfi= 'a'; // her bir karakter (rakam, harf, karakter, boşluk...) için kullanılır. Tek tırnak '...' içine yazmak gerekir.
        boolean sonuc = true; // sadece doğru yanlış olmak üzere 2 sonucu vardır.

        Scanner input = new Scanner(System.in); // Şablon standarttır, input yerine istediğimiz ismi verebiliriz.
        //input.  input (isim + .)  yazıp noktaya basınca Scanner içinde kullanabileceğimiz hazır metodları açar ve ordan yazacağımız türe uyğun olanı seçeriz.
        // metin ise String, sayı ise nextInt şeklinde metodu seçeriz. Örnek aşağıda

       /*
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = input.next();
        System.out.println("İsminiz: " + isim);

        Burası güzel çalıştı ancak aşağıda yazdığımla birlikte çalışmadığı için yoruma aldım.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı yazınız: ");
        Integer yasii = sc.nextInt();
        System.out.println("Yaşınız : " + yasii);


        Scanner mezuniyet  = new Scanner(System.in);
        System.out.println("Lütfen mezun olduğunuz yılı giriniz: ");
        Integer mezun = mezuniyet.nextInt();
        System.out.println("Mezun olduğunuz yıl: " + mezun);

        Scanner banka = new Scanner(System.in);
        System.out.println("Lütfen bankanızı yazınız: ");
        String bankanız = banka.next();
        System.out.println("Güncel bankanız: " + bankanız);

        */
        Scanner java = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz: ");
        String isim = java.next();

        System.out.println("Lütfen yaşınızı giriniz: ");
        Integer age= java.nextInt();

        System.out.println("İsminiz:"+ isim);
        System.out.println("Yaşınız: " + age);












    }
}
