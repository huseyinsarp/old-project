package Kurscalısmalar.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.kelimeyi giriniz : ");
        String kelime1 = sc.nextLine();

        System.out.println("2.kelimeyi giriniz : ");
        String kelime2 = sc.nextLine();

        System.out.println(kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length()));
        if (kelime1.length()%2==0) {
            } else {
            System.out.println("kelime2 kelime1 eklenemez");
        }




    }
}
