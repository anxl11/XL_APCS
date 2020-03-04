import java.util.Scanner;
public class UsingThePhone{
    public static void main(String[]args){
     /*   String  Data;
        double Memory;
        String i;
        double Flash= (int)(Math.random()+1);
        String StringFlash;
       Scanner scan = new Scanner(System.in);
       String color;
       String brand;*/
        Phone phone1 = new Phone();
        Phone colored = new Phone("twilight red");
        Phone apexOFPhone = new Phone(" testosteronesque", "PURE MUSCLES");
        //mutate objects w tostring
        phone1.toString();
        colored.toString();
        apexOFPhone.toString();
        System.out.println(phone1);
        System.out.println(colored);
        System.out.println(apexOFPhone);
    }
}