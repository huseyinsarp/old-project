package AllMyWork.Kurscalısmalar.j19_StaticVariable;
/**
 * 1- Static blok yapılar static variable'ları değer ataması update yapmak için kullanılır.
 * 2- Static bloklar Class oluşturulduğunda bütün methodlardan (main method dahil) önce çalışır.
 * 3- Birden fazla static blok varsa yukarıdan aşağıya sıralama ile çalışır.
 */
public class C02_StaticVariable {
    static String isim;
    static {
        System.out.println("1.static block çalıştı.");
        isim= "Dilek Hanım";
        System.out.println(isim);
    }

    public static void main(String[] args) {
        System.out.println("main method başladı.......");
        isim="Kerim Bey";




    }
}
