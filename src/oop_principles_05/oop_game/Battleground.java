package oop_principles_05.oop_game;

public class Battleground {
    static void main(String[] args) {
        Warrior warrior = new Warrior("warrior", 70);
        Enemy enemy = new Zombie(50, "zombie");
        Archer archer = new Archer("archer", 40);
        Mage mage = new Mage("mage", 20);

        while (enemy.isAlive() && warrior.isAlive()) {
            warrior.attackEnemy(enemy);
            enemy.attackHero(warrior);
            archer.attackEnemy(enemy);
            enemy.attackHero(archer);
            mage.attackEnemy(enemy);
            enemy.attackHero(mage);
            mage.attackEnemy(enemy);
        }
    }
}
