
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void base(){
        System.out.println("constructor");
    }
}

class derive extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setX(21);
        System.out.println(b.getX());

        derive c= new derive();
        c.setX(2);
        System.out.println(c.getX());

        c.setY(3);
        System.out.println(c.getY());
    }
}
