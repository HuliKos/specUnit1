import java.util.Objects;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class MarsExpedition {

    public static void main(String[] args) throws InterruptedException {
        new MarsExpedition();
    }

    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Expedition preparation program is triggered...");
        System.out.println("Booting up...");
        sleep(2000);
        System.out.println("...");
        sleep(2000);
        System.out.println("Ready");

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hi, " + name + " — Welcome to the Expedition prep program. " +
                "Are you ready to head out into the new world? Type Y or N");
        String readiness = input.next();
        if(Objects.equals(readiness, "Y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (Objects.equals(readiness, "N")){
            System.out.println("Too bad you are team leader. You have to go");
        }

        System.out.println("How many people you want on your team?");
        int teamSize = input.nextInt(); input.nextLine();

        if (teamSize > 2){
            System.out.println("That’s way to many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2){
            System.out.println("That's not enough people. We need you and two other members.");
        } else {
            System.out.println("That's a perfect size. Nice choice");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snackOption = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snackOption + " with you");

        System.out.println("You have 3 kinds of vehicles to choose from:"
                + "\nA: Marslambo"
                + "\nB: Marsla"
                + "\nC: Marsda"
                + "\nPlease type A, B, or C below.");
        String vehicleChoice = input.next();

        if(vehicleChoice.equalsIgnoreCase("A")){
            vehicleChoice = "Marslambo";
        } else if (vehicleChoice.equalsIgnoreCase("B")){
            vehicleChoice = "Marsla";
        } else if (vehicleChoice.equalsIgnoreCase("C")){
            vehicleChoice = "Marsda";
        } else {
            vehicleChoice = "hmmmm RIP";
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");

    }
}


