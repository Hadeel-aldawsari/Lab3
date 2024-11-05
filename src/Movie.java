import java.util.ArrayList;

public class Movie extends Media{
    private int duration;



    Movie(String title,String auteur,String ISBN,double price,int duration){
        super(title,auteur,ISBN,price);
        this.duration=duration;

    }

    public void watch(User user){
        user.setPurchaseMediaList(this);

   }

    public ArrayList<Movie> recommenSimilarMovies(ArrayList<Movie>movieCatalog) {
        ArrayList<Movie> similarMovies = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                similarMovies.add(movie);
            }
        }
        return similarMovies;
        }



    public String getMediaType(){
        if(duration>=120)return "Long Movie";
        else return "Movie";
    }

    public String toString(){
        return "Movie title=" + super.getTitle() + ", auteur=" + super.getAuteur() + ", ISBN="+super.getISBN()+", price="+super.getPrice()+" , its duration="+duration;

    }

    }
