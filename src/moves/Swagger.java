package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger() {
        super(Type.NORMAL, 100, 0.85);
    }

    @Override public void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, 2);

        p.addEffect(e);
        p.confuse();
    }

    @Override public String describe() {
        return "применяет Swagger (Повышает атаку цели на две ступени и вводит ее в заблуждение)";
    }
}
