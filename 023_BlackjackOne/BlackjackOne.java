import java.util.Scanner;
public class BlackjackOne{
    public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    int c1 = (int)(Math.random()*14+1);
    int c2 = (int)(Math.random()*14+1);
    int face = (int)(Math.random()*3+1);
    int d1;
    int d2;
    String n;
    int deal = (int)(Math.random()*10+1)+(int)(Math.random()*10+1);
    //System.out.println("Please state whether you want to hit or stay")
  //  String m = new String(scan.next());

  
   
  


    
    if (c1<=10&&c1!=1){
        if (c2<=10&&c2!=1){
            d1 = c1;
            d2 = c2;
            int sum = d1+d2;
            System.out.println("you have a "+c1+ " and a "+ c2+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
            System.out.println("Please state whether you want to hit or stay");
            String m = new String(scan.next());
            if (m.equals("hit")){
            sum = sum + (int)(Math.random()*10+1);
                if (sum>21){
                System.out.println("You have busted");
                }
                else{
                    if (sum>deal){
                        System.out.println("You have won");
                    }
                    else if (sum<deal){
                        System.out.println("You have lost");
                    }
                    else {
                        System.out.println("draw");
                    }

                }
        }
    
         }
        else if(c2==10){
            if (face==1){
                d1 = c1;
                d2 = 10;
                int sum = d1+d2;
                n = "Jack";
                System.out.println("you have a "+c1+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else if(face==2){
                d1 = c1;
                d2 = 10;
                int sum = d1+d2;
                n = "Queen";
                System.out.println("you have a "+c1+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else{
                d1 = c1;
                d2 = 10;
                int sum = d1+d2;
                n = "King";
                System.out.println("you have a "+c1+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);

                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
        }
        else{
                d1 = c1;
                d2 = 1;
                int sum = d1+d2;
                n = "Ace";
                System.out.println("you have a "+c1+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}

        }

        
    }




    
    
    
    
    
    

    else if (c1==11){
        if (c2<=10&&c2!=1){
            d1 = 10;
            d2 = c2;
            int sum = d1+d2;
        System.out.println("you have a Jack"+ " and a "+ c2+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
        System.out.println("Please state whether you want to hit or stay");
        String m = new String(scan.next());
        if (m.equals("hit")){
            sum = sum + (int)(Math.random()*10+1);
                if (sum>21){
                System.out.println("You have busted");
                }
                else{
                    if (sum>deal){
                        System.out.println("You have won");
                    }
                    else if (sum<deal){
                        System.out.println("You have lost");
                    }
                    else {
                        System.out.println("draw");
                    }

                }}
         }
        else if(c2==10){
            if (face==1){
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "Jack";
                System.out.println("you have a Jack"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else if(face==2){
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "Queen";
                System.out.println("you have a Jack "+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else{
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "King";
                System.out.println("you have a Jack"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            }
        else{
                d1 = 10;
                d2 = 1;
                int sum = d1+d2;
                n = "Ace";
                System.out.println("you have a Jack "+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}

            }
        }
    



    

        
        else if (c1==11){
            if (c2<=10&&c2!=1){
                d1 = 10;
                d2 = c2;
                int sum = d1+d2;
            System.out.println("you have a Jack"+ " and a "+ c2+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
            System.out.println("Please state whether you want to hit or stay");
            String m = new String(scan.next());
            if (m.equals("hit")){
                sum = sum + (int)(Math.random()*10+1);
                    if (sum>21){
                    System.out.println("You have busted");
                    }
                    else{
                        if (sum>deal){
                            System.out.println("You have won");
                        }
                        else if (sum<deal){
                            System.out.println("You have lost");
                        }
                        else {
                            System.out.println("draw");
                        }
    
                    }}
        }
            else if(c2==10){
                if (face==1){
                    d1 = 10;
                    d2 = 10;
                    int sum = d1+d2;
                    n = "Jack";
                    System.out.println("you have a Jack"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                    System.out.println("Please state whether you want to hit or stay");
                    String m = new String(scan.next());
                    if (m.equals("hit")){
                        sum = sum + (int)(Math.random()*10+1);
                            if (sum>21){
                            System.out.println("You have busted");
                            }
                            else{
                                if (sum>deal){
                                    System.out.println("You have won");
                                }
                                else if (sum<deal){
                                    System.out.println("You have lost");
                                }
                                else {
                                    System.out.println("draw");
                                }
            
                            }}
                }
                else if(face==2){
                    d1 = 10;
                    d2 = 10;
                    int sum = d1+d2;
                    n = "Queen";
                    System.out.println("you have a Jack "+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                    System.out.println("Please state whether you want to hit or stay");
                    String m = new String(scan.next());
                    if (m.equals("hit")){
                        sum = sum + (int)(Math.random()*10+1);
                            if (sum>21){
                            System.out.println("You have busted");
                            }
                            else{
                                if (sum>deal){
                                    System.out.println("You have won");
                                }
                                else if (sum<deal){
                                    System.out.println("You have lost");
                                }
                                else {
                                    System.out.println("draw");
                                }
            
                            }}
                }
                else{
                    d1 = 10;
                    d2 = 10;
                    int sum = d1+d2;
                    n = "King";
                    System.out.println("you have a Jack"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                    System.out.println("Please state whether you want to hit or stay");
                    String m = new String(scan.next());
                    if (m.equals("hit")){
                        sum = sum + (int)(Math.random()*10+1);
                            if (sum>21){
                            System.out.println("You have busted");
                            }
                            else{
                                if (sum>deal){
                                    System.out.println("You have won");
                                }
                                else if (sum<deal){
                                    System.out.println("You have lost");
                                }
                                else {
                                    System.out.println("draw");
                                }
            
                            }}
                }
        }
            else{
                    d1 = 10;
                    d2 = 1;
                    int sum = d1+d2;
                    n = "Ace";
                    System.out.println("you have a Jack "+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                    System.out.println("Please state whether you want to hit or stay");
                    String m = new String(scan.next());
                    if (m.equals("hit")){
                        sum = sum + (int)(Math.random()*10+1);
                            if (sum>21){
                            System.out.println("You have busted");
                            }
                            else{
                                if (sum>deal){
                                    System.out.println("You have won");
                                }
                                else if (sum<deal){
                                    System.out.println("You have lost");
                                }
                                else {
                                    System.out.println("draw");
                                }
            
                            }}
    
            }
    
    }


    else if (c1==12){
        if (c2<=10&&c2!=1){
            d1 = 10;
            d2 = c2;
            int sum = d1+d2;
        System.out.println("you have a Queen"+ " and a "+ c2+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
        System.out.println("Please state whether you want to hit or stay");
        String m = new String(scan.next());
        if (m.equals("hit")){
            sum = sum + (int)(Math.random()*10+1);
                if (sum>21){
                System.out.println("You have busted");
                }
                else{
                    if (sum>deal){
                        System.out.println("You have won");
                    }
                    else if (sum<deal){
                        System.out.println("You have lost");
                    }
                    else {
                        System.out.println("draw");
                    }

                }}
    }
        else if(c2==10){
            if (face==1){
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "Jack";
                System.out.println("you have a Queen"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else if(face==2){
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "Queen";
                System.out.println("you have a Queen "+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else{
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "King";
                System.out.println("you have a Queen"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
    }
}
  

    
    
    
    
    
    
     else if  (c1==13){
        if (c2<=10&&c2!=1){
            d1 = 10;
            d2 = c2;
            int sum = d1+d2;
        System.out.println("you have a King"+ " and a "+ c2+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
        System.out.println("Please state whether you want to hit or stay");
        String m = new String(scan.next());
        if (m.equals("hit")){
            sum = sum + (int)(Math.random()*10+1);
                if (sum>21){
                System.out.println("You have busted");
                }
                else{
                    if (sum>deal){
                        System.out.println("You have won");
                    }
                    else if (sum<deal){
                        System.out.println("You have lost");
                    }
                    else {
                        System.out.println("draw");
                    }

                }}
        }
        else if(c2==10){
            if (face==1){
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "Jack";
                System.out.println("you have a King"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else if(face==2){
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "Queen";
                System.out.println("you have a King "+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else{
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "King";
                System.out.println("you have a King"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
        }
    }


    
    
    
    
    
      
    
    else if (c1==1){
       if (c2<=10&&c2!=1){
            d1 = 10;
            d2 = c2;
            int sum = d1+d2;
        System.out.println("you have a King"+ " and a "+ c2+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
        System.out.println("Please state whether you want to hit or stay");
        String m = new String(scan.next());
        if (m.equals("hit")){
            sum = sum + (int)(Math.random()*10+1);
                if (sum>21){
                System.out.println("You have busted");
                }
                else{
                    if (sum>deal){
                        System.out.println("You have won");
                    }
                    else if (sum<deal){
                        System.out.println("You have lost");
                    }
                    else {
                        System.out.println("draw");
                    }

                }}
        }
        else if(c2==10){
            if (face==1){
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "Jack";
                System.out.println("you have a King"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else if(face==2){
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "Queen";
                System.out.println("you have a King "+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
            else{
                d1 = 10;
                d2 = 10;
                int sum = d1+d2;
                n = "King";
                System.out.println("you have a King"+ " and a "+ n+" and their respective values are "+ d1+" "+ d2+ " . The total value on your hand is "+ sum);
                System.out.println("Please state whether you want to hit or stay");
                String m = new String(scan.next());
                if (m.equals("hit")){
                    sum = sum + (int)(Math.random()*10+1);
                        if (sum>21){
                        System.out.println("You have busted");
                        }
                        else{
                            if (sum>deal){
                                System.out.println("You have won");
                            }
                            else if (sum<deal){
                                System.out.println("You have lost");
                            }
                            else {
                                System.out.println("draw");
                            }
        
                        }}
            }
        }
    }
    


}

    }




      
    
   
    

    