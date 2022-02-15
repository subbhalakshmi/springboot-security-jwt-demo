package InterfaceandclassDemo;
@FunctionalInterface
public interface InterfaceChild1 {
     public void disc();

    default void show(){
        System.out.println("running Child 1 : show");
    }
}
