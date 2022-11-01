package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1.sınav notunuzu giriniz: ");
        int ilkSınav = sc.nextInt();

        System.out.println("Lütfen 2.sınav notunuzu giriniz: ");
        int ikinciSınav = sc.nextInt();

        System.out.println("Lütfen 3.sınav notunuzu giriniz: ");
        int sonSınav = sc.nextInt();
        double sonuc = (ilkSınav * 0.3) + (ikinciSınav * 0.2) + (sonSınav * 0.5);

        System.out.println("Not ortalamanız: " + sonuc);

    }
}
