package JAVA.OOPS;

class Employee{
    float salary = 80000;
}
public class twoA extends Employee {
    int bonus = 10000;
    public static void main(String[] args) {
        twoA P = new twoA();
        System.out.println("Programmer salary : " +P.salary);
        System.out.println("Programmer bonus : " +P.bonus);

    }
    
    
}
