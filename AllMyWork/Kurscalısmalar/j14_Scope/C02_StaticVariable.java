package Kurscalısmalar.j14_Scope;

public class C02_StaticVariable {
    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir
 */

    static String firmaName = "clarusway";
    static int firmaID;
    static boolean firmaIT;


    public static void main(String[] args) {
        System.out.println(firmaID); // 0 değer ataması yapılmadığı için default değeri atandı.

        firmaID=1001;  // BEST PRACTİCE
        System.out.println(firmaID); //1001
        C02_StaticVariable.firmaIT=true; // class name ile static variable call edildi. -->> BAD PRACTİCE -- tavsiye EDİLMEZ.

    }

    public static void staticMethod () {
        firmaID=2002; // static variable call edildi.
        System.out.println("Yeni ID numaranız: " + firmaID);

    }


    public void non_staticMethod () {
        firmaName = "javaCAN";
        System.out.println("firmanızın yeni adı: " + firmaName);
    }

}
