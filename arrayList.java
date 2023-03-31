import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(0,7);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
