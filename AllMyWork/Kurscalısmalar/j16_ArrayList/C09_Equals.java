package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_Equals {
    public static void main(String[] args) {
        //equals();  -->>> iki List'in index ve eleman eşitliğini kontrol eder ve boolean return eder.
        ArrayList<String> lis1 = new ArrayList<>(List.of("a", "b"));
        ArrayList<String> lis2 = new ArrayList<>(List.of("A", "b"));
        ArrayList<String> lis3 = new ArrayList<>(List.of("a", "b"));
        ArrayList<String> lis4 = new ArrayList<>(List.of("b", "a"));

        System.out.println(lis1.equals(lis3));
        System.out.println(lis2.equals(lis3));
        System.out.println(lis1.equals(lis2));
        System.out.println(lis1.equals(lis4));

    }
}
