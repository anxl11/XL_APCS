import java.util.Scanner;
public class PantryShelf{
/*    int amount1;
    int amount2;
    int amount3;10,"cookies","strawberry",0
    int amount4;
    private int Camount;
    private int Iamount;
    private int Hamount;
    private String i;
    private String c;
    private String h;*/


    public static void main(String[]args){
        FoodItems cookie = new FoodItems(10,"cookie","red velvet",150);
        FoodItems iceCream = new FoodItems(10,"ben n jerry","chocolate",250);
        FoodItems hotDog = new FoodItems(10,"german thing","loud",300);
        // initialize
        System.out.println("On the shelf there are ");
        
        Scanner scan = new  Scanner(System.in);
        System.out.println("I am eating (c for cookie i for ice cream h for hotdog) ");
       
        String food = scan.next(); 
        System.out.println("How many servings? ");
        int f= scan.nextInt();
        //call methods based on input
        if (food.equals("c")){ 
            cookie.setCookies(f);
        }
        else if (food.equals("i")){ 
          iceCream.setIceCream(f);
        }
         else if (food.equals("h")){ 
           hotDog.setHotdog(f);
        }
       
        
    
    
    
    
    }
       
    }
           