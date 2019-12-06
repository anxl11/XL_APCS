public class MaximumIntegers{
    public static void main(String[]args){
        Integer int1 = new Integer(24);
       
        Integer max1 = new Integer(int1.MAX_VALUE);
        Integer min1 = new Integer(int1.MIN_VALUE);
        //find min max values
        System.out.println(max1);
        System.out.println(min1);
        int var1 = 1000001-min1;
        int var2 = max1 - 744;
        //over and underflow
        Integer overflow = new Integer(max1+var1);
        Integer underflow = new Integer(min1-var2);
        System.out.println(overflow);
        System.out.println(underflow);
    }
}