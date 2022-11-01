package Kurscalısmalar.j13_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
   /*
break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz. Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:

 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */

// Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("Mail hesabınızı giriniz: ");
        String mail = sc.nextLine();

        for (int i= 0; i < mail.length(); i++) { // 0 indeksten mail son indeksee kadar her bir karakteri döngüye alır.
            char c = mail.charAt(i);  // Döngüdeki her bir karakteri c'ye atama yapar.
            if (c=='@') {  // c ' de @ karakteri varsa if blok run edilir.
                break;  // if blok loop'u sonlandırır.
            }
            System.out.print(c);  // loop'taki elde edilen karakteri c'ye atayıp print eder.
        }




    }
}
