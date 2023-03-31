
class one{
    public void name(){
        System.out.println("name");
    }
    public void name2(){
        System.out.println("name2");
    }
}
class two extends one{
    public void name3(){
        System.out.println("name3");
    }
    public void name(){
        System.out.println("name4");
    }
}
public class dyna_dispatch {
    public static void main(String[] args) {
        one o=new one();
        two o1=new two();
        one obj=new two();//runtime polymorphism

        //two o2=new one();//not allowed
        obj.name();
        //obj.name3();//not allowed
        o1.name3();
    }
}
