public class PopulationProjection{
    public static void main(String[] args){
        int current_pop = 312032486;
        int birth_rate = (365*24*60*60)/7;
        int death_rate = (365*24*60*60)/13;
        int immigration_rate = (365*24*60*60)/45;
        //What'swrong with the values? The variables are integers-type, which means they will only be assigned whole number-value. The exact value would be rounded, andtherefore is no longer 'exact'
        int population_change = birth_rate + immigration_rate - death_rate;
        int year_1 = current_pop + population_change;
        int year_2 = year_1 +population_change;
        int year_3 = year_2 +population_change;
        int year_4 = year_3 +population_change;
        int year_5 = year_4 +population_change;
        System.out.println("Year 1's population is: " + year_1);
        System.out.println("Year 2's population is: " + year_2);
        System.out.println("Year 3's population is: " + year_3);
        System.out.println("Year 4's population is: " + year_4);
        System.out.println("Year 5's population is: " + year_5);

    }
}
