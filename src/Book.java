import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> review=new ArrayList<>();


    //getters and setters

    Book(){

    }

    Book(String title,String auteur,String ISBN,double price,int stock){
        super(title,auteur,ISBN,price);
        this.stock=stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addReview(Review r){
      review.add(r);
    }

    public double getAverageRating(){
      double Average=0;
      for(Review single_review :review){
          Average=Average+single_review.getRating();
      }
      return Average/review.size();
    }



    //public void purchase(User user){
        //user.purchaseMediaList.add()
//        stock--;
//    }


    public boolean isBestSeller(){
        if(getAverageRating()>=4.5)return true;
        else return false;
    }

    public void restock(int quantity){
        stock=stock+quantity;
        System.out.println("The quantity after restock ="+stock);
    }

    public String getMediaType(){
        if(isBestSeller())return "Bestselling Book";
        else return "Book";
    }


    public void purchase(User user) {
        if (stock > 0) {
            user.setPurchaseMediaList(this);
            stock--;
        } else {
            System.out.println("The book is out of stock.");
        }
    }

    public String toString(){
        return "Book title=" + super.getTitle() + ", auteur=" + super.getAuteur() + ", ISBN="+super.getISBN()+", price="+super.getPrice()+" , its stock="+stock;
    }

}
