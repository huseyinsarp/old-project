package Kurscalısmalar.j10_StringManipulations;

public class C10_isEmpty {
    public static void main(String[] args) {
        String str ="hi";

        System.out.println("str boş mu: " +str.isEmpty());
        System.out.println(str.replaceAll("\\w", "").isEmpty());  // Boş mu, dolu mu diye sorgulama yapıyoruz, boolean olarak sonuç verir.



    }

}
