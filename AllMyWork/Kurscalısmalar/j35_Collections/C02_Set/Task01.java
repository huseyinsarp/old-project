package AllMyWork.Kurscalısmalar.j35_Collections.C02_Set;

import java.util.*;

public class C02_Task {
    public static void main(String[] args) {
        /*
        Değer ataması yapılan Array'i ArrayList'e çeviren method create ediniz.
        Main içerisinde methodun retun ettiği ArrayList'i Hash set, LinkedHashSet ve TreeSet'e atayınız.
         */
        String arr [] = {"Muharrem", "Umit", "Sinan", "Nihan"};

        arrayListeCevir (arr);
        HashSet <String> hs = new HashSet<>( arrayListeCevir(arr));
        LinkedHashSet <String> lhs = new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String> ts = new TreeSet<>(arrayListeCevir(arr));

        System.out.println("hurraa set: " + hs);  // hurraa set: [Muharrem, Sinan, Nihan, Umit]
        System.out.println("Erken gelen girer set" + lhs);  //  Erken gelen girer set[Muharrem, Umit, Sinan, Nihan]
        System.out.println("Alfabetik sıra set : " + ts);  //  Alfabetik sıra set : [Muharrem, Nihan, Sinan, Umit]

    }  // main sonu

    private static ArrayList <String> arrayListeCevir(String[] arr) {
        ArrayList<String> arlst = new ArrayList<>(List.of(arr));

        return arlst;
    }
}
