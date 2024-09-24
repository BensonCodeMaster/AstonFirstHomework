public class BattleGround {
    public static void main(String[] args) {

        Enemy zombie = new Zombie();
        Hero gandalf = new Mage("Гэндальф");
        Enemy goblin = new Goblin();

        gandalf.attackEnemy(zombie);
        zombie.isAlive();
        zombie.returnAttackHero(gandalf);
        gandalf.isAlive();
        gandalf.specialSkill(zombie);
        zombie.isAlive();

        goblin.skill(gandalf);
        gandalf.isAlive();
        gandalf.attackEnemy(goblin);
        goblin.isAlive();
        goblin.returnAttackHero(gandalf);
        gandalf.isAlive();
        gandalf.specialSkill(goblin);
        goblin.isAlive();






    }
}
