package Kurscalısmalar.j12_Loop.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("100'e kadar pozitif tam sayı giriniz.");
        int sayi = sc.nextInt();
        if (sayi >100){
            System.out.println("100'den küçük girmelisiniz.");
        }else {
            for (int i = sayi; i<100; i++){
                if (i%3==0){
                    System.out.println(i+ " java ");
                }
                if (i%5==0){
                    System.out.println(i+ "CAN'dır ");
                }
                if (i%3==0 && i%5 ==0){
                    System.out.println(i+ "JAVACAN");
                }
            }
        }


    }

}
