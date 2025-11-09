package master.pokemons;

import master.pokemons.Minccino;
import master.moves.*;
import ru.ifmo.se.pokemon.*;

public class Cinccino extends Minccino {

    public Cinccino(String name, int level) {
        super(name, level);
        setStats(75, 95, 60, 65, 60, 115);
        this.addMove(new Thunder());
    }
}
