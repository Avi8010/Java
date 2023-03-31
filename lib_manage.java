
class library{
    String[] books;
    int no_of_books;
    library(){
        this.books =new String[100];
        this.no_of_books=0;
    }
    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book +" has been added");
    }
    void show(){
        System.out.println("Available books are:");
        for(String book: this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }
    void issuebook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)) {
                System.out.println("book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Book does not exists");
    }
    void returnbook(String book){
        addbook(book);
    }
}

public class lib_manage {
    public static void main(String[] args) {
        library l1=new library();
        l1.addbook("Dance of dragons");
        l1.addbook("Songs of ice and fire");
        l1.show();
        l1.issuebook("Songs of ice and fire");
        l1.show();
        l1.returnbook("Songs of ice and fire");
        l1.show();
    }
}
