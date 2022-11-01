package AllMyWork.Kurscalısmalar.j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // Girilen 3 notun ortalamasını hesaplayan metod create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("1.notu giriniz: ");
        double not1 = sc.nextDouble();

        System.out.println("2.notu giriniz: ");
        double not2 = sc.nextDouble();

        System.out.println("3.notu giriniz: ");
        double not3 = sc.nextDouble();
        double ortalamanız = ortalamaHesaplama(not1, not2, not3);
        System.out.println("Not ortalamanız : " + ortalamanız);


    }

    private static double ortalamaHesaplama (double a, double b, double c) {
        return (a+b+c)/3;
    }


}
