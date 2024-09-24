public class Goblin extends Enemy {

    int damage = 5;

    @Override
    public void skill(Hero hero) {
        hero.takeDamage(damage + 5);
        System.out.println("Гоблин  использовал ядовитый клинок");
    }
}
