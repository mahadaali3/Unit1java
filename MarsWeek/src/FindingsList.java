import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        ArrayList rockArray = new ArrayList<>();
        rockArray.add("rock");
        rockArray.add("weird rock");
        rockArray.add("smooth rock");
        rockArray.add("no rock");

        System.out.println(rockArray);
        System.out.println("Theres a non-rock in your list, remove it!");
        rockArray.remove(3);
        System.out.println(rockArray);
        System.out.println("Perfect");

        HashMap<String, String> fossils = new HashMap<String, String>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        Scanner input = new Scanner(System.in);
        String fossilInput = input.next();
        if(fossilInput.equalsIgnoreCase("Bird")){
            System.out.println(fossils.get("Bird Fossil"));
        }
        else if(fossilInput.equalsIgnoreCase("Fish")){
            System.out.println(fossils.get("Fish Fossil"));
        }
        else if(fossilInput.equalsIgnoreCase("Tooth")){
            System.out.println(fossils.get("Tooth Fossil"));
        }
        Thread.sleep(700);

        HashSet<String> specialSupplies = new HashSet<String>();
        specialSupplies.add("water");
        specialSupplies.add("oxygen tank");
        specialSupplies.add("food");
        System.out.println("Supplies Before Expedition: ");

        for (String i : specialSupplies) {
            System.out.println(i);
        }
        specialSupplies.remove("food");
        System.out.println("");
        System.out.println("Supplies After Expedition: ");
        for (String i : specialSupplies) {
            System.out.println(i);
        }


    }


}