public class FlipACoin{
    public static void main( String [] args){
        int num = (int)(Math.random()+.5);
        if (num == 1){
            System.out.println("Head");
        }
        else{
            System.out.println("Tail");
        }
    }
}