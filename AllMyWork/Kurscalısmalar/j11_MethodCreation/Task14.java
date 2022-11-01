package AllMyWork.Kurscalısmalar.j11_MethodCreation;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mesai başlama saatini yazınız.");
        double start = sc.nextDouble();
        System.out.println("mesai bitiş saatini yazınız");
        double finish = sc.nextDouble();

        System.out.println("mesai saat ücretini yazınız.");
        double saatUcret = sc.nextDouble();

        System.out.println("fazla mesai ücret katsayısını giriniz.");
        double ucretKatsayi = sc. nextDouble();

        System.out.println(ucretHesapla(9.0, 28.0, 40.0, 2));
        System.out.println(ucretHesapla(start,finish,saatUcret,ucretKatsayi));

    }

    private static double ucretHesapla (double baslama, double bitis, double saatUcreti, double ucretKatsayısı) {
        double yevmiye1=(17-baslama)*saatUcreti;
        double yevmiye2=(bitis-17)*saatUcreti*ucretKatsayısı;
        return yevmiye1+yevmiye2;


    }

}
