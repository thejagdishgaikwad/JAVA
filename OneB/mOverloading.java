package JAVA.OneB;//package name should never start with digit

public class mOverloading {
    void add(){
        System.out.println("0 Parameters!\n");
    }
    void add(char a){
        System.out.println("Character :"+a);
    }
    void add(int a, int b){
        System.out.println("A:"+a+"B:"+b);
    }
    void add(int e, float d){
        System.out.println("E:"+e+"D:"+d);
    }
    public static void main(String[] args) {
        mOverloading obj = new mOverloading();
        obj.add();
        obj.add('@');
        obj.add(10, 20);
        obj.add(10, 20.5f);
    }
}