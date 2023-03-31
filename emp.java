
class cellphone{
    public void ring() {
        System.out.println("ring");
    }

    public void vibrate() {
        System.out.println("vibrate");
    }

    public void callp() {
        System.out.println("callp");
    }
}

class employe1{
    int id;
    int sal;
    String name;

    public int getsal(){
    return sal;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int pm(){
        return 4*side;
    }
}

class temp{
    public void hit(){
        System.out.println(("hit enemy"));
    }
    public void fire(){
        System.out.println("fire");
    }
}
public class emp {
    public static void main(String[] args) {
        System.out.println("..");
        employe1 e1= new employe1();
        e1.sal=23000;
        e1.setname("abc");
        System.out.println(e1.getname());
        System.out.println(e1.getsal());

        cellphone c=new cellphone();
        c.callp();
        c.ring();
        c.vibrate();

        square s=new square();
        s.side=4;
        System.out.println(s.area());
        System.out.println(s.pm());

        temp t= new temp();
        t.fire();
        t.hit();
    }
}
