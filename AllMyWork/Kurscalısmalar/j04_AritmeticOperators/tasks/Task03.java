package Kurscalısmalar.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 3 basamaklı bir sayı giriniz: ");
		int sayi = sc.nextInt();
		int yüzler = sayi/100;
		int birler = sayi%10;

		System.out.println(" girmiş olduğunuz sayının yüzler basamağındaki rakam : " + yüzler + "\nbirler basamağındaki rakam ise " + birler + " dir.");
		

		
	}

}
