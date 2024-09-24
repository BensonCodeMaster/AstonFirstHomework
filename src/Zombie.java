import java.util.Random;

public class Zombie extends Enemy{

    int damage = 10;




    @Override
    public boolean isAlive() {
        if (super.getHealth() > 0) {
            System.out.println("Зомби выжил");
            return true;
        } else {
            System.out.println("зомби пал,но может воскреснуть");
            Random random = new Random();
            int randomNumber = random.nextInt(5);
            if (randomNumber > 3) {
                super.setHealth(10);
                System.out.println("Зомби воскресает");
                return true;
            } else {
                System.out.println("Зомби уничтожен");
                return false;
            }
        }
    }
}
