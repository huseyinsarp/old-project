package Kurscalısmalar.j14_Scope;

public class C03_Scope {
    public static void main(String[] args) {
        C01_InstanceVariable kus = new C01_InstanceVariable();
        kus.name = "HÜMA";
        kus.developerMı =false;


        System.out.println("kus.name = " + kus.name); //
        C01_InstanceVariable.staticMethod();
        kus.non_staticMethod(); //


    }

}
