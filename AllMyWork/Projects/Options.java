package AllMyWork.Projects.AutomationMachine;

import java.util.Scanner;

public class Options {

    /*
Urun urun = new Urun();

1) Kullanıcı ürünleri göstermeliyiz. ----> Urun clasın da bir obj. toString()
2) Scanner --> Scanner clasından bir obj create ediniz. (productNum a set edilmeli. setProductNum()  )
3) Loop --> Do-While Loop --> kullanıcı 1-7 rakamları arasında bir seçim yapmalı ve eğer girmiş olduğu rakam
1 den küçük ve ya 7 den büyük ise döngü devam etmeli ve kullanıcı 1-7 arasında bir seçim yapmaya force edilmeli.
4) 0 a basarak ta menuden cıkabilmeli. --> Yine Bekleriz... Yazısını konsola yazdıralım....
5) Kullanıcıdan productNum (1-7 arasında rakam {Kullanıcı 1 rakamı seçerse, Kraker, 2 rakamını seçerse cips etc.... }) --> switch-case yapısı kurmalıyım...
6) switch benden ProductNum ve alınan bu productNum a göre ilgili ürünün price ı alınmalı. urun.getKraker(), urun.getCips(), urun.getCay(), getCocaCola() etc....
(price set edebilmek için ben price ın setPrice() metodunu kullanmalıyım...)
7) return olarak bana price dönmeli. return getPrice() (double)

 */

    public double select (Urun urun) {

        System.out.println(urun.toString());
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Lütfen 1 ile 7 arasında bir rakam girerek almak istediğiniz ürünü seçiniz. ...");
            System.out.println("Çıkış için 0'a basınız...");
            urun.setProductNum() =scanner.nextInt();
        } while (urun.getProductNum()<1 || urun.getProductNum()>7);


        return 1.5;  // şu an hata vermemesi için yazılmıştır.
    }

}
