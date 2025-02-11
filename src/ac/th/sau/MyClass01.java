package ac.th.sau;

import kotlin.reflect.KProperty;

public class MyClass01 {
    //Encapsulation ซ่อนข้อมูล (data member)
    private int dataA;
    private String dataB;

    //ให้ใช้งาน data ผ่านเมธอด Getter/Setter

    public int getDataA() {
        return dataA;
    }

    public void setDataA(int dataA) {
        this.dataA = dataA;
    }

    public String getDataB() {
        return dataB;
    }

    public void setDataB(String dataB) {
        this.dataB = dataB;
    }
}
