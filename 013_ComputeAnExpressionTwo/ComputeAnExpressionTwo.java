public class ComputeAnExpressionTwo{
    public static void main(String[] args){
        double num1 = 9.5;
        double num2 = 4.5;
        double num3 = 2.5;
        double num4 = 3;
        double num5 = 45.5;
        double num6 = 3.5;
        //variables
        /*double res1 = num1*num2;
        double res2 = num3*num4;
        double res3 = num5 - num6;
        double finres = (res1 - res2)/res3;
        
        //build a new calculator*/
        ReturningCalculator calc = new ReturningCalculator();
        System.out.println((calc.doubleMultiplier(9.5,4.5)-calc.doubleMultiplier(2.5,3))/calc.doubleSubtractor(45.5,3.5));
    
    }
}
//9.5  4.5 - 2.5  345.5 - 3.5
