package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen ilk sayıyı giriniz: ");
		int sayi1 = sc.nextInt();

		System.out.println("Lütfen 2. sayıyı giriniz: ");
		int sayi2 = sc.nextInt();

		int toplam = sayi1 + sayi2;
		int cikarma = sayi1 - sayi2;
		int carpma = sayi1 * sayi2;
		int  bolme = sayi1 / sayi2;

		System.out.println("\n\n");

		System.out.println("Sayıların toplamı: " + toplam);
		System.out.println("Sayıların farkı: " + cikarma);
		System.out.println("Sayıların çarpımı: " + carpma);
		System.out.println("Sayıların bölümü: " +  bolme);



	}

}
