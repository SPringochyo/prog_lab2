package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {

    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 1.0);
    }

    private boolean flag = false;

    @Override public void applyOppEffects(Pokemon p) {
        if (flag){
            Effect.paralyze(p);
        }
    }

    @Override public String describe() {
        flag = false;
        if (Math.random() <= 0.1){
            flag = true;
            return "применяет Thunderbolt (Парализует цель)";
        } else {
            return "применяет Thunderbolt (Не парализует цель)";
        }

    }
}
