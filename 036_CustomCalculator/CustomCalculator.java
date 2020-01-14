import java.util.Scanner;
public class CustomCalculator{
    double num1;
    double num2;
  
    public static void main(String []args){
        CustomCalculator calc = new CustomCalculator();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your first number");
        double numOne = scan.nextDouble();
        System.out.println("Please input your second number");
        double numTwo = scan.nextDouble();
        System.out.println("Please choose your operation: add, subtract, divide, multiply, find remainder,log,power,nthRoot");
        String op = scan.next();
        if (op.equals("add")){
            calc.add(numOne, numTwo);
        }
        else if (op.equals("subtract")){
            calc.subtract(numOne, numTwo);
        }
        else if (op.equals("multiply")){
            calc.Multiply(numOne, numTwo);
        }
        else if (op.equals("divide")){
            calc.divide(numOne, numTwo);
        }
        else if (op.equals("find remainder")){
            calc.findRemainder(numOne, numTwo);
        }
        else if (op.equals("log")){
            calc.log(numOne, numTwo);
        }
        else if (op.equals("power")){
            calc.power(numOne, numTwo);
        }
        else if (op.equals("nthRoot")){
            calc.nthRoot(numOne, numTwo);
        }

    }
    public void add(double cnum1, double cNum2){
        num1 = cnum1;
        num2 = cNum2;
        System.out.println(cNum2+cnum1);
    }
    public void subtract(double cnum1, double cNum2){
        num1 = cnum1;
        num2 = cNum2;
        System.out.println(cNum2-cnum1);
    }
    public void divide(double cnum1, double cNum2){
        num1 = cnum1;
        num2 = cNum2;
        System.out.println(cnum1/cNum2 );
    }
    public void findRemainder(double cnum1, double cNum2){
        num1 = cnum1;
        num2 = cNum2;
        System.out.println(cnum1%cNum2 );
    }
    public void Multiply(double cnum1,double cNum2){
        num1 = cnum1;
        num2 = cNum2;
        System.out.println(cNum2*cnum1);
    }
    public void log(double cnum1,double cNum2){
        num1 = cnum1;
        num2 = cNum2;
        System.out.println(Math.log(cnum1)/Math.log(cNum2));
    }
    public void power(double cnum1,double cNum2){
        num1 = cnum1;
        num2 = cNum2;
        System.out.println(Math.pow(cnum1, cNum2));
    }
    public void nthRoot(double cnum1,double cNum2){
        num1 = cnum1;
        num2 = cNum2;
        System.out.println(Math.pow(cnum1, 1/cNum2));
    }

}
