package net.larson.main;

public class Player extends Character {

    // Integers to store number of upgrades/skills in each path
    public int numAtkUpgrades, numDefUpgrades;

    //Arrays to store skill names
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};



    // Player specific constructor
    public Player(String name) {
        // Calling constructor of superclass
        super(name, 100, 0);
        //Setting # of upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //lets player choose trait when making new character
        chooseTrait();
    }

    // Player specific methods
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    //let the player choose a trait of either skill path
    public void chooseTrait(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose a trait:");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        //get player choice:
        int input = GameLogic.readInt("-> ", 2);
        GameLogic.clearConsole();

        if(input == 1){
            GameLogic.printHeading("You chose " + atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        }else{
            GameLogic.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
            numAtkUpgrades++;
        }
        GameLogic.anythingToContinue();
    }

}
