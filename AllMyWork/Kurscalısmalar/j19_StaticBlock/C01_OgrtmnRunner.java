package AllMyWork.Kurscalısmalar.j19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {

        C01_Ogrtmn.okul = "KABATAŞ ERKEK LİSESİ";

        C01_Ogrtmn hc1 = new C01_Ogrtmn("Cüneyt", 11);
        System.out.println(hc1.tecrube);
        System.out.println(hc1.isim);
     //   hc1.okul="Kabadaş";
        System.out.println(hc1.okul); // NULL

        C01_Ogrtmn.okul = "KABATAŞ ERKEK LİSESİ";

        C01_Ogrtmn hc2 = new C01_Ogrtmn("Bekir", 7);
        System.out.println(hc2.tecrube);
        System.out.println(hc2.isim);
    //    hc2.okul="Kabatas";
        System.out.println(hc2.okul);

        C01_Ogrtmn hc3 = new C01_Ogrtmn("Nazım", 13);
        System.out.println(hc3.tecrube);
        System.out.println(hc3.isim);
     //   hc1.okul="Gabataş";
        System.out.println(hc3.okul);
        hc1.evlilikYilDonumu(); //obje ile non-static method call edildi.
        C01_Ogrtmn.maasHesapla(); // ClassName ile static method call edildi.
        hc2.maasHesapla (); // Bu şekilde atama tavsiye edilmez. Bad Practice



    }
}
