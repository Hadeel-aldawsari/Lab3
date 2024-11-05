public class Novel extends Book {
    private  String genre;


    Novel(String title,String auteur,String ISBN,double price,int stock,String genre){
        super(title,auteur,ISBN,price,stock);
        this.genre=genre;
    }

    public String getMediaType(){
        if(super.getAverageRating()>4.5)return "Bestselling Novel";
        else return "Novel";
    }

    public String toString(){
        return "Novel title=" + super.getTitle() + ", auteur=" + super.getAuteur() + ", ISBN="+super.getISBN()+", price="+super.getPrice()+" , its stock="+super.getStock()+" ,genre="+genre;
    }
}
