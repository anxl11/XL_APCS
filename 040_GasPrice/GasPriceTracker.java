 public class GasPriceTracker{
     private String name;
     private double price;
     // constructor
     public GasPriceTracker(String cName, double cPrice){
        price = cPrice;
        name = cName;
     }
    public String getName( ){
        return name;
    }
    public double getPrice(){
        return price;
    }
    //methos
    public void printname(GasPriceTracker x){
        System.out.println("the name is "+ name+" and the price is: "+ price);
    }
 }