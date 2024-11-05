import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private  ArrayList <Media> purchaseMediaList=new ArrayList<>();
    private ArrayList <Media> shoppingCart=new ArrayList<>();


User(String username,String email){
    this.username=username;
    this.email=email;
}
    //setter && getters


    public String getUsername() {
        return username;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setPurchaseMediaList(Media media) {
        this.purchaseMediaList.add(media);
    }

    public void addToCar(Media media){
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }

    public void checkOut(){
        for(Media sh:shoppingCart){
            int stockOfThis;
            purchaseMediaList.add(sh);
            if (sh instanceof Book) {
              stockOfThis=  ((Book) sh).getStock()-1;
              ((Book) sh).setStock(stockOfThis);
           }
        }shoppingCart.clear();
    }
}
