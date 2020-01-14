import java.util.Scanner;
public class CardDispener{

    Scanner scan = new Scanner(System.in);
    private int RandomNum = (int)(Math.random()+13);
    int playerVal=0;
    public int player(int c){
        playerVal = c;
    }
    public void CardDispenser(int cRandomNum){
        RandomNum = cRandomNum;
        while(playerVal<21){
            if(RandomNum<=10){
               RandomNum  = cRandomNum ;
                playerVal+= cRandomNum;
            }
        }
    }
}