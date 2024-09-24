public class Enemy implements Mortal  {

 private int health = 30;



    public Enemy(){
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
       health = health- damage;
    }

    public void skill(Hero hero) {
        hero.takeDamage(15);
    }



    public void attackEnemy(){

        System.out.println("Герой атакует врага.");
    }

    public  void returnAttackHero(Hero hero){
        hero.takeDamage(5);
        System.out.println("Враг атакует в ответ");


    }


  @Override
  public boolean isAlive() {
      if (health > 0) {
          System.out.println("Враг выжил");
          return true;
      }
      else {
          System.out.println("Враг уничтожен");
          return false;}
  }
}
