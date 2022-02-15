package InterviewDemo;

import java.io.IOException;

public class HandlingException {
    public static void main(String args[]){
        try{
            System.out.println("print A");
            throw new Error();
            System.out.println("print b");

        } catch (IOException e1){
            System.out.println("print D");

        } catch (Exception e){

        } finally {
            System.out.println("print c");

        }
    }
}
