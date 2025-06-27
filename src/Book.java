public class Book {
    String title;
    String author;
    int price;

    Book(String T,String A,int P){
        title =T;
        author =A;
        price =P;
    }
    void display(){
        System.out.println("title "+ title);
        System.out.println("author "+ author);
        System.out.println("price "+ price);
    }


    public static void main(String[] args){
        Book b1 =new Book("Ramayana","Valmiki",500);
        Book b2 =new Book("Bagavatgeetha","Krishna",600);
        Book b3 =new Book("Mahaveera","veera", 600);

        b1.display();
        b2.display();
        b3.display();

    }
}
