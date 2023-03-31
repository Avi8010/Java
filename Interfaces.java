
interface bicycle{
    int a=45;
    void brake(int decrement);
    void speedup(int increment);
}

interface bike{
    void bikehorn();
    void bikebrake();
}
class cycle implements bicycle,bike{
    void horn(){
        System.out.println(" tring tring ");
    }
    public void brake(int decrement){
        System.out.println(" stop!!!!!");
    }
    public void speedup(int increment){
        System.out.println("gear up");
    }
    public void bikehorn(){
        System.out.println("pip pip....");
    }
    public void bikebrake(){
        System.out.println("immediately stop");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        cycle c=new cycle();
        c.brake(1);
        System.out.println(c.a);
        c.bikehorn();
        c.bikebrake();

    }
}
