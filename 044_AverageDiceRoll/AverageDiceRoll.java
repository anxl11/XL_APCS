public class AverageDiceRoll{
    public static void main(String []args){
        OneThousandDiceRolls k = new OneThousandDiceRolls();
        int[] a= k.getDiceRolls();
        int sum =0;
        for (int i=0; i<1000;i++){
            sum += a[i];
            
        }
        System.out.println(sum/1000);
    }
}