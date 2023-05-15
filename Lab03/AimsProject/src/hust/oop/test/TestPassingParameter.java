package hust.oop.test;

import hust.oop.aims.ObjectSwap;
import hust.oop.aims.DigitalVideoDisc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDvd = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDvd = new DigitalVideoDisc("Cinderella");
        //changeTitle(jungleDvd, cinderellaDvd.getTitle());
        System.out.println("jungle dvd title: "+ jungleDvd.getTitle());
        ObjectSwap obj1 = new ObjectSwap(jungleDvd);
        ObjectSwap obj2 = new ObjectSwap(cinderellaDvd);
        correctSwap(obj1, obj2);
        System.out.println("obj1 after swapping: " + ((DigitalVideoDisc) obj1.obj));
        System.out.println("obj2 after swapping: "+ ((DigitalVideoDisc) obj2.obj));
    }
    public static void swap(Object obj1, Object obj2){
        Object temp = obj1;
        obj1 = obj2;
        obj2 = temp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    /*
    answer 3:
    The title of the two objects still remains after the call of swap(jungleDVD, cinderellaDVD)
    because Java is a pass-by-value language. 
    This means that when you pass the objects jungleDVD and cinderellaDVD to the swap method, you are actually passing a copy of the references to these objects. 
    The swap method then swaps the copies of these references, 
    but this has no effect on the original references outside of the method.
    On the other hand, the title of jungleDVD is changed after the call of changeTitle(jungleDVD, cinderellaDVD.getTitle()) 
    because you are directly modifying the title attribute of the jungleDVD object by calling its setTitle method. 
    This change is reflected outside of the method because you are modifying the actual object that the reference points to.
    Because of this reason, it is not possible to write a swap method that directly swaps two objects by passing them as arguments to the method. 
    However, there is a similar way to swap 2 object that is creating a new object called ObjectSwap and then swap it.
    The implementation is written below.
    */
    public static void correctSwap(ObjectSwap obj1, ObjectSwap obj2){
        Object temp = obj1.obj;
        obj1.obj = obj2.obj;
        obj2.obj = temp;
    }

}

