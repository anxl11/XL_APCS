import java.util.Scanner;
public class CarBuilderOne{
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println(" What is the model name of your car? Please type below: ");
        String carName = scan.nextLine();
        
        
        System.out.println(" Please specify its manufacturer here:");
        String manufactureName = scan.nextLine();
        
        System.out.println(" Please specify its manufacture year here");
        int manufactureYear =scan.nextInt();
        
        //System.out.println("");
        System.out.println(" Please include the car's mileage here");
        int mileage =scan.nextInt();
        Car c = new Car(manufactureYear,mileage,manufactureName,carName);
        System.out.println("We have found a car with the name of "+ c.modelName+" made in "+ c.year +" ,miles dirven: "+ c.milesDriven+ " ,made by "+ c.manufacturerName);
       // System.out.println(cus.carName+" made in "+ cus.manufactureYear +" ,miles dirven: "+ cus.mileage+ " ,made by "+ cus.manufactureName+ " found one our website");
    }

}