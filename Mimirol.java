
 public class Mimirol extends Pokemon {
    public Mimirol(String name){
        super(name, 400);
    }

    public Mimirol(String name, int maxHp){
        super(name, maxHp);
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(60);
    }
}