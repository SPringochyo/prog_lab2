package master.pokemons;

import master.moves.*;
import ru.ifmo.se.pokemon.*;

public class Custom extends Pokemon {

    public Custom(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(80, 80, 80, 80, 80, 80);
        this.addMove(new CustomMove());
    }
}
