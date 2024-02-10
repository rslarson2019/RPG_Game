package net.larson.main;

import static net.larson.main.GameLogic.player;

//class that does nothing but storing methods to print
public class Story {

    public static void printIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeperator(20);
        System.out.println("Story");
        GameLogic.printSeperator(20);
        System.out.println("You are the last survivor of the shadows attack");
        System.out.println("Everyone you know is gone");
        System.out.println("Now is time to escape");
        GameLogic.anythingToContinue();
    }

    public static void printActOneIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeperator(20);
        System.out.println("Act 1 Intro");
        GameLogic.printSeperator(20);
        System.out.println("You spent the day running in a mountain range");
        System.out.println("Enemies are closing in and you are very lost");
        GameLogic.anythingToContinue();

    }

    public static void printActOneOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeperator(20);
        System.out.println("Act 1 Outro");
        GameLogic.printSeperator(20);
        System.out.println("You survived and made it out of the mountains");
        System.out.println("After the trauma you find greater stregnth and you gain a new trait");
        GameLogic.anythingToContinue();

    }

    public static void printActTwoIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeperator(20);
        System.out.println("Act 2 Intro");
        GameLogic.printSeperator(20);
        System.out.println("You find yourself in a wide clearing that goes into a large field");
        System.out.println("You can sense your problems are not done. You are still lost and have no clear goal in sight");
        GameLogic.anythingToContinue();

    }
    public static void printActTwoOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeperator(20);
        System.out.println("Act 2 Outro");
        GameLogic.printSeperator(20);
        System.out.println("You survived and made it out of the field");
        System.out.println("After the trauma you find greater strength and you gain a new trait");
        GameLogic.anythingToContinue();

    }

    public static void printActThree() {
        GameLogic.clearConsole();
        GameLogic.printSeperator(20);
        System.out.println("Act 3 Finale");
        GameLogic.printSeperator(20);
        System.out.println("You see a large camp in the distance. It looks like salvation from the shadows ");
        System.out.println("After the final fight you make it to the camp");
        System.out.println("Congrats! You defeated the Shadows");
        GameLogic.anythingToContinue();

    }
}
