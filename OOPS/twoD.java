package Java.OOPS;
class animal{
    void eat(){
        System.out.println("Eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Barking");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("Meowing");
    }
}

public class twoD {
    public static void main(String[] args) {
        cat c=new cat();
        c.eat();
        c.meow();
    }    
}
