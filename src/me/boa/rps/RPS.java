package me.boa.rps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> choices = new ArrayList<>();

        choices.add("rock");
        choices.add("paper");
        choices.add("scissors");

        Object rock = choices.get(0);
        Object paper = choices.get(1);
        Object scissors = choices.get(2);

        int cpuChoiceInt = rand.nextInt(2);
        System.out.println("Rock, paper, or scissors?");
        String choice = scanner.nextLine().toLowerCase();
        Object choiceCPU = choices.get(cpuChoiceInt).toLowerCase();

        if (!choice.equals(choices.get(0)) && !choice.equals(choices.get(1)) && !choice.equals(choices.get(2))) {
            System.out.println("That's not a valid option! Please choose rock, paper, or scissors.");
        } else if (choice.equals(choiceCPU)) {
            System.out.println("We tied, you picked " + choice.toLowerCase() + " and I picked " + choiceCPU + ".");
        } else if (choice.toLowerCase().equals(rock) && choiceCPU.equals(paper)) {
            System.out.println("I win! You chose rock and I chose paper.");
        } else if (choice.toLowerCase().equals(scissors) && choiceCPU.equals(rock)) {
            System.out.println("I win! You chose scissors and I chose rock.");
        } else if (choice.toLowerCase().equals(paper) && choiceCPU.equals(scissors)) {
            System.out.println("I win! You chose paper and I chose scissors.");
        } else {
            System.out.println("You win! I chose " + choiceCPU + " and you chose " + choice + ".");
        }
    }
}
