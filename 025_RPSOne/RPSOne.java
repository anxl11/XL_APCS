import java.util.Scanner;
public class RPSOne{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        
        
        System.out.println("Please input your choice: (r for rock, s for scissors, and p for paper");
        // prompts user to input
        String p = new String(scan.next());
        int c = (int)(Math.random()*3+1);
        // computer's choice
        String pc = new String();
        String rock = new String("r");
        String sci= new String("s");
        String pp = new String("p");
        // if and else statements that account for every single possibility
        if (c ==1){
            pc = rock;
            if (p.equals(sci)  ){
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("You have won");
            }
            else if (p.equals(pp)){
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("You have lost");
            }
            else{
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("Draw");
            }
        }
        else if (c ==2){
            pc = pp;
            if (p.equals(sci)  ){
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("You've lost");
            }
            else if (p.equals(pp)){
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("Draw");
            }
            else{
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("You have won");
            }
        }
        else{
            pc = sci;
            if (p.equals(sci)  ){
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("Draw");
            }
            else if (p.equals(pp)){
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("You've lost");
            }
            else{
                System.out.println("You ahve chosen "+ p+ " and the computer's choice is "+ pc);
                System.out.println("You have won");
            }
        }


    }
}