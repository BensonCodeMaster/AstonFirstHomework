public class Archer extends  Hero {

    int damage = 8;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void specialSkill(Enemy enemy) {
        enemy.takeDamage(damage * 2);
        System.out.println("Лучник использовал ядовитые стрелы");
    }
        @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Лучник атакует врага");
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
