import java.util.*;

public class PokemonGame {
    public static void main(String[] args){
        System.out.println("---Wellcome to Pokemon Game---");
        Trainer t = new Trainer("Alee");
        //MainGameGUI mg = new MainGameGUI(t);
        t.play();
        System.out.println("\n\n---See you---");
    }
}