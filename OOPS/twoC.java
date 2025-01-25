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
        Dog obj2=new Dog();
        Obj1.weep();
        obj2.bark();
        Obj1.eat();
    }
}
