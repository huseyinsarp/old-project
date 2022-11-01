package AllMyWork.Kurscalısmalar.j11_MethodCreation;

import java.util.Scanner;

public class Task04 {

    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */
    static    Scanner sc = new Scanner(System.in);
    static  int bakiye = 1000;

    public static void main(String[] args) {
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("Bakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        secim (); // method call

    } // main dışı

    public static void secim() {
        System.out.println("Yapacağınız işlemi seçiniz : ");
        int seçim = sc.nextInt();
        switch (seçim) {
            case 1:
                bakiye ();
                break;
            case 2:
                paraYatir ();
                break;
            case 3:
                paraCek ();
                break;
            case 4:
                cıkıs ();
                break;
            default:
                System.out.println("Önce seçim yapıp sonrasında para çekme işlemine geçiniz.");



        }



    }

    private static void bakiye() {
    }

    private static void cıkıs() {
        System.out.println("Çıkış işleminiz gerçekleştirilmiştir. İyi günler dileriz. ");
    }

    private static void paraCek() {
        System.out.println("Çekmek istediğiniz miktarı giriniz: ");
        int cekilecekMiktar = sc.nextInt();
        if (cekilecekMiktar<=bakiye){
            bakiye-=cekilecekMiktar;
            System.out.println("Para çekme işleminiz gerçekleşmiştir. ");
            System.out.println("Kalan bakiyeniz: "+bakiye);
        }else System.out.println("yanlış işlem yaptınız, lütfen tekrar deneyiniz. ");
        karar();

    }

    private static void paraYatir() {
        System.out.println("Ne kadar yatırmak istersiniz: ");
        int yatırılacakMiktar = sc.nextInt();
        bakiye+=yatırılacakMiktar;
        System.out.println("Güncel bakiyeniz: " +bakiye);
        karar();

    }

    private static void bakiyeVer() {
        System.out.println("Bakiyeniz :" + bakiye);
        karar();
    }

    public static void karar () {
        System.out.println("işleme devam etmek isterseniz 1, \nişlemi sonlandırmak isterseniz 0'a basınız. ");
        int karar = sc.nextInt();
        if (karar ==1) {
            secim();
        }else if (karar==0)cıkıs();
        else System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz");
    }


}
