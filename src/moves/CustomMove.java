package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class CustomMove extends StatusMove {

    public CustomMove() {
        super(Type.NORMAL, 100, 1.0);
    }

    private Status status;

    @Override public void applyOppEffects(Pokemon p) {
        Effect.burn(p);
        this.status = p.getCondition();
    }

    @Override public String describe() {
        String prim = "применяет ПОДЖООООООООООГ", rez;
        if (this.status == Status.BURN) {
            rez = prim + " (успешно)";
        } else {
            rez = prim + " (НЕуспешно)";
        }
        return rez;
    }
}
