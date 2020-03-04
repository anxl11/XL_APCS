public class WeeklyHighTemps{
    public static void main(String []args){
        //initialize
        int[] weather = {40,34,26,23,24};
        //loop
        for (int i=0; i<5;i++){
            System.out.println("the high temp on day "+(i+1)+ " is "+ weather[i]);
        }
    }
}