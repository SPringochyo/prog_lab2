package master.pokemons;

import master.pokemons.Doublade;
import master.moves.*;
import ru.ifmo.se.pokemon.*;

public class AegislashBlade extends Doublade {

    public AegislashBlade(String name, int level) {
        super(name, level);
        setStats(60, 50, 150, 50, 150, 60);
        this.addMove(new ShadowSneak());
    }
}
