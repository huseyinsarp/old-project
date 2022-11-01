package Kurscalısmalar.j10_StringManipulations.tasks;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringnideki 2. 'a' karakterinin indexini bulunuz.

       String str = "Alamanya";
       System.out.println(str.indexOf('a', str.indexOf('a') + 1));

    }
}
