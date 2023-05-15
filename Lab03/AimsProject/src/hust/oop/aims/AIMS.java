package hust.oop.aims;

import hust.oop.aims.DigitalVideoDisc.DigitalVideoDisc;
import hust.oop.aims.cart.Cart;

public class AIMS {
    public static void main(String[] args) throws Exception {
        //create a new Cart
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87,19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87,24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",18.99f);
        cart.addDigitalVideoDisc(dvd3);
        System.out.println("The total cost is:");
        System.out.println(cart.totalCost());
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers", null, null, 0, 0);
        cart.removeDigitalVideoDisc(dvd4);
        System.out.println(cart);
        System.out.println(dvd4);
        cart.searchID(1002);
        cart.searchTitle("Aladin");
    }
}
