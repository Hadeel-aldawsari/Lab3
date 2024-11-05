public class Review {
    private String username;
    private int rating=0;
    private String comment;


    public Review(String username,int rating,String comment){
    this.username=username;
    this.rating=rating;
    this.comment=comment;
    }

    public int getRating() {
        return rating;
    }
}


