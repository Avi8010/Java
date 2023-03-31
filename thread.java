
class mythread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("My thread is running");
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("My thread 2 is running");
        }

    }
}
class runnablethread1 implements Runnable{
    public void run(){
        System.out.println("I am thread 1");
    }
}
class runnablethread2 implements Runnable{
    public void run(){
        System.out.println("I am thread 2");
    }
}
public class thread {
    public static void main(String[] args) {
//        mythread t1=new mythread();
//        mythread2 t2=new mythread2();
//        t1.start();
//        t2.start();
          runnablethread1 t1=new runnablethread1();
          Thread th1=new Thread(t1);
          runnablethread2 t2=new runnablethread2();
          Thread th2=new Thread(t2);
          th1.start();
          th2.start();
    }
}
