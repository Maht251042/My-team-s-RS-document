
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatusGUI extends JFrame{
    
    Pokemon pokemon;
    public PokemonStatusGUI(Pokemon pokemon){
        super("Pokemon Status: " + pokemon.getName());
        this.pokemon = pokemon;
        
        Container c = getContentPane();
        JLabel name = new JLabel(pokemon.getName());
        JLabel hp = new  JLabel("HP: " + pokemon.getHp());

        c.add(name);
        c.add(hp);

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
}