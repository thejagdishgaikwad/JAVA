package JAVA.OOPS;
    class animal{
        void eat(){
            System.out.println("Eating......!\n");
        }
    }
    class Dog extends animal{
        void bark(){
            System.out.println("Barking......!\n");
        }
    }
    class BabyDog extends animal{
        void weep(){
            System.out.println("Weeping......!\n");
        }
    }
public class twoC {
    public static void main(String[] args) {
        BabyDog Obj1=new BabyDog();
        Obj1.eat();
        Obj1.weep();
        Obj1.eat();
    }
}
