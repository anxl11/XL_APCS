import java.util.Scanner;
public class Phone{
    String  Data;
    double Memory;
    String i;
    String chip;
    String StringFlash;
   Scanner scan = new Scanner(System.in);
   String color;
   String brand;
   // overload constructor,3 variations
    public Phone(){
       Data = "On";
        Memory = 64;
        i = "Last Hour";
        chip ="Snapdragon";
        color = "undefinded";
        brand = "unknown";


    }
    public Phone(String cColor ){
        Data = "On";
        Memory = 64;
        i = "Last Hour";
        chip ="Snapdragon";
        color = cColor;
     
        brand = "unknown";
    }
    public Phone( String cColor, String cbrand){
        Data = "On";
        Memory = 64;
        i = "Last Hour";
        chip ="Snapdragon";
        color = cColor;
        brand = cbrand;

    }

    // methods for phone
   
   /* public void DataTap(double cData){
        cData=Data;
        if (cData==0){
            System.out.println("Data turned off");
        }
        else{
            System.out.println("Data still on.");
        }
    }
    
    public void ringTone(String ring){
        i =  ring;
        System.out.println( ring+" is being played ");
    }
    public void pressFlashLight(double cFlash){
        Flash = cFlash;
        if (cFlash==0){
            System.out.println("Flash turned on");
        }
        else{
            System.out.println("Flash turned off");
        }
    
        }
        */
    public String toString(){
      
            return "Your phone's data is "+ Data+ "  its available memory is "+ Double.toString(Memory)+ " the current alarm tone is: "+i+ " and its chip model is "+ chip+ "the color is "+ color+ " and the brand is "+ brand;
        }
  
    }
