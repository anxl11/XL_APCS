public class PowerAttack{
    public static void main(String[]args){
        
        int str = 3;
        //all conditions for attack's effectiveness
        while(str<11){
            
            int bonus = (int)(Math.random()*10+1);
            //all random damage value
            str += bonus;
            System.out.println("Your attack deals "+str);
        }
        System.out.println("You have damaged the monster with your "+ str+ " damage swing");
    }
}