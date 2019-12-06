import java.util.Scanner;
public class FizzBuzzForLoop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a positive integer: ");
        int numm = scan.nextInt();
      
        for(int i=1; i<=numm;i++){
            if(i%3!=0 && i%5 !=0){
                System.out.println(i);
            }
            else if (i%3==0 && i%5 !=0){
                    System.out.println("fizz");
                  
                }
            else if (i%3!=0 && i%5 ==0){
                    System.out.println("buzz");
                   
                }
            else if (i%3==0 && i%5 ==0){
                    System.out.println("fizzbuzz");
                    
                }
            
        }
    }
}