public class EcoCart{
    
abstract class Product{
    int id= 19;
    String name="box";
    double price=100.20;

public int getId(){
    return id;
} 
public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setId(int id){
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    public void setprice(double price) {
            this.price = price;
        } 

private void getDiscountedPrice(int dp){  

}
class OrganicProduct{
    double discount=0.10*price;
}
class RecycledProduct{
    double discount=0.05*price;
}

class Cart{
    void addItem(){
        return;
    }

}
}
}
