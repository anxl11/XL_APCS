import java.util.Scanner;
public class DateTranslator{
    int month;
    int date;
    int year;
   
    public static void main(String[]args){
        DateTranslator dt = new DateTranslator();
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input your:");
    System.out.println("day");
    int day = scan.nextInt();
    System.out.println("month");
    int month = scan.nextInt();
    System.out.println("year");
    int year = scan.nextInt();
    System.out.println("Please choose your format, e for european and a for American");
    String format = scan.next();
    if (format.equals("e")){
        dt.EuroDay(day, month, year);
    }
    else if (format.equals("a")){
        dt.MuricaDay(day, month, year);
    }
    else{
        System.out.println("Please review your input");
    }
    }
    public void EuroDay(int cDay,int cMonth,int cYear){
        date = cDay;
        month = cMonth;
        year = cYear;
        System.out.println(cDay+ "/"+ cMonth+ "/"+ cYear);
    }
    public void MuricaDay(int cDay,int cMonth,int cYear){
        date = cDay;
        month = cMonth;
        year = cYear;
        System.out.println( cMonth+"/"+ cDay+ "/"+ cYear);
    }

    }
    
