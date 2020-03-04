import java.util.Scanner;
public class CardDispenser{

    Scanner scan = new Scanner(System.in);
    int RandomNum = (int)(Math.random()*13+1);
    boolean hit;
    int sum=0;
    int dealer=(int)(Math.random()*13+1)+(int)(Math.random()*13+1);
    int dealerhit;
    String c1;
    String c2;
    public CardDispenser(){
    }
    public void deal1(){
       
        while(dealer<16){
           dealer+=(int)(Math.random()*13+1);
       }
        sum+= RandomNum;
        if(sum<=21){
            System.out.println(sum);
            if (sum<11){
            System.out.println("You got a "+ sum);
            }
            else if (sum==11){
            System.out.println("You got a "+ "Jack");
            }
            else if (sum==12){
            System.out.println("You got a "+ "Queen");
            }
            else if (sum==13){
            System.out.println("You got a "+ "King");
            }
        }
        else{
            System.out.println("Bust");
        }
    }
    public void deal2(){
      
        sum+= (int)(Math.random()*13+1);
        if(sum<=21){
            System.out.println(sum);
            if (RandomNum<11){
            System.out.println("You got a "+ RandomNum);
            }
            else if (RandomNum==11){
            System.out.println("You got a "+ "Jack");
            }
            else if (RandomNum==12){
            System.out.println("You got a "+ "Queen");
            }
            else if (RandomNum==13){
            System.out.println("You got a "+ "King");
            }
        }
        else{
            System.out.println("Bust");
        }
    }
    public void getScore(){
        System.out.println("your sum is "+sum);
    }
    public void hit(){
        System.out.println("If you want to hit, input (y). else input (n)");
        c1 = scan.next();
        if (c1.equals("y")){
            if (sum<21){
                sum+= RandomNum;
            if (RandomNum<11){
                System.out.println("You got a "+ RandomNum);
                }
                else if (RandomNum==11){
                System.out.println("You got a "+ "Jack");
                }
                else if (RandomNum==12){
                System.out.println("You got a "+ "Queen");
                }
                else if (RandomNum==13){
                System.out.println("You got a "+ "King");
                }
            }
            else{
                System.out.println("Bust");
            }
     
            System.out.println(sum);

        }
        
     //   else{
        //    System.out.println(" You have lost already");
       // }
    }
        public void compare(){
            if (sum<=21){
                if (sum>dealer&&dealer<21){
                System.out.println(" Your sum is "+sum+ " and the dealer's is "+ dealer+". You have won");
                }
                
                else if (sum == dealer&&dealer<21){
                System.out.println(" Your sum is "+sum+ " and the dealer's is "+ dealer+". Draw");

              }   
           
          

            
            else  if (sum<dealer&&dealer<21){
                System.out.println(" Your sum is "+sum+ " and the dealer's is "+ dealer+". Lost");

            }
            else{
                System.out.println(" Your sum is "+sum+ " and the dealer's is "+ dealer+". Win");

            }
        }
            else{
            System.out.println(" You have lost already");

    }
    }
}         

    

   
