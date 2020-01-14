import java.util.Scanner;
public class UsingThePhone{
    
    
    public static void main(String[] args) {
    
    double data;
    double Memory;
    String i;
    double Flash= (int)(Math.random()+1);
        
        
        
        
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Are you on your data though you're at home? 1 for yes, 0 for no ");
        data = scan.nextDouble();
        System.out.println("What's your phone's m,epry capacity in Gb?");
        Memory = scan.nextDouble();
        System.out.println("What's your ringtone? ");
        i = scan.next();

        Phone UrPhone = new Phone(Memory,Flash,i,data);
        System.out.println("Phone activated. The following actions are being taken: Flash button pressed, phone memory being reported, data being turned off if wifi is available,");
        System.out.println("");
        UrPhone.pressFlashLight(Flash);
        UrPhone.DataTap(data);
        UrPhone.ringTone(i);
    }
}