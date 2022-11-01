package Kurscalısmalar.j15_Arrays;

public class Task15 {
    public static void main(String[] args) {

        // TASK -->> arr tüm elemanlarının çarpımını print eden code create ediniz.
        int sayi [][] = {{1, 2, 3}, {9,8}};
        int carpım =1; // ilk değer 1 verilerek çarpmada etki etmeyecek değer kullanıldı.

        for (int kat =0; kat < sayi.length; kat++) {
            for (int daire = 0; daire < sayi[kat].length; daire++) {
                carpım*=sayi[kat] [daire];
            }
        }
        System.out.println(carpım);  // 432



    }

}
