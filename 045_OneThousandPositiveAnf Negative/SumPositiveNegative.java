public class SumPositiveNegative{
    public static void main(String []args){
        OneThousandPositiveOrNegativeInts j = new OneThousandPositiveOrNegativeInts();
        int[] a = j.getOneThousandPositiveOrNegativeInts();
        int sum = 0;
        for(int i=0;i < a.length;i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}