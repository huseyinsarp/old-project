package AllMyWork.Kurscalısmalar.j11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //Girilen 2 sayıyı  seçilen 4 dört işleme göre hesaplayan metod create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        int  sayı1 = sc.nextInt();

        System.out.println("2.sayıyı giriniz: ");
        int sayı2 = sc.nextInt();
        System.out.println("İşleminizi giriniz: ");
        char islem = sc.next().charAt(0);


    } // main sonu

    /*

    public static void islemMenu (char ch, int x, int y) {
        switch (ch) {
            case '+':
                topla(x,y);
                break;
            case '-':
                cıkar(x,y);
                break;
            case '*':
                carp (x,y);
                break;
            case '/':
                bol (x,y);
                break;
            default:


        }
    }

    public static void topla (int a, int b) {

    }System.out.println("a+b = " + (a+b));

    public static void cıkar (int a, int b) {

        }System.out.println("a-b = " + (a-b));

    public static void carp (int a, int b) {

        }System.out.println("a*b = " + (a*b));

    public static void bol (int a, int b) {

        }System.out.println("a/b = " + (a/b));

     */
}


