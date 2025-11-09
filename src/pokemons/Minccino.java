package master.pokemons;

import master.moves.*;
import ru.ifmo.se.pokemon.*;

public class Minccino extends Pokemon {

    public Minccino(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(55, 50, 40, 40, 40, 75);
        this.addMove(new CalmMind());
        this.addMove(new DoubleTeam());
        this.addMove(new Thunderbolt());
    }
}
