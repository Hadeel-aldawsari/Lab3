public class AcademicBook extends Book {
    private String subject;


    AcademicBook(String title,String auteur,String ISBN,double price,int stock,String subject){
        super(title,auteur,ISBN,price,stock);
        this.subject=subject;
    }

    public String getMediaType(){
        if(super.getAverageRating()>4.5)return "Bestselling Novel";
        else return "AcademicBook";
    }

    public String toString(){
        return "AcademicBook title=" + super.getTitle() + ", auteur=" + super.getAuteur() + ", ISBN="+super.getISBN()+", price="+super.getPrice()+" , its stock="+super.getStock()+" ,subject="+subject;
    }
}
