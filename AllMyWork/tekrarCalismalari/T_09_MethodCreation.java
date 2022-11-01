package tekrarCalismalari;

public class T_09_MethodCreation {
    public static void main(String[] args) {
        System.out.println(arrayToplam(new int[]{10, 20, 30, 40, 50, 1320}));
        System.out.println(arrayToplam(new int[]{1,2,3,5,4,6,6,8}));
        System.out.println(arrayToplam(new int[]{1320,100,235,2444}));

    }



    public static int arrayToplam (int[] sayilar) {
        int toplam =0;
        for (int sayi : sayilar) {
        toplam+= sayi;
        }
        return toplam;



}

}
