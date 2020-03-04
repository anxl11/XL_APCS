import java.util.Scanner;
public class Table{
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        CardDispenser c = new CardDispenser();
        c.deal1();
        c.deal2();
        c.getScore();
        System.out.println("");
        c.hit();
        c.hit();
        c.compare();
       // c.Dispense(RandomNum);
        
    }
}