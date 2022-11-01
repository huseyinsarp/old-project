package dosyalar_Benim;

public class OrnekCalisma8_MantıksalOperator {
    public static void main(String[] args) {

        int sayi1= 75; // sonucu boolean tipinde verir.

        System.out.println(sayi1 > 50 && sayi1 < 100);
        //sayi1 50den büyükse ve 100den küçükse
        //&& (ve) bütün şartların karşılanması halinde true yazdırır 1 tane şart karşılamasa dahi false yazdırır


        int sayi2 = 20;
        System.out.println(sayi2 > 10 || sayi2 < 5);
        // || (veya) sadece 1 tane şartın karşılanması halinde true yazdırır. Hiçbir şart sağlanmadığı durumda false yazar.


    }
}
