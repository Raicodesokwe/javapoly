package polymorphism;

public class Food {
    int price;
    public Food(int price){
        this.price=price;
    }
    public void eat(){
        System.out.println("Iam the eat method");

    }
    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
