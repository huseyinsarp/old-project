package Kurscalısmalar.j12_Loop.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        //Girilen 5 sayının 10 ile 20 arası hariç diğerlerinin toplamını hesap eden code create ediniz.

       Scanner sc = new Scanner(System.in);
       int toplam =0;
        for(int i= 1; i<=5;i++){
            System.out.println(i+ ". sayıyı giriniz: ");
            int num1 = sc.nextInt();
            if((num1 <= 10 ||  num1 >=20)){
                toplam+=num1;
            } // if sonu
        } // for sonu

        System.out.println("Girdiğiniz sayıların istenen şartlara göre toplamı = " + toplam);


    }//main sonu

}
