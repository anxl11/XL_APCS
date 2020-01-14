import java.util.Scanner;
public class ShippingCalculator{
    public static void main (String [ ] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter the weight of your package:");
        //all prompts user to input
        Double w = new Double(scan.nextDouble());
        double p;
        //al if and else statements that account for every single possibility.
        if (w<=0){
            System.out.println("Your value is invalid");
        }
        else if (w>0 && w<=1){
            p = 3.5;
            System.out.println("The shipping cost is:"+p);
            
        }
        else if (w>1 && w<=3){
            p = 5.5;
            System.out.println("The shipping cost is:"+p);
            
        }
        else if (w>3 && w<=10){
            p = 8.5;
            System.out.println("The shipping cost is:"+p);
            
        }
        else if (w>10 && w<=20){
            p = 10.5;
            System.out.println("The shipping cost is:"+p);
            
        }
        else{
            System.out.println("This package can't be shipped");
        }

    }
}