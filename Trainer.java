import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> bag;
    private Scanner sc;
    private String name;

    public Trainer(String name){
        bag = new ArrayList<Pokemon>();
        bag.add(new Mimirol("Your Mimirol"));
        sc = new Scanner(System.in);

        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void play(){
        String cmd = "";

        do{
            System.out.print("\n\nEnter command: ");
            cmd = sc.nextLine();

            if(cmd.equals("show")){
                System.out.println("\n\nPokemon in bag: ");
                showPokemon(bag);
            }
            else if(cmd.equals("chase")){
                chasePokemon();
            }
        }while(!cmd.equals("quit"));
    }

    public void chasePokemon(){
        System.out.println("Chase Pokemons!");
        ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemons(5);

        System.out.println("\n\n---OMG! Found Pokemon!!---");
        int no = 0;
        showPokemon(pokemons);
        
        System.out.print("\n\nSelect Pokemon number or Run(-1): ");
        no = sc.nextInt();
        if(no < 0){
           sc.nextLine();
           return;
        }

        Pokemon wildPokemon = pokemons.get(no);
        
        System.out.println("\n\n---Pokemon in bag---");
        showPokemon(bag);
        System.out.print("\n\nSelect Pokemon in bag: ");
        
        no = sc.nextInt();
        sc.nextLine();
        Pokemon myPokemon = bag.get(no);

        boolean isWin = false;
        do {
            myPokemon.attack(wildPokemon);
            if(wildPokemon.getHp() == 0){
                isWin = true;
                break;
            }
            else{
                wildPokemon.attack(myPokemon);
                if(myPokemon.getHp() == 0){
                    isWin = false;
                    break;
                }
            }
        }while(true);

        if(isWin){        
            System.out.println("You  win and cath it");
            bag.add(wildPokemon);
        }
        else{
            System.out.println(wildPokemon.getName() + " win and it's gone!");
        }
    }

    public void showPokemon(ArrayList<Pokemon> pokemons){
        int number = 0;
        for(Pokemon p: pokemons) {
            System.out.println("" + number + " " + p + " HP: " + p.getHp());
            number++;
        }
    }

    public ArrayList<Pokemon> getBag(){
        return bag;
    }
}