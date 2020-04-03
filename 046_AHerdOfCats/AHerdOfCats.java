public class AHerdOfCats{
    public static void main(String[]args){
        Cats a = new Cats("dog",55);
        Cats b = new Cats("generic cat", 10);
        Cats c = new Cats("philosophical cat",42);
        Cats[] d = new Cats[3];
        d[0]= a;
        d[1]= b;
        d[2]= c;
        for(int i = 0; i <d.length; i++){
            System.out.println(d[i].getname());
            System.out.println("weight: "+d[i].getweight() );
            System.out.println("feeding the cat: 1 pound of fishe");
            double newweight = d[i].getweight()+1;
            System.out.println(" this unit's new weight is: "+ newweight);

        }
    }
}