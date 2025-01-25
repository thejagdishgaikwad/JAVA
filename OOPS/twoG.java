package JAVA.OOPS;
interface drawable{
    void draw();
}
class rectangle implements drawable{
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class circle implements drawable{
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
public class twoG {
    public static void main(String[] args) {
        drawable r=new rectangle();
        r.draw();
        drawable c=new circle();
        c.draw();
    }
}
