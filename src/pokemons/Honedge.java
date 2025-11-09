package master.pokemons;

import master.moves.*;
import ru.ifmo.se.pokemon.*;

public class Honedge extends Pokemon {

    public Honedge(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.GHOST);
        setStats(45, 80, 100, 35, 37, 28);
        this.addMove(new AerialAce());
        this.addMove(new ShadowClaw());
    }
}
