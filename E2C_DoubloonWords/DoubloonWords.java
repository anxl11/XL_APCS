import java.util.Scanner;
public class DoubloonWords{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        boolean doub = true;
        System.out.println("Please input your word");
        String word = new String(scan.next().toLowerCase());
        for (int i =0; i<word.length();i++){
            int frequency = 0;
            for( int ii = 0; ii<word.length();ii++){
                if(word.charAt(i)==word.charAt(ii)){
                    frequency++;
                }
            }
            if (frequency!=2){
                doub = false;
                break;
            }
            else{
                doub = true;
            }
        }
        if (doub== true){
            System.out.println("doubloon");
        }
        else{
            System.out.println(" not doubloon");
        }
    }
}