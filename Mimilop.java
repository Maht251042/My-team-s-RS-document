


public class Mimilop extends Mimirol {
    public Mimilop(String name){
        super(name,1000);
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(100);
    }
}