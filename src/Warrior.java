
public class Warrior extends Hero {

    int damage = 10;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);

        System.out.println("Воин атакует врага");
    }

    @Override
    public void specialSkill(Enemy enemy){
        enemy.takeDamage(damage + 10 );
        System.out.println("Воин нанес критический удар");

    }

    @Override
    public void takeDamage(int damage) {
        health = health - damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}

