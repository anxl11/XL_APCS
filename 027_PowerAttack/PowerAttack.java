public class PowerAttack{
    public static void main(String[]args){
        
        int str = 3;
        while(str<11){
            
            int bonus = (int)(Math.random()*10+1);
            str += bonus;
            System.out.println("Your attack deals "+str);
        }
        System.out.println("You have damaged the monster with your "+ str+ " damage swing");
    }
}