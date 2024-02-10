package net.larson.main;

public abstract class Character {

    // Variable / Attributes all characters need
    public String name;
    public int maxHp, hp, exp;

    // Constructor for character
    public Character(String name, int maxHp, int exp){
        this.name = name;
        this.maxHp = maxHp;
        this.exp = exp;
        this.hp = maxHp;
    }

    // Methods every Character has
    public abstract int attack();
    public abstract int defend();


}
