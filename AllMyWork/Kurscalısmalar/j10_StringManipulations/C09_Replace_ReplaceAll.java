package Kurscalısmalar.j10_StringManipulations;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {

        String str = "javaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '@')); // j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer

        System.out.println(str.replace("can", "kan")); //javaCAN'lara selam olsun java ile bolkana offer

        // ReplaceFirst   ---  Replace ile aynı sadece ilk bulunanı değiştirir

        System.out.println(str.replaceFirst("a", "@")); //j@vaCAN'lara selam olsun java ile bolcana offer

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str = "javaCAN'lara selam olsun :) java ile 123456556 offer *** ";
        System.out.println(str.replaceAll("\\s", "^"));
        System.out.println(str.replaceAll("\\S", "^"));
        System.out.println(str.replaceAll("\\w", "^"));
        System.out.println(str.replaceAll("\\W", "^"));
        System.out.println(str.replaceAll("\\d", "^"));
        System.out.println(str.replaceAll("\\D", "^"));

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz: ");
        */
        String isim = "Hüseyin";
        String soyad = "Sarp";
       String  kartNo= "7777888899996641";

        String yeniİsim = isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*");
        String yeniSoyisim = soyad.charAt(0) + isim.substring(1).replaceAll("\\w", "*");
        String yeniKart = "**** **** **** ****" + kartNo.substring(12);
        System.out.println("isim - soyisim :" + yeniİsim +  yeniSoyisim + "kart no: " + yeniKart);





    }

}
