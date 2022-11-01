package AllMyWork.Kurscalısmalar.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task04 {
    
       /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */

    static Scanner sc = new Scanner(System.in);
    static int bakiye = 1000;

    public static void main(String[] args) {
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("   ***   ");
        System.out.println("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        secim ();




    }//main dışı

    public static void secim () {
        System.out.println("Yapacağınız işlemi seçiniz: ");
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
                cıkısYap ();
                break;
            default:
                System.out.println("Hatalı seçim yaptınız..");
        }


    }

    private static void bakiye() {
        System.out.println("Bakiyeniz: " + bakiye);
      karar();
    }

    public static void karar () {
        System.out.println("İşleme devam etmek isterseniz 1'e, çıkış yapmak isterseniz 0'a basınız.");
        int karar = sc.nextInt();
        if (karar==1) {
            System.out.println("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
            secim();
        } else if (karar ==0)cıkısYap();
        else System.out.println("Hatalı giriş yaptınız.");
    }

    private static void cıkısYap() {
        System.out.println("Çıkış işleminiz yapılmıştır. İyi günler dileriz. ");
    }

    private static void paraCek() {
        System.out.println("Çekmek istediğiniz miktarı giriniz: ");
        int cekilecekMiktar = sc.nextInt();
        if (cekilecekMiktar<=bakiye) {
            bakiye-=cekilecekMiktar;
            System.out.println(bakiye + " TL bakiyeniz kalmıştır. ");
        } else System.out.println("Hesabınızda belirttiğiniz tutarda para yoktur. ");
        karar();
        
    }

    private static void paraYatir() {
        System.out.println("Ne kadar yatırmak istersiniz: ");
        int yatacakMiktar = sc.nextInt();
        bakiye+=yatacakMiktar;
        System.out.println("Güncel bakiyeniz: " + bakiye);
        karar();

        
    }


}
