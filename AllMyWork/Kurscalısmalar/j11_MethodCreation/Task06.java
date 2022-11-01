package AllMyWork.Kurscalısmalar.j11_MethodCreation;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*
        Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimerinden birini ve iki sayı seçmesini isteyin.
        Hangi şekli seçerse, o şeklin alanını ve çevresini yazdıran programı yazınız.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Paralelkenar, dikdörtgen ve üçgen'den birini seçiniz. ");
        String secim = sc.next().toLowerCase();
        System.out.println("1.sayıyı giriniz: ");
        int sayi1= sc.nextInt();
        System.out.println("2.sayıyı giriniz: ");
        int sayi2= sc.nextInt();


    }
    public static void secim (String str) {
        switch (str) {
            case "paralelkenar":

                break;
            case "dikdörtgen":
                break;
            case "üçgen":
                break;
            default:
                System.out.println("hatalı seçim yaptınız.");
                secim(str);
        }


    }
}
