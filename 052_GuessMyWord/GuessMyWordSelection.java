import java.util.*;

public class GuessMyWordSelection{



    public static void main(String args[]){
        GuessMyWordSelection g = new GuessMyWordSelection();
        g.play();
    }
    public void play(){
        Scanner scan = new Scanner(System.in);
		String correct = "title";
        //setting up the arraylist
		ArrayList<String> arr= new ArrayList<String>();
        arr.add(correct);
        //prompts the user
		System.out.println("Your input:");
        String player = scan.next();
		//while the user has not found the correct answer
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
            //declare if the word is above or below
            if(arr.indexOf(player)>arr.indexOf(correct)){
              System.out.println("the word is above this");
            }
            else if(arr.indexOf(player)<arr.indexOf(correct)){
              System.out.println("the word is below this");
            }
            
        }
        //prompts the user repeatedly if they havent found the answer
       System.out.println("Your input:");
        player = scan.next();
        
       }
       //pops up when they win
     System.out.println("Congrats");
     System.out.println(arr.toString());
    }
}
		
