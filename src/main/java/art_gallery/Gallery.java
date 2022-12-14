package art_gallery;

import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;
    private Customer customer;

   public Gallery(String name, double till) {
       this.name = name;
       this.till = till;
       this.artworks = new ArrayList<>();


   }

    public void addArtwork (Artwork artwork) {
        this.artworks.add(artwork);
    }
    public void sellArtwork(){
        for(Artwork artwork : artworks){
            if(customer.getWallet() > artwork.getPrice()){
                till += customer.getWallet();
                customer.subtractWallet(artwork.getPrice());
            }
        }


}
