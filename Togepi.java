
public class Togepi extends Pokemon {
    public Togepi(String name) {
        super(name, 300);
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(40);
    }
}