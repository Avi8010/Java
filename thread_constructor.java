class tc extends Thread{
    public tc(String name){
        super(name);
    }
    public void run(){
        int i=24;
        System.out.println("thanks");
//        while(true){
//            System.out.println("threading");
//        }
    }
}

public class thread_constructor {
    public static void main(String[] args) {
        tc t=new tc("java");
        t.start();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getClass());
        System.out.println(t.getThreadGroup());
        System.out.println(t.getStackTrace());
        System.out.println(t.getState());
    }
}
