import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create store
      Store mediaStore=new Store();


      //create user
        User user1=new User("Hadeel","hadeel@gmail.com");
        User user2=new User("Norah","Norah@gmail.com");


        //Create instances of various books, movies, and music items, including Novel and AcademicBook objects.
     Book b1=new Book("book1","sami","7755",45,10);
     Movie movie1=new Movie("Last night","Join cress","11122",80,60);
     Music music1=new Music("music1","Ali","99887",20,"Kalied");
     Novel novel1=new Novel("novel1","khan","55443",40,40,"drama");
     AcademicBook academicBook1=new AcademicBook("academic","Fahad","443322",50,22,"Java");

     //add media to the store
        mediaStore.addMedia(b1);
        mediaStore.addMedia(movie1);
        mediaStore.addMedia(music1);
        mediaStore.addMedia(novel1);
        mediaStore.addMedia(academicBook1);

        //display medie
        ArrayList<Media>allMedai=new ArrayList<>();
        allMedai= mediaStore.displayMedias();
        for (Media m:allMedai){
            System.out.println(m.toString());
        }

        //searcing for book
        System.out.println("");
        System.out.println("searching for academic book");
        System.out.println( mediaStore.searchBook("academic").toString());

        System.out.println("");

        //add moive to car user1 && book
        user1.addToCar(movie1);
        user1.addToCar(music1);
        user1.addToCar(b1);
        //remove movie1 from user cart
        user1.removeFromCart(movie1);
        //print stock before pruchers
        System.out.println("b1 stock before purchase= "+b1.getStock());
        //print the cart of the user
        System.out.println("\nuser1 cart:");
        ArrayList<Media>cart=new ArrayList<>();
        cart=user1.getShoppingCart();
        for (Media m:cart){
            System.out.println(m.toString());
        }
        System.out.println("------------------------------");
        System.out.println("number of item in cart Before user checkout "+ cart.size());
        //check out book b1
        user1.checkOut();
        System.out.println("number of item in cart after user checkout "+ cart.size());

        System.out.println("stock of bock b1 after check out= "+b1.getStock());

        //display the purchaseMediaList
        System.out.println("\ndisplay the purchase list of the user:");
        ArrayList<Media>p=new ArrayList<>();
        p=user1.getPurchaseMediaList();
        for(Media m:p){
            System.out.println(m.toString());
        }

        //Add reviews on books
        Review r1=new Review(user1.getUsername(),5,"Amazing Noval!!!");
        novel1.addReview(r1);

        Review r2=new Review(user2.getUsername(),3,"Boring book!");
        novel1.addReview(r2);

        Review r3=new Review(user1.getUsername(),5,"Good");
        b1.addReview(r3);

        //average Review;
        System.out.println("Average rating of noval1= "+novel1.getAverageRating());
        System.out.println("Average rating of book1= "+b1.getAverageRating());


        //test best seller
        System.out.println("--------------");
        System.out.println("Test Best seller method with book(book1)= "+b1.isBestSeller());
        System.out.println("Test Best seller method with book(noval1)= "+novel1.isBestSeller());


        //test preacher && restock method with AcademicBook
        System.out.println("--------------");
        System.out.println("AcademicBook stock before pusher method= " +academicBook1.getStock());
        academicBook1.purchase(user2);
        System.out.println("AcademicBook stock after pusher method= " +academicBook1.getStock());
        System.out.print("using restock method for AcademicBook by adding 10=");
        academicBook1.restock(10);
        System.out.println("--------------");


















    }
}