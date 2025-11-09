package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {

    public ShadowClaw() {
        super(Type.GHOST, 70, 1.0);
    }

    @Override protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() <= (att.getStat(Stat.SPEED) / 256)){
            return 2;
        } else {
            return 1;
        }
    }

    @Override public String describe() {
        return "применяет Shadow Claw (Имеет повышенный шанс нанести критический удар)";
    }
}
