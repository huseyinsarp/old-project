package tekrarCalismalari;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz: ");
        int vize = sc.nextInt();

        System.out.println("Final notunuzu giriniz: ");
        int finall = sc.nextInt();
        double ortalama = vize*0.4 + finall*0.6;
        System.out.println("Ders ortalamanız :" + ortalama);
        if (ortalama>=50 && ortalama<=100) {
            System.out.println("Dersten geçtiniz, hayırlı olsun");
        } else if (ortalama<50 &&ortalama >=0) {
            System.out.println("Üzgünüm kaldınız.");
        }else {
            System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyiniz.");
        }


    }
}
