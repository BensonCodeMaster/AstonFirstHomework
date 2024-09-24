 abstract public class Hero implements Mortal {

     String name;
     int health = 80;

     public Hero(String name) {
         this.name = name;

     }

     public int getHealth() {
         return health;
     }

     public void setHealth(int health) {
         this.health = health;
     }

     public String getName() {
         return name;
     }

     abstract public void attackEnemy(Enemy enemy);


     public abstract void specialSkill(Enemy enemy);

     public abstract void takeDamage(int damage);

     @Override
     public boolean isAlive() {
         if (health > 0) {
             System.out.println("Герой выжил");
             return true;
         } else {
             System.out.println("Герой погибает");
             return false;
         }
     }
 }

