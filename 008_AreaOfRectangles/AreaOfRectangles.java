public class AreaOfRectangles{
    public static void main(String[]args){
        double w1=5.5;
        double w2=99.4;
        double w3=75;
        double w4=500029.75;
        double w5=600000;
        double l1=7.8;
        double l2=500.352;
        double l3=800;
        double l4=90029384;
        double l5= 834341034; 
        double Rec1AreaInInches = w1*l1;
        double Rec2AreaInCentimeters = w2*l2;
        double Rec3AreaInCentimeters = w3*2.54*l3;
        double Rec4AreaInInches = w4*l4/2.54;
        double Rec5AreaInYards= w5/91.44*l5/91440;
        System.out.println(Rec1AreaInInches);
        System.out.println(Rec2AreaInCentimeters);
        System.out.println(Rec3AreaInCentimeters);
        System.out.println(Rec4AreaInInches);
        System.out.println(Rec5AreaInYards);
        

        
    }
}