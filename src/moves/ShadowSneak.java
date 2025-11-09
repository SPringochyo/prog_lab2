package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class ShadowSneak extends PhysicalMove {

    public ShadowSneak() {
        super(Type.GHOST, 40, 1.0, 1, 1);
    }

    @Override public String describe() {
        return "применяет Shadow Sneak (Наносит обычный урон без дополнительных эффектов)";
    }
}
