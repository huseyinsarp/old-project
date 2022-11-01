package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = sc.nextInt();

        int gecmis = yas - 10;

        System.out.println("10 yıl önceki yaşınız: " + gecmis + " dir.");



    }
}
