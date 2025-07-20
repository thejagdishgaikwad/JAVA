package Java.OOPS;
class animal{
    void eat(){
        System.out.println("Eating.....!\n");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Barking.....!\n");
    }
}

public class twoB {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();
    }    
}
