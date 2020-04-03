
import java.util.*;

public class AverageOfDice{
    ArrayList<Integer> array = new ArrayList<>();
    int latest;
    int sum=0;
    
   
    public static void main(String[]args){ 
        AverageOfDice a = new AverageOfDice();
        boolean boo = false;
        Scanner scan = new Scanner(System.in);
        while (!boo){
        
        System.out.println("Do you wish to roll? (y) for yes (n) for no");
        String answer = scan.next();
       
        if(answer.equals("y")){
            a.getDie();
            a.theOne();
            boo = false;
        }
        else if(answer.equals("n")){
            boo = true;
        }
        }
    }
    public int getDie(){
        return (int)(Math.random()*100+1);
      
    }
    public void theOne(){
        int i =(int)(Math.random()*100+1);
        System.out.println("The Latest value is: "+ i);
        array.add(i);
        for (int x: array){
            sum+= x;

        }
        System.out.println("The average is "+ sum/array.size());
        sum = 0;
    }

    }   


