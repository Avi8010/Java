
class A{
    public int a;
    public int meth1(){
        return a;
    }
    public void meth2(){
        System.out.println("I am meth2 of A");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("I am meth2 of B");
    }
    public void meth3(){
        System.out.println("I am meth3");
    }
}

public class overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
