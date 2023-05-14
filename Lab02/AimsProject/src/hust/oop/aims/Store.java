package hust.oop.aims;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[999];
    private int qtyInStore = 0;
    public void addDVD(DigitalVideoDisc dvd){
        itemsInStore[qtyInStore] = dvd;
        System.out.println("The DVD has been added to store!");
        qtyInStore ++;
    }
    public String removeDVD(DigitalVideoDisc disc){
        if(qtyInStore <= 0){
            System.out.println("Cannot remove the dvd because your store is empty!");
            return("");
        }
        for(int i = 0; i< qtyInStore;i ++){
            if(itemsInStore[i].equals(disc)){
                itemsInStore[i] = itemsInStore[qtyInStore-1];
                itemsInStore[qtyInStore-1] = null;
                qtyInStore -= 1;
                System.out.println("The disc has been removed!");
                return("");
            }
        }
        System.out.println("The dvd isn't in your store!");
        return("");
    }
}
