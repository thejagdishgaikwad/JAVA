package JAVA.OOPS;
abstract class Bike{
    abstract void run();
}
public class Kawasaki extends Bike{
    void run(){
        System.out.println("Running Safely!\n");
    }
    public static void main(String[] args) {
        Kawasaki k = new Kawasaki();
        k.run();
    }
}
