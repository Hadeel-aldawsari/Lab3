import java.util.ArrayList;

public class Store {

    private ArrayList<User>userArrayList=new ArrayList<>();
    private ArrayList<Media>mediaArrayList=new ArrayList<>();



    public void addUser(User user){
        userArrayList.add(user);
    }

    public ArrayList<User> displayUser(){
        return this.userArrayList;
    }

    public void addMedia(Media media){
        this.mediaArrayList.add(media);
    }



    public ArrayList<Media> displayMedias(){
        return mediaArrayList;
    }

    public Book searchBook(String title) {
        for (Media media : mediaArrayList) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }return null;
    }


    }

