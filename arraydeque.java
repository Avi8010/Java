import java.util.ArrayDeque;
 public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l= new ArrayDeque<>();
        l.add(3);
        l.addFirst(1);
        l.addLast(2);
        for(int i=0;i<l.size();i++){
            System.out.println(l.getFirst());
            System.out.println(l.getLast());
        }
    }
}
