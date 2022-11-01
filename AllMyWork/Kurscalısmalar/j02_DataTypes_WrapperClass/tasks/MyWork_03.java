package Kurscalısmalar.j02_DataTypes_WrapperClass.tasks;

public class MyWork_03 {
    public static void main(String[] args) {
        //TASK -> 1999 yılında doğan bir kişinin yaşını yazdırınız...
        int dogum = 1999;
        int yıl = 2022;
        System.out.println(yıl - dogum);


      /*  //TASK id ve tc String değerlernin toplamını print eden code yazınız
        String tc = "1234455";
        String id = "98765";
        System.out.println(tc + id);//concat-> birleştirme : 123445598765

        int yeniTC = Integer.valueOf(tc);// tc String değerini int cevirdi ve yeniTC'ye atadı
        System.out.println("yeniTC = " + yeniTC);

        int yeniId = Integer.valueOf(id);// tc String değerini int cevirdi ve yeniId'ye atadı
        System.out.println("yeniId = " + yeniId);

       */

        String tc = "123456";  // String bir ifade olarak TCkimlik no gibi tanımlamalar da yapabiliriz. Sonrasında bu değerleri int'e çevirerek kullanabiliriz.
        String id = "987654";
        System.out.println(tc + id);

        int yeniTc = Integer.valueOf(tc);
        System.out.println(yeniTc);

        int yeniId = Integer.valueOf(id);
        System.out.println(yeniId);
        System.out.println(yeniTc + yeniId);

         /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */

        int sayi1 = 20, sayi2 =32;
        int sayi3;
        sayi3 = sayi1 + sayi2;
        sayi1=sayi3 - sayi1;
        sayi2 =sayi3 - sayi1;
        System.out.println(sayi1);
        System.out.println(sayi2);

        int number1 = 20, number2 = 32;
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println(number1);
        System.out.println(number2);



    }

}
