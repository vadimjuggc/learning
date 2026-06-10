package oop_principles_05.oop_game;

public class Mage extends Hero{
    public Mage(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks enemy");
        enemy.takeDamage(10);
    }
}
