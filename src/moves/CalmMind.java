package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {

    public CalmMind() {
        super(Type.PSYCHIC, 100, 1.0);
    }

    @Override public void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1);
        p.addEffect(e);
    }

    @Override public String describe() {
        return "применяет Calm Mind (Повышает Специальную атаку и Специальную защиту покемона на одну ступень)";
    }
}
