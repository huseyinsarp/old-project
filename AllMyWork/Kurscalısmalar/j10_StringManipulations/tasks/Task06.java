package Kurscalısmalar.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //Girilen Strin'in son karakterini silen code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String str = sc.next();
        System.out.println(str.substring(0, str.length() - 1));


    }
}
