package Kurscalısmalar.j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //Stringi Arraya çevirme: split () girilen parametre değere göre String ifade parçalanır.
        String str = "javaCANlara selam olsun. En kısa zamanda bolcana offer sonrası TUZLA BALIK";

        String strArray[] = str.split(" "); // str her " " karaktere göre parçalanır. Her bir parça strArr2 nin bir elemanı olarak atandı.
        System.out.println(Arrays.toString(strArray)); //

        System.out.println(strArray.length);

        // TASK -->> String ifadeyi kelime sayısını print eden code create ediniz.
        String harfArr [] =str.split("");
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);


    }
}
