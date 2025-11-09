package master;

import master.moves.*;
import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Minun("Минун 1", 5));
        b.addAlly(new Minun("Минун 2", 5));
        b.addFoe(new Cinccino("Чинчино 1", 5));
        b.addFoe(new Cinccino("Чинчино 2", 5));

        b.go();
    }
}
