public class defaultconst {

    defaultconst(){
        System.out.println("Bike is created\n");
    }
    public static void main(String[]args){
        defaultconst b=new defaultconst(); //warning occurs due to the variable b, is never used later!
    }
}