package tekrarCalismalari;

import java.util.Scanner;

public class T_01 {
    public static void main(String[] args) {
        //main metodu arabanın kontağı gibidir. Javaya bir başlangıç noktası gösterir. Olmazsa kod run olmaz.
        // Java kodlarını yazdığımız alanlara class diyoruz.  (Class CamelCase tarzinda yazılır.)
        // Classların belli bir amaca ilişkin bir alanda bulunmasına da paketlendirme işlemi diyoruz. (Paket kücük harfle başlar.)

        // Veri Tipi:
        // Variable (değişken) : Elimizde bulunan verileri daha kolay çağırabilmek adına yaptığımız isimlendirme.
        System.out.println("Konsola metin yazdırmak için kullanırız");
        int sene = 2022; // int = veri tipi, sene = değişken ismi, 2022 = değişkenin değeri. (Değişken "sene")
        /** İLKEL VERİ TİPLERİ          ***Classlar
         * byte, short, int, long               Byte, Short, Integer, Long
         * float, double                            Float, Double
         * char                                          Char
         * boolean                                     Boolean
         */
        int sayi = 5; // ilkel veri tipi ile
        Integer sayi2 =  new Integer(40); // Bu classların içerisinde kullanabileceğimiz hazır metodlar vardır.
        System.out.println(sayi2);

        // Scanner Class: Konsol yardımı ile kullanıcıdan veri alırız ve kullanırız.
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Lütfen isminizi giriniz: ");
        String isim = sc.next();
        System.out.println("İsminiz: " + isim);
         */

       /* System.out.println("Lütfen yaşınızı giriniz : ");
        int yas =sc.nextInt();
        System.out.println("Yaşınız: "+ yas);
        */
        Scanner input = new Scanner(System.in); // Konsol aracılığı ile kullanıcıdan veri alıyoruz.
        System.out.println("Lütfen adınızı giriniz: ");
        String ad = input.next();

        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();

        /*System.out.println("Adınız: "+ad);
        System.out.println("Yaşınız: "+ yas);
        */
        System.out.println("Adınızı giriniz: "+ad + "\nYaşınızı giriniz: "+ yas); // Tek satırda böyle yazabiliriz.

        //**** Değişken tipini değiştirme (Type Casting)

        byte no1= 25;
        int no2 =110;
        no2 = (byte) no1; //int olan no2 sayısını byte olarak no1'e atadık.






















    }
}
