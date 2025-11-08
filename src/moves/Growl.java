package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {

    public Growl() {
        super(Type.NORMAL, 100, 1.0);
    }

    @Override public void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, -1);

        p.addEffect(e);
    }

    @Override public String describe() {
        return "применяет Growl (Снижает атаку цели на одну ступень)";
    }
}
