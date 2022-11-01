package Kurscalısmalar.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        // TASK  kullanıcıdan alınan değerlerle bir int array elemanlarını büyükten küçüğe print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç elemanlı array istiyorsunuz: ");
        int arrBoyut  = sc.nextInt();

        int arr [] = new int[arrBoyut];  // boyutu belirlenmiş boş int array

        for (int i =0; i < arrBoyut; i++) {
            System.out.println(i + ". index elemanı giriniz: ");
            arr [i] = sc.nextInt();
        }
        System.out.println("İstediğiniz Array: " + Arrays.toString(arr));
        Arrays.sort(arr); // arr küçükten büyüğe sıralandı.

        for (int i = arr.length-1; i>=0; i-- ) {
            System.out.println(arr[i] + " ");
        }


    }

}
