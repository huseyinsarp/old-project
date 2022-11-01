package Kurscalısmalar.j12_Loop.L01_ForLoop.Tasks;

public class Task13 {
    public static void main(String[] args) {


        char harf = 65;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (harf + i) + " ");
            }
            System.out.println();

        }

    }

}


