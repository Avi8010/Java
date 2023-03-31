import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(0,7);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println(l.indexOf(7));
        System.out.println(l.lastIndexOf(4));
    }
}
