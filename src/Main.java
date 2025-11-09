package master;

import master.moves.*;
import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Minun("Минун", 5));
        b.addAlly(new Minccino("Минчино", 5));
        b.addAlly(new Cinccino("Чинчино", 5));

        b.addFoe(new Honedge("Онедж", 5));
        b.addFoe(new Doublade("Даблейд", 5));
        b.addFoe(new AegislashBlade("Аегислэш", 5));

        b.go();
    }
}
