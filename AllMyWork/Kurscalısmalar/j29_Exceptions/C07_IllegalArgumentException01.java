package AllMyWork.Kurscalısmalar.j29_Exceptions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {

        // -- >> IllegalArgumentException : Kullanılması istenmeyen değerlerde prog hata vermesi isteniyorsa bu exception fırlatır.
        // Örnek: Kişinin yaşını - (eksi) değerle girmesi... code kırılmadan run olması ama girilen değer için exception fırlatması için kullanılır.


        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = sc.nextInt();

        if (yas<18) {
            System.out.println("Yaşınız uygun DEĞİL.");
            throw new IllegalArgumentException();  // throw komutu try catch block olmadan da istenen method body de tanımlanabilir.
        }
        else System.out.println("Yaşınız ehliyet için UYGUN.");


        try {
            if (yas <0) {
                throw new IllegalArgumentException(); // throw keyword ile exception obj create edilerek hata tanımlanır ve fırlatılır.

            } else System.out.println("Ağam yaşın hayırlı olsun..."+ yas);
            System.out.println("else satırı  sorunsuz çalıştı");

        } catch (IllegalArgumentException e) {
            System.out.println("Yaş değeri negatif olarak GİREMEZSİNİZ.");
            System.out.println("Bu yazıyı okuduysanız code handle edildi...");
        }



    }
}
