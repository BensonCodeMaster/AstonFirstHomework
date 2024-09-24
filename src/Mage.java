public class Mage extends Hero {

    int damage = 15;

    public Mage(String name) {
        super(name);
    }

    @Override
    public void specialSkill(Enemy enemy){
        enemy.takeDamage(damage * 3);
        System.out.println("Волшебник использовал огненный шар");
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Маг атакует врага");
    }

    @Override
    public void takeDamage(int damage) {
        health = health - damage;
    }

    @Override
    public boolean isAlive() {
        if (health > 0) {
            System.out.println("Гэндальф выжил");
            return true;
        } else {
            System.out.println("Гэндальф погиб");
            return false;
        }
    }
}
