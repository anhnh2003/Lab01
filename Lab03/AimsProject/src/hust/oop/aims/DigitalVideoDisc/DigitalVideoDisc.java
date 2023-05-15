package hust.oop.aims.DigitalVideoDisc;
public class DigitalVideoDisc {
    private String title;
    private String category = "Unknown";
    private String director = "Unknown";
    private int leng = 0;
    private double cost = 0.0;
    private static int nbDigitalVideoDiscs = 0;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLeng() {
        return leng;
    }
    public void setLeng(int leng) {
        this.leng = leng;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public DigitalVideoDisc(String title){
        nbDigitalVideoDiscs += 1;
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category, double cost){
        nbDigitalVideoDiscs += 1;
        this.title = title;
        this.category = category;
        this.cost = cost;

    }
    public DigitalVideoDisc(String title,String category,String director, double cost){
        nbDigitalVideoDiscs += 1;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title,String category,String director,int leng, double cost){
        nbDigitalVideoDiscs += 1;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.leng = leng;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DigitalVideoDisc)) {
            return false;
        }
        DigitalVideoDisc emp = (DigitalVideoDisc) obj;
        return this.title == emp.title;
    }
    private final int id = nbDigitalVideoDiscs +1000;
    public int getID(){
        return this.id;
    } 
    @Override
    public String toString(){
        return this.getID()+".DVD - "+this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLeng()+" - "+this.getCost()+"$\n";
    }
}
