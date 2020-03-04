import java.util.Scanner;
public class Phone{
    double Data;
    double Memory;
    String i;
    double Flash= (int)(Math.random()+1);
   Scanner scan = new Scanner(System.in);
    public Phone(double cMemory, double cTroubleshoot, String cRing, double cData){
       

    }
    // methods for phone
    
    public void DataTap(double cData){
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
} 