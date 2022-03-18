package com.isep.rpg;
import java.util.List;

abstract public class hero {
    private int lifepoints;
    private int armor;
    private int weaponDamage;
    private List<Potion> potion;
    private List<Food> lembas;


    abstract public int attack();
    abstract public int defend();
    void useConsumable(Consumable){}
    
}