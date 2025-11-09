package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {

    public AerialAce() {
        super(Type.FLYING, 60, 1.0);
    }

    @Override protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override public String describe() {
        return "применяет Aerial Ace (Атака без промаха)";
    }
}
