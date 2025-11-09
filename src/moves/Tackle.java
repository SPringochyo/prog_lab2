package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {

    public Tackle() {
        super(Type.NORMAL, 40, 1.0);
    }

    @Override public String describe() {
        return "применяет Tackle (Наносит обычный урон без дополнительных эффектов)";
    }
}
