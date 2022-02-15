package InterfaceandclassDemo;

public interface InterfaceChild2 {

    default void show(){
        System.out.println("running Child 2 : show");
    }

    default void disc(){
        System.out.println("running Child 2 : disc");
    }


}
