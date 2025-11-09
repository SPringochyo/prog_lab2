package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam() {
        super(Type.NORMAL, 100, 1.0);
    }

    @Override public void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(e);
    }

    @Override public String describe() {
        return "применяет Double Team (Повышает уклонение покемона на одну ступень)";
    }
}
