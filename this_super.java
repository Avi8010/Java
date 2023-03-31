class thisuper{
    int a;
    public int getA() {
        return a;
    }
    thisuper(int x){
        this.a=x;
    }
    public int printt(){
        return a;
    }
}
class thisss extends thisuper{
    thisss(int c){
        super(c);
        System.out.println(c*c);
    }

}
public class this_super {
    public static void main(String[] args) {
        thisuper t=new thisuper(3);
        System.out.println(t.getA());

        thisss th=new thisss(5);
        System.out.println(th.getA());

    }
}
