package AllMyWork.Kurscalısmalar.j99_Lambda.lambdaSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_LambdaExpression {
    public static void main(String[] args) {

        /*
	 	1) Lambda "Functional Programming"-->mathod(action) kullanan pr dili.
	 	   Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
	       Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
	 	   Lambda’lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
	   	   Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

	 		"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	 	2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	 	3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
	     	ve hatasiz code yazma acilarindan cok avantajlıdır.
	 	4) Lambda sadece collections'larda(List, Queue ve Set) ve Array'lerde kullanilabilir ancak map'lerde kullanılmaz.
           Lambda kullanmak hatasız code kullanmaktır.

                "Functional Programming"--> CINCIX Programming
                "Structured Programming"--> AMELE Programming

            Collections Nedir?
            Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
            yapar. Array’ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
            yaptığı gibi, daha fazlasını da yapar.
            Java’da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
            topluluğu bir arada tutan bir yapıdır. ‘Collections Framework’ ise arayüzler ve onların kurgularından
            (implementations) oluşur.

             API:Uygulama programlama arayüzü
             (İngilizce: Application Programming Interface, kısaca API), bir yazılımın başka bir yazılımda tanımlanmış işlevlerini
             kullanabilmesi için oluşturulmuş bir tanım bütünüdür.
             API, yazılım bileşeniyle olan etkileşimlerin bir özelliğidir.
             Bu da örnek olarak şu anlama gelir. Bir arabanın bir yazılımı olduğunu hayal edin.
             Bu arabanın API'si arabanın neler yapabileceği hakkında bilgi içerir; hızlanma, frenleme, camları açma, vs.
             Ayrıca bunların nasıl yapabileceğine dair bilgiler de içerir.
             Örneğin hızlanmak için ayağınızı gaz pedalına koyup itersiniz.
             API, ayağınızı gaza bastığınızda motorun içinde neler olduğunu açıklamak zorunda değildir.
             Bu nedenle, içten yanmalı motorlu bir araba kullanmayı öğrendiyseniz, tamamen
             yeni bir dizi beceri öğrenmek zorunda kalmadan API sayesinde elektrikli bir arabayı rahatlıkla kullanabilirsiniz.

	 */

        List <Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        printElemanStructured(sayi);
        System.out.println("\n********");
        printElemanFunctional(sayi);
        System.out.println("\n********");
        printElemanFunctional1 (sayi);
        System.out.println("\n********");
        printElemanFunctional2(sayi);




    } // main sonu

    //Task : "Structured Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printElemanStructured (List<Integer> sayi) {
        for (Integer w:sayi) {
            System.out.print(w + " ");
        }
    }


    public static void printElemanFunctional (List<Integer> sayi) { // functional programming
        sayi. // aksiyona girecek list collection
                stream().  // List elemanlarını yukarıdan aşağıya akışa alır.
                forEach((t)->System.out.print(t+ " ")); // datanın parametresine göre akıştaki her bir elemanı işleme sokar.

    }

    /*
    stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
    forEach() :datanin parametresine gore her bir elemanı isler
    t-> : Lambda operatoru
     Lambda Expression-->(parameter list) -> {action body}
         Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
         -> Arrow-token: Argüman listesi(parameter list) ile expression gövdesini(action body) birbirine bağlamak için kullanılır.
         Body: Expressionları ve statementları içerir.

        Bir kod bloğundan oluşan bir body...
        Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
        Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

            () -> {
             double pi = 3.1415;
                return pi;
            };
   ahanda trick köşeşinde bugun :   Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

    */

    public static void printElemanFunctional1 (List<Integer> sayi) { // functional programming
        sayi. // aksiyona girecek list collection
                stream().  // List elemanlarını yukarıdan aşağıya akışa alır.
                forEach((System.out::print)); // Method referance  -->> System.out yapısından print method call edildi.
                                                          //  MethodKaynağı::Method -->> method referance

    }

    public static void yazdir (int a) {  // normal tek aksiyonlu method  ---seed method (tohum) -- refere edilecek method
        System.out.print(a+ " ");
    }


    public static void printElemanFunctional2 (List<Integer> sayi) { // functional programming
        sayi. // aksiyona girecek list collection
                stream().  // List elemanlarını yukarıdan aşağıya akışa alır.
                forEach((C01_LambdaExpression::yazdir)); // Method referance  -->> System.out yapısından print method call edildi.
        //  MethodKaynağı::Method -->> method referance

    }

    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.




    public static boolean ciftMi(int X) {//Refere edilecek method
        return X%2 == 0;
    }



}
