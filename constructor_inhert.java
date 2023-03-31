
class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    public int x;
    base1(int a){
        System.out.println("integer");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derive1 extends base1 {
    int y;
    derive1() {
        super(0);//calls the base1 constructor having arguments
        System.out.println("derive");
    }
    derive1(int x,int y){

        System.out.println("overloaded");
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class child extends derive1{
    child(){
        System.out.println("child without argument");
    }
    child(int x,int y,int z){
        super(x,y);
        System.out.println("i am child");
    }
}
public class constructor_inhert {

    public static void main(String[] args) {
        //base1 d=new base1();

        //always calls base class first and then derive class
        //derive1 c=new derive1(2,1);

        child c1=new child();
        child c2=new child(1,2,3);

    }
}
