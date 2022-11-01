package Kurscalısmalar.j10_StringManipulations.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
        Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char h = harfDepo.charAt(harfDepo.indexOf("H"));
        char u = harfDepo.charAt(harfDepo.indexOf("U"));
        char s = harfDepo.charAt(harfDepo.indexOf("S"));
        char e = harfDepo.charAt(harfDepo.indexOf("E"));
        char y = harfDepo.charAt(harfDepo.indexOf("Y"));
        char i = harfDepo.charAt(harfDepo.indexOf("I"));
        char n = harfDepo.charAt(harfDepo.indexOf("N"));
        System.out.println(""+h+u+s+e+y+i+n);
        System.out.println(h+u+s+e+y+i+n);



    }


    }

