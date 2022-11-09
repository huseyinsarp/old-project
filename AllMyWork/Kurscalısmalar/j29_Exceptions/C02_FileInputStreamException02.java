package AllMyWork.Kurscalısmalar.j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis =new FileInputStream("AllMyWork/Kurscalısmalar/j29_Exceptions/ebikGabık");
            int k;
            while (k=fis.read()!=-1)

            System.out.println("try block calisti...");
        }
        catch
        (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
