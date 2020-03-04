public class GasSign{
    public static void main(String []args){
        String unlead = "unleaded";
        String plus = "plus";
        String premium = "premium";
        double priceUnlead = 2.49;
        double plusprice =                              2.79;
        double premiumPrice = 2.99;
        GasPriceTracker unleaded = new GasPriceTracker(unlead,priceUnlead);
        GasPriceTracker pluss = new GasPriceTracker(plus, plusprice);
        GasPriceTracker premiumu = new GasPriceTracker(premium,premiumPrice);
        // print w called methods
        System.out.println("the price of "+unleaded.getName()+ " gas is "+ unleaded.getPrice());
        System.out.println("the price of "+pluss.getName()+ " gas is "+ pluss.getPrice());
        System.out.println("the price of "+premiumu.getName()+ " gas is "+ premiumu.getPrice());

    }
}