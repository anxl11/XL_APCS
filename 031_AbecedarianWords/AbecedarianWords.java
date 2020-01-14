import java.util.Scanner;
public class AbecedarianWords{
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Please input your word");
        String input = new String(scan.next());
        for(int ii = 2;ii<=input.length();ii++){
            String letter = new String(input.substring(ii-2, ii-1));
            String letternext = new String(input.substring(ii-1, ii));
            int compare = letter.compareToIgnoreCase(letternext);
            //all cycles to the next letter
            
            if (compare<0){
                //all when the first letter appears sonner on the alphabet
                System.out.println("verified abecedarian");
            }
            else{
                System.out.println("not abecedarian");
            }
        }
        
    }
}