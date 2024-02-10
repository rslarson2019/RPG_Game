package net.larson.main;
import java.util.Scanner;


public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;

    //random encounters
    public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};

    public static String[] enemies = {"Large Shadow", "Small Shadow", "Panther Shadow"}
    //Story elements
    public static int place = 0, act = 1;
    public static String[] places = {"Mountains", "Plains"};

    //method to get user input from console
    public static int readInt(String prompt, int userChoices){
        int input;

        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter an integer!");
            }
        }while(input < 1 || input > userChoices);
        return input;
    }

    //method to simulate clear console
    public static void clearConsole(){
        for(int i = 0; i <100; i++)
            System.out.println();
    }

    //method to print a seperator with length n
    public static void printSeperator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //method to print a heading
    public static void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    //method to stop game until user enter anything
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }

    //method to start game
    public  static void startGame(){
        boolean nameSet = false;
        String name;
        //print title screen
        clearConsole();
        printSeperator(40);
        printSeperator(30);
        System.out.println("AGE OF THE EVIL SHADOWS");
        printSeperator(20);
        printSeperator(50);
        anythingToContinue();

        //getting the player name
        do{
            clearConsole();
            printHeading("What is your name?");
            name = scanner.next();
            //ask if they want to change choice
            clearConsole();
            printHeading("Your name is " + name + ".\nIs that correct?");
            System.out.println("(1) yes!");
            System.out.println("(2) No, I want to change my name");
            int input = readInt("->" ,2);
            if(input == 1)
                nameSet = true;
        }while(!nameSet);

        // print story intro
        Story.printIntro();

        //create new player object
        player = new Player(name);

        //print first story act intro
        Story.printActOneIntro();

        // setting isRunning to true, so the game loop can continue
        isRunning = true;

        //start main game loop
        gameLoop();

    }

    //method that changes the games values on player exp
    public static void checkAct(){
        //changes acts based on exp
        if(player.exp >= 10 && act == 1){
            //increment act and place
            act = 2;
            place = 1;
            //story
            Story.printActOneOutro();
            // lets the player "level up
            player.chooseTrait();
            //story
            Story.printActTwoIntro();
            //assign mew values to enemies
            enemies[0] = "Large Shadow";
            enemies[1] = "Small Shadow";
            enemies[2] = "Panther Shadow";
            //assign new values to encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Battle";
            encounters[4] = "Rest";
            encounters[5] = "Shop";
            //fully heal player
            player.hp = player.maxHp;
        }else if(player.exp >= 50 && act == 2){
            //increment act and place
            act = 3;
            place = 2;
            //story
            Story.printActThree();//assign mew values to enemies
            enemies[0] = "Large Shadow";
            enemies[1] = "Small Shadow";
            enemies[2] = "Panther Shadow";
            //assign new values to encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Battle";
            encounters[4] = "Rest";
            encounters[5] = "Shop";
            //fully heal player
            player.hp = player.maxHp;
            //calling the final battle
            //finalBattle();
        }
    }

    //method to determine random encounter
    public static void randomEncounter(){
        int encounter = (int) (Math.random()* encounters.length);
        //call the methods
        if(encounters[encounter].equals("Battle")) {
            //randomBattle();
        }else if(encounters)[encounter].equals("Rest"){
            //takeRest();
        }else{
            //shop();
        }
    }
    //method to continue journey
    public static void  continueJourney(){
        //check if act must be increased
        checkAct();
        //check if game isnt in last act
        if(act != 4)
            randomEncounter();
    }

    //print out important info
    public static void chacterInfo(){
        clearConsole();
        printHeading("Character Info");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        printSeperator(20);
        System.out.println("XP: " + player.exp);
        printSeperator(20);

        //print chosen traits
        if(player.numAtkUpgrades > 0){
            System.out.println("Offensive Trait:" + player.atkUpgrades[player.numAtkUpgrades - 1]);
        }
        if(player.numDefUpgrades > 0){
            System.out.println("Defensive Trait: " + player.defUpgrades[player.numDefUpgrades -1]);
        }

        anythingToContinue();

    }

    public static void printMenu(){
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choose an action:");
        printSeperator(20);
        System.out.println("(1) Continue on your Journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");
    }

    //main game loop
    public static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readInt("-> ", 3);
            if(input == 1)
                continueJourney();
            else if(input == 2)
                chacterInfo();
            else
                isRunning = false;
        }
    }


}
