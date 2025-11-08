package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {

    public Sing() {
        super(Type.NORMAL, 100, 0.55);
    }

    @Override public void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }

    @Override public String describe() {
        return "применяет Sing (Погружает цель в сон)";
    }
}
