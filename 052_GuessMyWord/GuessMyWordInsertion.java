import java.util.*;

public class GuessMyWordInsertion{

	

    public static void main(String args[]){
		GuessMyWordInsertion g = new GuessMyWordInsertion();
        g.play();
    }
    public void play(){
        Scanner scan = new Scanner(System.in);
		String correct = "title";
		ArrayList<String> arr= new ArrayList<String>();
        //sets up the arrraylist
        arr.add(correct);
		System.out.println("Your input:");
        String player = scan.next();
		
		while(!player.equals(correct)){
			arr.add(player);
			for (int i = 0; i < arr.size(); i++) {
            // find position of smallest num between (i + 1)th element and last element
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j).compareTo(arr.get(pos))<0)
                    pos = j;
            }
            // Swap min (smallest num) to current position on array
            String min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);
         
            
        }
        //reports whether the correct answer is above/below the input
        if(arr.indexOf(player)>arr.indexOf(correct)){
              System.out.println("the word is above this");
            }
        else if(arr.indexOf(player)<arr.indexOf(correct)){
              System.out.println("the word is below this");
            }
            //prompts the player repeatedly 
        System.out.println("Your input:");
        player = scan.next();
        
       }
       //once the player guesses the word right, this pops up
     System.out.println("Congrats");
     System.out.println(arr.toString());
    }
}
		