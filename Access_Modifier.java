
class emp2{
    private int id;
    private String name;

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

public class Access_Modifier {
    public static void main(String[] args) {
        emp2 e2= new emp2();
        e2.setname("abc");
        e2.setid(123);
        System.out.println(e2.getname());
        System.out.println(e2.getid());
    }
}
