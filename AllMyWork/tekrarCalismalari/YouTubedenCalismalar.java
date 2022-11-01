package tekrarCalismalari;

import java.util.Scanner;

public class YouTubedenCalismalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz: ");
        int vize = sc.nextInt();
        System.out.print("Final notunuzu giriniz: ");
        int finall = sc.nextInt();
        double ortalama = vize*0.4 + finall*0.6;
        System.out.println("Ders ortalamanız :" +ortalama);
        if (ortalama<50) {
            System.out.println("Dersten kaldınız, geçmiş olsun");
            } else {
            System.out.println("Dersten geçtiniz, hayırlı olsun");
        }



    }

}
