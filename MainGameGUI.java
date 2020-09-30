
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGameGUI extends JFrame {
    private Trainer trainer;

    public MainGameGUI(Trainer trainer){
        super("Pokemon Game ");

        this.trainer = trainer;

        Container c = getContentPane();
        JLabel trainerNameLabel = new JLabel(this.trainer.getName());
        JLabel pokemonName = new JLabel();

        JButton firstPokemon = new JButton(trainer.getBag().get(0).getName() + " Status");

        JButton chasePokemon = new JButton("Chase Pokemon");

        JButton feedPokemon = new JButton("Feed Pokemon");

        c.add(trainerNameLabel);
        c.add(pokemonName);
        c.add(firstPokemon);
        c.add(chasePokemon);
        c.add(feedPokemon);

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        String pName = "Pokemon: ";
        for(Pokemon p: trainer.getBag()){
            pName += p.getName() + ", ";
        }

        pokemonName.setText(pName);

        chasePokemon .addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                
            }
        });

        feedPokemon .addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                
            }
        });

        firstPokemon .addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                PokemonStatusGUI ps = new PokemonStatusGUI(trainer.getBag().get(0));
            }
        });

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);

    }
}