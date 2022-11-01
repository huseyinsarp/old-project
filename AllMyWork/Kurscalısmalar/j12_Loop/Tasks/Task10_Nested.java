package Kurscalısmalar.j12_Loop.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {
        /*
        Girilen bir ifadenin istenen harf sayısını print eden code create ediniz
        input: Selam javaCAN'lar
        output: a sayısı : 3        
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        System.out.println("");
        String cumle = sc.nextLine();
        System.out.println("Sayılacak harfi giriniz: ");
        char harf = sc.next().charAt(0);
        int harfSayisi = 0; //

        for (int i = 0; i < cumle.length()-1; i++) {
            if (cumle.charAt(i) == harf) {
                harfSayisi++;
            }
        }
        System.out.println("Girdiğiniz cümle: " + cumle + "de istediğiniz harf: " + harfSayisi + "vardır.");
        
        
        
    }
    
}
