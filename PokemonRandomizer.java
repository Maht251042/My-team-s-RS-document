
import java.util.*;

public class PokemonRandomizer {

    public static ArrayList<Pokemon> getPokemons(int num){ 
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if(num < 1){
            return pokemons;
        }
        int pokemonNum = (int)(Math.random() * num)+1;
        for(int i=0 ; i<pokemonNum ; i++){
            int type = (int)(Math.random() * 3);
            if(type == 0)
                pokemons.add(new Mimirol("Mimirol"));
            else if(type == 1)
                pokemons.add(new Mimilop("Mimilop"));
            else if(type == 2)
                pokemons.add(new Togepi("Togepi"));
        }
        return pokemons;
    }
}