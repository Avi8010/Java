
 class employee{
    int id;
    int sal;
    String name;
    public void printclass(){
        System.out.println(sal);
        System.out.println(id);
        System.out.println(name);
     }
}
public class classes {
    public static void main(String[] args) {
        System.out.println("class");
        employee e = new employee();
        employee e2= new employee();
        e2.name="def";
        e2.id=123;
        e2.sal=15000;

        e.id=12;
        e.sal=12000;
        e.name="abc";
        System.out.println(e.id);
        System.out.println(e.sal);
        e.printclass();
        e2.printclass();
    }
}
