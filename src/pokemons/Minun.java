package master.pokemons;

import master.moves.*;
import ru.ifmo.se.pokemon.*;

public class Minun extends Pokemon {

    public Minun(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(60, 40, 50, 75, 85, 95);
        this.addMove(new Swagger());
        this.addMove(new Growl());
        this.addMove(new Facade());
    }
}
