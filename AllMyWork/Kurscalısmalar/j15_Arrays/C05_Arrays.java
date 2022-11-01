package Kurscalısmalar.j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //ARRAY COPY.. copyOf(arr,newLength);  -->> Girilen Array'ın newLength kadar ilk elemanı kopyalar.

        int sayi [] ={ 63, 21, 47, 27, 35, 12, 36, 31, 46,24};

        int yeniArr [] = Arrays.copyOf(sayi, 5);
        System.out.println("sayıdan 5 eleman kopyalanan yeni Array: " + Arrays.toString(yeniArr));

        int baskaArr [] =Arrays.copyOfRange(sayi,3,8); // 3 dahil 8 hariç index kopyalanır.
        System.out.println(Arrays.toString(baskaArr));

        //Array'ı belirli bir eleman ile update (set) etme....

        Arrays.fill(sayi, 99); //
        System.out.println("sayi Array'in 99 ile fullenmiş hali : " + Arrays.toString(sayi));

        Arrays.fill(sayi, 3, 7, 33);
        System.out.println("sayi Array'in 3 ile 7 index arasının 99 ile fullenmiş hali : " + Arrays.toString(sayi));





    }

}
