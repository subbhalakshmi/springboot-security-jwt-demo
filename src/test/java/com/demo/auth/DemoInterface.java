package com.demo.auth;

public interface DemoInterface {

    public void getNumber();
//    private void getNumber(); not possible
//    protected void getNumber(); not possible
    default int getAnt(){
    return 0;
    }

}
