import java.util.Scanner;
public class BasicNested{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your letter");
        String inp1 = new String(scan.next());
        System.out.println("Please input your number of rows");
        int row = scan.nextInt();
        System.out.println("Please input your number of columns");
        int column = scan.nextInt();
        for (int i =0; i<= row;i++){
            System.out.println();
            if (inp1.length()==1){
                if(row<=20&&column<=20){
                    for(int ii =0; ii< column;ii++){
                        System.out.print(inp1);
                    }

                }
                else{
                    System.out.print("your number of rows and columns can not exceed 20");
                    break;
                }
            }
            else{
                System.out.print("your input must be a single letter");
            }
        }
    }
}