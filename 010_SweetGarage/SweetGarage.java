public class SweetGarage {

    public static void main(String[] args) {

    Car car1 = new Car(2016,150,"CarvanPalace","Lone Digger");
    Car car2 =new Car(2019,133,"Caravan Palace", "Plume");
    Car car3 =new Car(2017,10,"Touhou","Jazz Medley");
    Car car4 =new Car(2019,260,"Tanchjim","Oxygen");
    Car car5 =new Car(2015,220,"Drop x Sennheiser","HD6XX");
    //build the carusing theconstructorwith the desired signature 
    System.out.println(car1.modelName+" made in "+ car1.year +" ,miles dirven: "+ car1.milesDriven+ " ,made by "+ car1.manufacturerName+ " ,Turbo?- "+ car1.hasTurbo);
    System.out.println(car2.modelName+" made in "+ car2.year +" ,miles dirven: "+ car2.milesDriven+ " ,made by "+ car2.manufacturerName+ " ,Turbo?- "+ car2.hasTurbo);
    System.out.println(car3.modelName+" made in "+ car3.year +" ,miles dirven: "+ car3.milesDriven+ " ,made by "+ car3.manufacturerName+ " ,Turbo?- "+ car3.hasTurbo);
    System.out.println(car4.modelName+" made in "+ car4.year +" ,miles dirven: "+ car4.milesDriven+ " ,made by "+ car4.manufacturerName+ " ,Turbo?- "+ car4.hasTurbo);
    System.out.println(car5.modelName+" made in "+ car5.year +" ,miles dirven: "+ car5.milesDriven+ " ,made by "+ car5.manufacturerName+ " ,Turbo?- "+ car5.hasTurbo);
    
    car3.revEngine();
    car3.engageTurbo();
    
    }  
}