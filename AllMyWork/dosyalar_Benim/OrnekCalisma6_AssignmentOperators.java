package dosyalar_Benim;

public class OrnekCalisma6_AssignmentOperators {
    public static void main(String[] args) {

        /*
        int sayi = 20;
        sayi = sayi * 5; // Bu satırı yazdırdığımız zaman yeni sayi ifadesinin yeni değeri
        //100 olarak karşımıza çıkar ve sayinin değeri artık 100'dür.
         */

        int sayi= 20;

        sayi *=5; // 5'i sayi ile çarparak yeni sayi değerini 100 yaptı
        System.out.println(sayi);
        sayi +=5; // 5 ile değeri 100 olan sayiyi topladı.
        System.out.println(sayi);
        sayi -=5; // 5'i değeri 105 olan sayi değerindedn çıkardı.
        System.out.println(sayi);
        sayi /=5; // 100 olan sayi değerini 5'e böldü.
        System.out.println(sayi);
        sayi %=5; // 20 olan sayi değerinin 5e bölümünden kalanı aldı. Şimdi sayi değeri "0"
        System.out.println(sayi);





    }
}
