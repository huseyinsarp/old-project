package Kurscalısmalar.j12_Loop.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
        //Polindrome = Her iki yönde okunduğunda eşit olan ifadeler. 
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String str = sc.nextLine();
        polindrome(str);
        
        
        
        
    }// main sonu

    private static void polindrome(String str) {
        String tersStr = "";
        for (int i =str.length()-1; i >=0; i--){
            tersStr+=str.charAt(i); //str nin i sayılı karakterini tersStr ye ekler (concat)
        }
        System.out.println("girilen ifadenin tersi : " + tersStr);
        if (str.equalsIgnoreCase(tersStr)){ // str ile tersStr eşitlik kontrolü
            System.out.println("girilen ifade POLİNDROME");
        }else System.out.println("girilen ifade polidrome DEĞİL");


    }//main sonu

}
