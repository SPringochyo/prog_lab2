package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {

    public Thunder() {
        super(Type.ELECTRIC, 110, 0.7);
    }

    private boolean flag = false;

    @Override public void applyOppEffects(Pokemon p) {
        this.flag = false;
        if (Math.random() <= 0.3){
            Effect.paralyze(p);
            this.flag = true;
        }
    }

    @Override public String describe() {
        if (this.flag) {
            return "применяет Thunder (Парализует цель)";
        } else {
            return "применяет Thunder (Не парализует цель)";
        }

    }
}
