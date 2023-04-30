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
            System.out.println("Cannot remove the disc because the cart is empty\n");
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
        System.out.println("The disc isn't in the cart\n");
        return("");
    }
    public float totalCost(){
        float total = 0.0f;
        for(int j = 0; j < qtyOrdered;j++){
            total += itemOrdered[j].getCost();
        }
        return(total);
    }
}
