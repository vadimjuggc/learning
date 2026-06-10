package oop_principles_05.oop_game;

public class Archer extends Hero{

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacks enemy");
        enemy.takeDamage(15);
    }
}
