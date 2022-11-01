package tekrarCalismalari;

public class T_02 {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 3;
        int toplam = sayi1 + sayi2;
        int cikarma = sayi1 - sayi2;
        int carpma = sayi1 * sayi2;
        int bolum = sayi1 / sayi2;
        int mod = sayi1 % sayi2;

        System.out.println(toplam);
        System.out.println(cikarma);
        System.out.println(carpma);
        System.out.println(bolum);
        System.out.println(mod);

        System.out.println(toplam + cikarma + carpma + bolum +  mod); // tüm değerleri toplar =108

        // **** Artırma Operatörü ***
        int num1 = 20;
        int num2 = 40;
        System.out.println(num1);
        System.out.println(num2);

       num1++;
       num2--;
        System.out.println(num1);
        System.out.println(num2);

        int deger = 20;  //20
        deger = deger * 5;  //100
        System.out.println(deger); // Artık deger = 100 oldu.

        //***** Daha pratik ve kısa yolu aşağıdadır. İnterviewlerde dikkat edilir.
        deger*=5;
        System.out.println(deger);
        deger-=123;
        System.out.println(deger);
        deger+=12;
        System.out.println(deger);
        deger %=3;
        System.out.println(deger);

        //İlişkisel Operatörler : Genellikle karşılaştırma durumlarında kullanlır.
        //Örn: Ahmet 18'den büyük ise oy kullansın, değilse kullanmasın şeklinde bir durumda kullanabiliriz.
        int okulNo1=100;
        int okulNo2=90;

        System.out.println(okulNo1>okulNo2);
        System.out.println(okulNo1<okulNo2);
        System.out.println(okulNo1>=okulNo2);
        System.out.println(okulNo1<=okulNo2);
        System.out.println(okulNo1==okulNo2);
        System.out.println(okulNo1!=okulNo2);

        //Mantıksal Operatörler:  && (ve), || (veya) operatörü. İlişkisel operatörle kullanılır.  Boolean sonuç verir.

        int kapıNo1 = 75;
        int kapıNo2 = 100;
        System.out.println(kapıNo1 >50 && kapıNo1 <100); // ve şartında tüm durumların şartı sağlaması gerekir ve bu durumda true alabiliriz.
        System.out.println(kapıNo2 > 10 || kapıNo2 < 50); //veya şartında tek bir şartın sağlaması true almamız için yeterlidir.


    }
}
