
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfacearea(){
        return 2*3.14*radius*(height+radius);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

class rectangle{
    private int length;
    private int breadth;

    public rectangle(){
        this.length=5;
        this.breadth=4;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class construcor_access {
    public static void main(String[] args) {
        cylinder c=new cylinder(9,12);
        //c.setHeight(12);
        //c.setRadius(9);
        int h=c.getHeight();
        System.out.println(h);
        System.out.println(c.surfacearea());
        System.out.println(c.volume());

        rectangle r=new rectangle(21,70);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
