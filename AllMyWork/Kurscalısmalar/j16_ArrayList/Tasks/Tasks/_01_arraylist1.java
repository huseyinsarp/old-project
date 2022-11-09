package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String> getCount = new ArrayList<>(List.of("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        String meyve = "Orange";
        System.out.println(getCount(getCount, meyve));


    }

    private static int getCount(ArrayList<String> getCount, String meyve) {
        int count=0;
        for (String data : getCount) {
            if (meyve.equalsIgnoreCase(data)) {
                count++;
            }



        }
return count;

    }
}
