package tekrarCalismalari;

import java.util.Scanner;

public class Q01MethodCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cm değerini giriniz: ");
        double cm = sc.nextDouble();


    }

    public static double meter (double x) {
        return x/100;
    }

    public static double kilometer (double y) {
        return y/100000;
    }

    public static void corvertFromSantiMeter (double sayi) {
        System.out.println("Girilen santimeter değeri : " + sayi/100 + "metre ");
    }

}
