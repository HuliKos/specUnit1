import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;

public class FindingsList {
    public static void main(String[] args) throws InterruptedException {
        new FindingsList();
    }
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back!");
        ArrayList<String> rockList = new ArrayList<String>();

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        Thread.sleep(2000);
        System.out.println("Rock list has been confirmed and downloaded.");
        System.out.println(rockList);

        Thread.sleep(2000);
        System.out.println("Hang on. The last one is not a rock and needed to be deleted.");

        rockList.remove("not rock");

        Thread.sleep(2000);
        System.out.println(rockList);
        Thread.sleep(2000);
        System.out.println("Perfect!");


        Thread.sleep(1000);
        HashMap<String, String> fossilDirectory = new HashMap<>();

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");
        Thread.sleep(2000);
        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about " +
                "? (Bird, fish, or tooth)");

        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Tooth Fossil"));
        }

        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<>();

        supplies.add("specialPig");
        supplies.add("specialBird");
        supplies.add("specialNoIdea");

        System.out.println("Supplies Before Expedition: \n" + supplies);

        supplies.remove("specialPig");
        System.out.println("Supplies After Expedition: \n" + supplies);

    }
}
