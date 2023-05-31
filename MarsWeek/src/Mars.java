public class Mars {
    public static void main(String[] args) throws InterruptedException{
        String colonyName = "Somalia";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (0.75 * shipPopulation);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Plain";
        if (landingLocation == "The Plain"){
            System.out.println("Bbzzz Landing on the Plain");
        }
        else System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");

        landingCheck(12);

    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException{
        for(int minute = 0; minute<=minutesLeft; minute++){
            if((minute%2==0) && (minute%3==0)){
                System.out.println("Keep center");
            }
            else if(minute%2==0){
                System.out.println("Right");
            }
            else if(minute%3==0){
                System.out.println("Left");
            }
            else{
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        return false;
    }
}
