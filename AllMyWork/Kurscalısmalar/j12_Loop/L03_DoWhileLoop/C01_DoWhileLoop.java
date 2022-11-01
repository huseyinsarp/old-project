package Kurscalısmalar.j12_Loop.L01_ForLoop.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
    /*
    While Loop -->> önce şart kontrol edilir, şart sonucu true alınırsa body action run olur.
    Do While Loop -->> Önce body action çalışır sonra şart kontrol edilir. Şart true ise döngü devam eder,
    şart false ise döngü kırılır ve döngüden sonraki ilk satır çalışır.
    --->>Do While Loop daha çok game applicationlarda kullanılır.
    TRİCK: While Loop şart sağlanmazsa hiç çalışmayabilir ama do while loop şart sağlasın - sağlamasın en az 1 kez çalışır.
     */
        int yas = 31;
        while (yas <33) {
            System.out.println("Yaşınız "+yas );
            System.out.println("while body action........");
            yas++;
        }

        do {
            System.out.println("Yaşınız 33");
            System.out.println("do while body action");
            yas++;
        } while (yas<33);


    }// main sonu


}
