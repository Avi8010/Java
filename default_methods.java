interface camera{
    void takesnap();
    void record();
}
interface wifi{
    String[] getnetwork();
    void connectTonetwork(String network);
}
class myphone{
    void callnumber(int phonenumber){
        System.out.println("Calling " + phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting...");
    }
}
class smartphone extends myphone implements wifi,camera{
    public void takesnap(){
        System.out.println("capturing...");
    }
    public void record(){
        System.out.println("recording....");
    }
    public String[] getnetwork(){
        System.out.println("Getting list of network...");
        String[] networklist={"net1","net2","net3"};
        return networklist;
    }
    public void connectTonetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class default_methods {
    public static void main(String[] args) {
        smartphone m=new smartphone();
        String[] ar= m.getnetwork();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
