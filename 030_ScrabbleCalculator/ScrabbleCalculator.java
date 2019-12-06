import java.util.Scanner;


public class ScrabbleCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your word");
        String player = new String(scan.next().toLowerCase());
        int value = 0;
        String a = new String("a");
        String e = new String("e");
        String i = new String("i");
        String o = new String("o");
        String u = new String("u");
        String l = new String("l");
        String n = new String("n");
        String s = new String("s");
        String t = new String("t");
        String r = new String("r");
        String d = new String("d");
        String g = new String("g");
        String b = new String("b");
        String c = new String("c");
        String m = new String("m");
        String p = new String("p");
        String f = new String("f");
        String h = new String("h");
        String v = new String("v");
        String w = new String("w");
        String y = new String("y");
        String k = new String("k");
        String j = new String("j");
        String x = new String("x");
        String q = new String("q");
        String z = new String("z");
        int capA = player.length() - player.replaceAll("a", "").length();
        int capB = player.length() - player.replaceAll("b", "").length();
        int capC = player.length() - player.replaceAll("c", "").length();
        int capD = player.length() - player.replaceAll("d", "").length();
        int capE = player.length() - player.replaceAll("e", "").length();
        int capF = player.length() - player.replaceAll("f", "").length();
        int capG = player.length() - player.replaceAll("g", "").length();
        int capH = player.length() - player.replaceAll("h", "").length();
        int capI = player.length() - player.replaceAll("i", "").length();
        int capJ = player.length() - player.replaceAll("j", "").length();
        int capK = player.length() - player.replaceAll("k", "").length();
        int capL = player.length() - player.replaceAll("l", "").length();
        int capM = player.length() - player.replaceAll("m", "").length();
        int capN = player.length() - player.replaceAll("n", "").length();
        int capO = player.length() - player.replaceAll("o", "").length();
        int capP = player.length() - player.replaceAll("p", "").length();
        int capQ = player.length() - player.replaceAll("q", "").length();
        int capR = player.length() - player.replaceAll("r", "").length();
        int capS = player.length() - player.replaceAll("s", "").length();
        int capT = player.length() - player.replaceAll("t", "").length();
        int capU = player.length() - player.replaceAll("u", "").length();
        int capV = player.length() - player.replaceAll("v", "").length();
        int capW = player.length() - player.replaceAll("w", "").length();
        int capX = player.length() - player.replaceAll("x", "").length();
        int capY = player.length() - player.replaceAll("y", "").length();
        int capZ = player.length() - player.replaceAll("z", "").length();
      


       
         for (int ii=1; ii <= player.length();ii++){
            
            String letter = new String(player.substring(ii-1, ii));
           
            if (capA<=9&&capB<=2&&capC<=2&&capD<=4&&capE<=12&&capF<=12&&capG<=3&&capH<=2&&capI<=9&&capJ<=1&&capK<=1&&capL<42&&capM<=2&&capN<=6&&capO<=8&&capP<=2&&capQ<=1&&capR<=6&&capS<=4&&capT<=6&&capU<=4&&capV<=2&&capW<=2&&capX<=1&&capY<=2&&capZ<=1){
                
                if (letter.equals(a)||letter.equals(e)||letter.equals(i)||letter.equals(o)||letter.equals(u)||letter.equals(l)||letter.equals(n)||letter.equals(s)||letter.equals(t)||letter.equals(r))
                {
                    value+=1;
               
                }
                else if (letter.equals(d)||letter.equals(g))
                {
                    value+=2;
                }
                else if (letter.equals(b)||letter.equals(c)||letter.equals(m)||letter.equals(p))
                {
                    value +=3;
                  }
                else if (letter.equals(f)||letter.equals(h)||letter.equals(v)||letter.equals(w)||letter.equals(y))
                {
                      value +=4;
                }
                else if (letter.equals(k))
                {
                     value += 5;
                }   
                else if (letter.equals(j)||letter.equals(x))
                {
                    value += 8;
                }
                 else if (letter.equals(q)||letter.equals(z))
                {
                    value += 10;
                }
       
             
        }
            
       
        } 
        if (value>0){
            System.out.println("your score is"+value);
        }
        else{
            System.out.println("This word is invalid");
            }
    
    }
}
//A, E, I, O, U, L, N, S, T, R|| letter=="e" ||letter=="i"||letter=="o"||letter=="u"||letter=="l"||letter=="n"||letter=="s"||letter=="t"||letter=="r"