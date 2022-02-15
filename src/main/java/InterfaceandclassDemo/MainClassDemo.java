package InterfaceandclassDemo;


//we cannot extend 2 class , Multiple inhertance is not posoobile, Diamond issue will come
/*
public class MainClassDemo extends ChildA,ChildB {

}*/


public class MainClassDemo implements InterfaceChild1, InterfaceChild2 {


    @Override
    public void disc() {
        System.out.println("running main : disc");
        InterfaceChild2.super.disc();
    }

    @Override
    public void show() {
        InterfaceChild1.super.show();
    }

   /* @Override
    public void dance() {
        System.out.println("running main : dance");

    }*/


    public static void main(String args[]){
        MainClassDemo mainClassDemo = new MainClassDemo();
        mainClassDemo.show();
        System.out.println("******************************************");

        MainClassDemo demo = new MainClassDemo();
        demo.disc();
        System.out.println("******************************************");

        ChildC childC =  new ChildC();
        childC.dance();
        System.out.println("******************************************");

        InterfaceChild1 test = new ChildA();
        test.disc();
        test.show();
        System.out.println("******************************************");

        InterfaceChild3 test3 = new InterfaceChild3() {
            @Override
            public void show() {

            }

            @Override
            public void dance() {
                System.out.println("MainClassDemo running Child 3 in main: dance");

            }
        };
        test3.show();
        test3.dance();
        System.out.println("******************************************");

        InterfaceChild3 child3 = new ChildC();
        child3.dance();

        System.out.println("******************************************");
        ChildC childCClass = new ChildC();
        childCClass.dance();


//        InterfaceChild3 child4= new InterfaceChild1();

    }
}