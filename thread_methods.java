class thr1 extends Thread{
    public void run() {
        while (true) {
            System.out.println("Thank you very much");
        }
    }
}
class thr2 extends Thread{
    public void run() {
        while (true) {
            System.out.println("Thank you");
        }
    }
}
public class thread_methods {
    public static void main(String[] args) {
        thr1 t1=new thr1();
        thr2 t2=new thr2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
