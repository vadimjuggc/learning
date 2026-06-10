package oop_principles_05.oop_game;

public class Zombie extends Enemy {

    public Zombie(int health, String name) {
        super(health, name);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getName() + " attacks " + hero.getName());
        hero.takeDamage(20);
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        if (!isAlive()) {
            System.out.println(getName() + " is dead");
            if (Math.random() < 0.5)
            {
                System.out.println(getName() + " resurrected");
                setHealth(50);
            }

        } else
            System.out.println(getName() + " health: " + getHealth());

    }
}
