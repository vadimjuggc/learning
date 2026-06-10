package oop_principles_05.oop_game;

public abstract class Hero implements Mortal{
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage)
    {
        setHealth(getHealth()-damage);
        if(!isAlive())
            System.out.println(getName() + " is dead");
        else
            System.out.println(getName() + " health: " + getHealth());
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attackEnemy(Enemy enemy);
}
