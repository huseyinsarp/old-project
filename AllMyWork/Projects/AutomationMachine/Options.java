package AllMyWork.Projects;

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
            urun.setProductNum(scanner.nextInt());
            if (urun.getProductNum()<0 || urun.getProductNum()>7){
                System.out.println("Lütfen belirtilen aralıklarda bir rakam giriniz...");
            }
        } while (urun.getProductNum()<0 || urun.getProductNum()>7);

        switch (urun.getProductNum()) {
            case 0:
                System.out.println("Yine bekleriz...");
                break;
            case 1:
                urun.setPrice(urun.getKraker());
                break;
            case 2:
                urun.setPrice(urun.getCips());
                break;
            case 3:
            urun.setPrice(urun.getCocaCola());
                break;
            case 4:
                urun.setPrice(urun.getFanta());
                break;
            case 5:
                urun.setPrice(urun.getSu());
                break;
            case 6:
                urun.setPrice(urun.getCay());
                break;
            case 7:
                urun.setPrice(urun.getFiltreKahve());
                break;


        }


        return urun.getPrice();
    }

    public double balance (double price, double accountBalance, Urun urun) {
        double fonlama;

        while (accountBalance<price) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bakiyeniz YETERSİZ... Ekleme yapmak ister misiniz ? (Y/N) ");
            char confirm = scanner.next().toLowerCase().charAt(0);

            if (confirm == 'n') {
                System.out.println("Mevcut bakiyeniz : " + accountBalance);
                System.out.println("Yine bekleriz. İyi günler. ");
                break;
            } else {
                System.out.println("Ne kadar ekleme yapmak istersiniz. ");
                fonlama = scanner.nextDouble();
                accountBalance = accountBalance+fonlama;
                System.out.println("Yeni bakiyeniz : " + accountBalance);
                select(urun);
            }
        }

        return accountBalance;
    }

}
