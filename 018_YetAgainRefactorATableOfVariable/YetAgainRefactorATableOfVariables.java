import java.util.Scanner;

public class YetAgainRefactorATableOfVariables {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double numb1 = 1.0;
        double numb2 = 2.0;
        double numb3 = 3.0;
        double numb4 = 4.0;
        //these are the variables, type integer
        double value2_1 = Math.pow(numb1,2);
        double  value2_2 = Math.pow(numb1, 3);
        double  value3_1 = Math.pow(numb2,2);
        double value3_2 = Math.pow(numb2, 3);
        double  value4_1 = Math.pow(numb3,2);
        double  value4_2 = Math.pow(numb3, 3);
        double  value5_1 = Math.pow(numb4,2);
        double  value5_2 = Math.pow(numb4, 3);
        // these variables depend on the previous ones
        System.out.println("a  a^2  a^3");
        System.out.println(numb1+"  " +value2_1 + "    " + value2_2 );
        System.out.println(numb2+"  " +value3_1 + "    " + value3_2 );
        System.out.println(numb3+"  " +value4_1 + "    " + value4_2 );
        System.out.println(numb4+"  " +value5_1 + "   " + value5_2 );
        // these lines will print out the 'table'
        System.out.println("Which row do you want to see?");
        double num = scan.nextDouble();
        //prompt the user to give input
        double numSqr = Math.pow(num, 2);
        double numCube = Math.pow(num, 3);
        //calculate the values
        System.out.println("In order, the values for each column that corresponds with your value are: "+ num+ " "+numSqr+" "+ numCube );        

    }
}
