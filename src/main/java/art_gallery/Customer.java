package art_gallery;

import java.util.ArrayList;

public class Customer {


    private String name;
    private int wallet;
    private ArrayList<Artwork> purchasedArtworks;


    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;


    }
    public double getWallet(){
        return wallet;



    }

    public void subtractWallet(double payment){
        wallet -= payment;



}
