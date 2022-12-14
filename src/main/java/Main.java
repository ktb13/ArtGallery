import art_gallery.Artist;
import art_gallery.Artwork;
import art_gallery.Customer;
import art_gallery.Gallery;

public class Main {

    public static void main(String[] args) {
        Artist artist = new Artist("Vincent van Gogh");

        Artwork artwork = new Artwork("The Starry Night", artist, 2000, 150);
        System.out.println(artwork.getPrice());


        Customer customer = new Customer("John", 3000);
        System.out.println("Wallet: " + customer.getWallet());

        Gallery gallery = new Gallery("YK Gallery", 1300, customer);
        gallery.addArtwork(artwork);

        ArrayList<Artwork> artworksList = gallery.getArtworks();

        for(Artwork artwork1 : artworksList){
            System.out.println(artwork1.getTitle());
        }

        gallery.sellArtwork();
        System.out.println("Wallet after purchasing: " + customer.getWallet());
    }
}






    }

}





