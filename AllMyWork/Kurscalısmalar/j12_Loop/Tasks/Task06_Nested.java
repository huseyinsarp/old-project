package Kurscalısmalar.j12_Loop.L01_ForLoop.Tasks;

public class Task06_Nested {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "       ");
            }
            System.out.println();
        }


    }

}
