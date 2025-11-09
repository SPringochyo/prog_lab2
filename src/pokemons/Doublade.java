package master.pokemons;

import master.pokemons.Honedge;
import master.moves.*;
import ru.ifmo.se.pokemon.*;

public class Doublade extends Honedge {

    public Doublade(String name, int level) {
        super(name, level);
        setStats(59, 110, 150, 45, 49, 35);
        this.addMove(new Tackle());
    }
}
