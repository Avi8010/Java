

class employees{
    private int id;
    private String name;

    public employees(){
        id=12;
        name="abc";
    }
    public employees(String myname,int n){
        id=n;
        name = myname;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
    public int getid(){
        return id;
    }
    public void setid(int v) {
        id = v;
    }
}
public class constructors {
    public static void main(String[] args) {
        //employees e=new employees("Avi",21);
        employees e=new employees();
        System.out.println(e.getname());
        System.out.println(e.getid());
    }
}
