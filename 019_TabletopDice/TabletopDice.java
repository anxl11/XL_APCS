public class TabletopDice{
    public static void main(String[]args){
        int d4 = (int)(Math.random()*4+1);
        int d6 = (int)(Math.random()*6+1);
        int d8 = (int)(Math.random()*8+1);
        int d10 = (int)(Math.random()*10+1);
        int percentile = (d10-1)*10+d10;
        int d12 = (int)(Math.random()*12+1);
        int d20 = (int)(Math.random()*20+1);
        System.out.println(d4);
        System.out.println(d6);
        System.out.println(d8);
        System.out.println(d10);
        System.out.println(percentile);
        System.out.println(d12);
        System.out.println(d20);

    }
}