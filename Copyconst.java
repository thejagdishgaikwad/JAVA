public class Copyconst {
    int id;
    String name;
    Copyconst(int i, String n) {
        id=i;
        name=n;
    }
    Copyconst(Copyconst s){
        id=s.id;
        name=s.name;
    }
    void display(){
        System.out.println(id+""+name);
    }
    public static void main(String[]args){
        Copyconst s1=new Copyconst(1," thejagdishgaiwkad");
        Copyconst s2=new Copyconst(s1);
        s1.display();
        s2.display();
    }
}
