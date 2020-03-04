public class FoodItems{
   //variables for initiating the constructor
    private int Camount;
    private int Iamount;
    private int Hamount;
    private String i;
    private String c;
    private String h;
    private String cf;
    private String ef;
    private String hf;
    private int Ccal;
    private int Ical;
    private int Hcal;
// VARS

    public FoodItems(int camount, String cname, String cflavor, int ccalories){
        Camount = camount;
        Hamount =camount;
        Iamount=camount;
        i = cname;
        c = cname;
        h = cname;
        cf = cflavor;
        ef = cflavor;
        hf = cflavor;
        Ccal = ccalories;
        Ical = ccalories;
        Hcal = ccalories;

    }
    
//getters and setters
    public int getCookies(){
        return Camount;
     //   System.out.println(Camount);
    }
    public int getIcecream(){
        return Iamount;
    }
    public int getHotdog(){
        return Hamount;
    }
    public void setCookies(int eat){
        for (int i=0;i<eat;i++){
            Camount--;
            System.out.println("there are "+ Camount+ " cookies left");
        }
    }
    public void setIceCream(int deat){
        for (int i=0;i<deat;i++){
            Iamount--;
            System.out.println("there are "+ Iamount+ " servings of icecream left");
        }
    }
    public void setHotdog(int reat){
        for (int i=0;i<reat;i++){
            Hamount--;
            System.out.println("there are "+ Hamount+ " hotdogs left");
        }
    }
    
}