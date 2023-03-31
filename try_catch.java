public class try_catch  {
    public static void main(String[] args) {
        int a=4000;
        int b=20;
        try{
            int c=a/b;
            System.out.println("result:" + c);
        }
        catch(Exception e){
            System.out.println("Failed");
            System.out.println(e);
        }
        System.out.println("end");
    }
}
