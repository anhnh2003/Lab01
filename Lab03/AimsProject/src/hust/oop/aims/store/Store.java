package hust.oop.aims.store;

import hust.oop.aims.DigitalVideoDisc.DigitalVideoDisc;

public class Store{
    private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[999];
    private int qtyInStore = 0;
    public String removeDVD(DigitalVideoDisc disc){
        if(qtyInStore <= 0){
            System.out.println("Cannot remove the disc because your store is empty");
            return("");
        }
        for(int i = 0; i< qtyInStore;i ++){
            if(itemInStore[i].equals(disc)){
                itemInStore[i] = itemInStore[qtyInStore-1];
                itemInStore[qtyInStore-1] = null;
                qtyInStore -= 1;
                System.out.println("The disc has been removed");
                return("");
            }
        }
        System.out.println("The disc isn't in your store!");
        return("");
    }
    public void addDVD(DigitalVideoDisc disc){
        itemInStore[qtyInStore] = disc;
        qtyInStore ++;
        System.out.println("The disc has been added");
    }
}