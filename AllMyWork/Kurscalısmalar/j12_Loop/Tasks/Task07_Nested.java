package Kurscalısmalar.j12_Loop.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {
        // Girilen boyutta bir kare için

        Scanner sc = new Scanner(System.in);


        System.out.println("kare için boyut giriniz: ");

        int boyut = sc.nextInt();
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <=boyut; j++) {

                if (i==j){
                    System.out.print("1");
                }else System.out.print("0");
            }
            System.out.println();

        }





    }


}
