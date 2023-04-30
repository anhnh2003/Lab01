public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int leng = 0;
    private double cost = 0.0;
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
    public DigitalVideoDisc(String title1){
        title = title1;
    }
    public DigitalVideoDisc(String title2, String category2, double cost2){
        title = title2;
        category = category2;
        cost = cost2;

    }
    public DigitalVideoDisc(String title3,String category3,String director3, double cost3){
        title = title3;
        category = category3;
        director = director3;
        cost = cost3;
    }
    public DigitalVideoDisc(String title4,String category4,String director4,int leng4, double cost4){
        title = title4;
        category = category4;
        director = director4;
        cost = cost4;
        leng = leng4;
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
}
