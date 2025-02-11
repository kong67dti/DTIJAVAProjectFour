package com.sau.aa;

public class Hey {
    public int a = 10; //instance variable
    public static int b = 20; //class variable

    public void showHi(){ //instance method
        System.out.println("Hi...");
    }
    public static void showHey(){ //class method
        System.out.println("Hey...");
    }

    public void metA(){
        a = 11;
        b = 22;
        showHi();
        showHey();

    }

    public static void metB() {
//        a = 11; error
        b = 22;
//        showHi(); error
        showHey();
    }
}
