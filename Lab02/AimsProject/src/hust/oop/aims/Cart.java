package hust.oop.aims;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    public String addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered<19){
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added");
        } else if(qtyOrdered == 19){
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added. The cart is full");
        } else {
            System.out.println("Cannot add the disc to your cart because the cart is full");
        }
        return("");
    }
    public String removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered <= 0){
            System.out.println("Cannot remove the disc because the cart is empty");
            return("");
        }
        for(int i = 0; i< qtyOrdered;i ++){
            if(itemOrdered[i].equals(disc)){
                itemOrdered[i] = itemOrdered[qtyOrdered-1];
                itemOrdered[qtyOrdered-1] = null;
                qtyOrdered -= 1;
                System.out.println("The disc has been removed");
                return("");
            }
        }
        System.out.println("The disc isn't in the cart");
        return("");
    }
    public float totalCost(){
        float total = 0.0f;
        for(int j = 0; j < qtyOrdered;j++){
            total += itemOrdered[j].getCost();
        }
        return(total);
    }
    public String addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        ///check the quantity
        if((dvdList.length + qtyOrdered) <= MAX_NUMBERS_ORDERED){
            for(int i = 0; i < dvdList.length; i++){
                itemOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered ++;
            }
            System.out.println("All the discs have been added");
            System.out.println("qty is: " + qtyOrdered);
        } else {
            System.out.println("You've reached the maximum number of discs");
        }
        return("");
    }
    public String addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if((qtyOrdered+2)<=MAX_NUMBERS_ORDERED){
            itemOrdered[qtyOrdered] = dvd1;
            itemOrdered[qtyOrdered+1] = dvd2;
            qtyOrdered += 2;
            System.out.println("All the discs have been added");
            System.out.println("qty is: " + qtyOrdered);
        } else {
            System.out.println("You've reached the maximum number of discs");
        }
        return("");
    }
    @Override
    public String toString(){
        System.out.println("***********************CART***********************");
        for(int i = 0; i < qtyOrdered;i++){
            System.out.printf("%d.DVD - %s - %s - %s - %d : %.2f$\n",itemOrdered[i].getID(),itemOrdered[i].getTitle(),itemOrdered[i].getCategory(),itemOrdered[i].getDirector(),itemOrdered[i].getLeng(),itemOrdered[i].getCost());
        }
        System.out.println("Total cost: "+this.totalCost());
        System.out.println("***************************************************");
        return("");
    }
    public String searchID(int id){
        ///binary search through itemOrdered
        int i;
        for(i = 0; i < qtyOrdered; i++){
            if(itemOrdered[i].getID() == id){
                System.out.println("The result is:");
                System.out.println(itemOrdered[i]);
                return("");
            }
        }
        System.out.println("The ID does't exist!");
        return("");
    }
    public String searchTitle(String title){
        int i;
        for(i = 0; i < qtyOrdered; i++){
            if(itemOrdered[i].getTitle() == title){
                System.out.println("The result is:");
                System.out.println(itemOrdered[i]);
                return("");
            }
        }
        System.out.println("The title does't exist!");
        return("");
    }
}

