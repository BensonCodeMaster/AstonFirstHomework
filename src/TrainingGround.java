public class TrainingGround {

    public static void main(String[] args) {


        Hero legolas = new Archer("Леголас");
        Hero gendalf = new Mage("Гендальф");
        Hero gimli = new Warrior("Гимли");


        Enemy ork = new Enemy();


        legolas.attackEnemy(ork);
        gendalf.attackEnemy(ork);
        gimli.attackEnemy(ork);


        System.out.println(legolas.getName());




    }
}
