package Kurscalısmalar.j10_StringManipulations;

public class C07_indexOf_LastIndexOf {
    public static void main(String[] args) {
        /*indexOf()
        ** char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false
         */

        String str = "Good";
        System.out.println("ilk görülen o nun yeri index nosu: " +str.indexOf('o'));
        System.out.println("d nin yeri index nosu: "+ str.indexOf('d'));
        System.out.println("d nin yeri index nosu: "+ str.indexOf('D'));
        // olmayan karakter indexi sorgulanırsa -1 return eder.

        System.out.println("od nin yeri index nosu: "+ str.indexOf("od"));
        System.out.println("Od nin yeri index nosu: "+ str.indexOf("Od"));


        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim = "Mustafa Nizamoğlu";
        System.out.println(isim.indexOf('a'));
        System.out.println(isim.lastIndexOf('a'));
        System.out.println(isim.lastIndexOf("fa"));

        /*task
         Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz
          1-Girilen cumle java icermiyor
          2-Girilen cumle 1 tane java iceriyor
          3-Girilen cumlede birden fazla java var
          */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("kafi mikta bir cümle giriniz : ");
        String cumle = sc.next().toLowerCase();

 */

        }


    }


