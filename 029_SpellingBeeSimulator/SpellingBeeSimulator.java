import java.util.Scanner;
public class SpellingBeeSimulator{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Please input your word");
        String n = new String(scan.next());
        for (int i=0;i<n.length();i++){
            System.out.print(n.substring(i,i+1));
        }
       System.out.println();
        for (int i=0;i<n.length();i++){
            System.out.print(n.substring(i,i+1));
         
           
        }
        System.out.print(". Spelled as ");
        for (int i=0;i<n.length();i++){
           
            if(i<n.length()-1){
            System.out.print(n.substring(i,i+1)+ "-");
            }
            else{
                System.out.print(n.substring(i,i+1));

            }
           
        }
        System.out.println();
    }
}