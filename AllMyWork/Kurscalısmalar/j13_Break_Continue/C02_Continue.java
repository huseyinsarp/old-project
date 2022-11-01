package Kurscalısmalar.j13_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {

        //Girilen mail hesabındaki boşlukları handle ederek print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Mail hesabınızı giriniz: ");
        String mail = sc.nextLine();

        for (int i = 0; i < mail.length(); i++) {
            char ch = mail.charAt(i);
            if (ch == ' ')continue;
            System.out.print(ch);
        }


    }

}
