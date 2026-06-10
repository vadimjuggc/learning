package oop_principles_05.oop_game;

public abstract class Enemy implements Mortal{

    private int health;
    private String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return getHealth()>0;
    }

    public abstract void takeDamage(int damage);

    public String getName() {
        return name;
    }

    public abstract void attackHero(Hero hero);
}
