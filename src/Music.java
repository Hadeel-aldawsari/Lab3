import java.util.ArrayList;

public class Music extends Media {
    private String artist;


    Music(){

    }

    Music(String title,String auteur,String ISBN,double price,String artist){
        super(title,auteur,ISBN,price);
        this.artist=artist;

    }
//setter and getters


    public void listen(User user) {
user.setPurchaseMediaList(this);
    }

    public ArrayList<Music> generalPlayList(ArrayList<Music> musicCatalog) {
        ArrayList<Music> playList = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.artist.equals(this.artist)) {
                playList.add(music);
            }
        }
        return playList;
    }



        public String getMediaType () {
            if (super.getPrice() >= 10) return "Premium Music";
            else return "Music";
        }

        public String toString () {
            return "Music title=" + super.getTitle() + ", auteur=" + super.getAuteur() + ", ISBN=" + super.getISBN() + ", price=" + super.getPrice() + " , its artist=" + artist;
        }


    public String getArtist() {
        return this.artist;
    }


}
