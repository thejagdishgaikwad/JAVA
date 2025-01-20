public class Overloadconst {
    Overloadconst(){
        System.out.println("Hi.....!");
    }
    Overloadconst(int a){
        System.out.println("a="+a);
    }
    Overloadconst(char c){
        System.out.println("c="+c);
    }
    public static void main(String[] args) {
        Overloadconst obj1=new Overloadconst();
        Overloadconst obj2=new Overloadconst(10);
        Overloadconst obj3=new Overloadconst('8');

    }
}
