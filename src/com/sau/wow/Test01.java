package com.sau.wow;

public class Test01 {
    public static void main(String[] args) {
        //สร้าง Object/Instance of Class
        //วิธีที่ 1 มี 2 ขั้นตอน
        DtiSAU mod;
        mod = new DtiSAU();
        //วิธีที่ 2 มี 1 ขั้นตอน
        DtiSAU med = new DtiSAU();


        mod.name  = "สมชาย";
        System.out.println(mod.name + "สูง" + mod.high);

        med.name = "สมศรี";
        med.showHi();

    }
}
