package dosyalar_Benim;

public class OrnekCalisma3 {
    public static void main(String[] args) {
        byte sayi1 =120;
        int sayi2 = 500;

        sayi1 = (byte) sayi2;
        System.out.println(sayi1);
        // byte boyutundan fazla bir değeri byte içerisine atmak istersek sonuç istediğimiz gibi çıkmaz, hata alırız.
        //Ancak sayı atmak istediğimiz değer içerisinde sığabilecek gibiyse sorun olmaz. Tpye ni değiştirebiliriz.

        int sayi3 = 999;
        long sayi4 = 4455;
        sayi3 = (int) sayi4;
        System.out.println(sayi3);


    }
}
