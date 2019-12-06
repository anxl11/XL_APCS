
public class CarAge {

    public static void main(String[] args) {
    ReturningCalculator calc = new ReturningCalculator();
    Car car1 = new Car(2016,150,"CarvanPalace","Lone Digger");
    Car car2 =new Car(2019,133,"Caravan Palace", "Plume");
    Car car3 =new Car(2017,10,"Touhou","Jazz Medley");
    Car car4 =new Car(2019,260,"Tanchjim","Oxygen");
    Car car5 =new Car(2015,220,"Drop x Sennheiser","HD6XX");
    int currentYear = 2019;
    
    //create the calc because the method belongs to the ReturningCalculator class, not hte car;
    System.out.println(calc.integerSubtractor(currentYear, car1.year));
    System.out.println(calc.integerSubtractor(currentYear, car2.year));
    System.out.println(calc.integerSubtractor(currentYear, car3.year));
    System.out.println(calc.integerSubtractor(currentYear, car4.year));
    System.out.println(calc.integerSubtractor(currentYear, car5.year));

    //System.out.println(car1.integerSubtractor());
  
}
}