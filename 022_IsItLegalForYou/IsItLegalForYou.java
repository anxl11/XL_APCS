import java.util.Scanner;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.And;
public class IsItLegalForYou{
    public static void main (String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your age as number");
        int age = scan.nextInt();
       // System.out.println(age);
        if (age < 15){
            System.out.println("It is not legal for you to get a driver license, buy cigarettes, go to a casino,buy alcohol, or rent a car ");
        }
        else if (15<=age && age < 18){
           System.out.println("It is legal for you to get a driver license, but not to buy cigarettes, go to a casino,buy alcohol, or rent a car "); 
        }
        else if (18<= age && age <21 ){
           System.out.println("It is legal for you to get a driver license, buy cigarettes, go to a casino, but not to buy alcohol or rent a car ");
        }
        else {
            System.out.println("It is legal for you to get a driver license, buy cigarettes, go to a casino, buy alcohol, and rent a car ");
        }

       
    }
}