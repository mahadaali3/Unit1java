import java.util.Scanner;

public class MarsExpedition  {
    public MarsExpedition() throws InterruptedException  {


            Scanner input = new Scanner(System.in);
            System.out.println("Booting");
            Thread.sleep(400);
            System.out.println("...");
            Thread.sleep(400);
            System.out.println("...");
            Thread.sleep(400);
            System.out.println("...");
            Thread.sleep(400);
            System.out.println("Ready!");
            System.out.print("What is your name: ");
            String name = input.next();
            System.out.println("Hi " + name + " --- Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
            String response = input.next().toUpperCase();
            if(response.equals("Y")){
                System.out.println("I knew you would say that. You are team leader for a reason.");
            }
            else System.out.println("Too bad you are team leader. You have to go.");

            System.out.print("How many people you want on your team?: ");
            int teamSize = input.nextInt();
            if(teamSize > 2) {
                System.out.println("That’s way to many people. We can only send 2 more members.");
            }
            else if(teamSize <= 1){
                System.out.println("That team is not big enough. We have to send 2 more members");
            }
            teamSize = 2;
            System.out.println("You are a 3 man team");

            System.out.print("You are allowed to bring one snack with you. What do you want to bring?: ");
            String snack = input.next();
            System.out.println("Nice choice, you will be bringing a " + snack + " with you.");


            System.out.println("A. Toyota Camry");
            System.out.println("B. Nissan Altima");
            System.out.println("C. Tesla Model 3");
            System.out.print("Pick a vehicle by its corresponding letter: ");
            String vehicle = input.next().toUpperCase();
            String vehicleName = "";
            if(vehicle.equals("A")){
                vehicleName = "Toyota Camry";
            }
            else if(vehicle.equals("B")){
                vehicleName = "Nissan Altima";
            }
            else if(vehicle.equals("C")){
                vehicleName = "Tesla";
            }
            System.out.println("You are now ready " + name + ", to embark on an expedition with " + teamSize + " team members, you'll have " + snack + " as a snack and you'll be driving a " + vehicleName + "." );
            System.out.println("GO EXPLORE!!!");
        }
    }


