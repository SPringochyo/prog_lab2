package master.moves;

import master.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 1.0);
    }

    private Status status;

    @Override public void applySelfEffects(Pokemon p) {

        int atk = (int) p.getStat(Stat.ATTACK);
        Effect e = new Effect().stat(Stat.ATTACK, atk * 2);

        status = p.getCondition();

        if (status == Status.BURN || status == Status.PARALYZE || status == Status.POISON) {
            p.addEffect(e);
        }
    }

    @Override public String describe() {

        return "применяет Facade (Сила удваивается, если покемон обожжен, парализован или отравлен)";

        // if (status == Status.BURN) {
        //     return "применяет Facade (Сила удваивается, т.к. покемон обожжен)";
        // }
        // else if (status == Status.PARALYZE) {
        //     return "применяет Facade (Сила удваивается, т.к. покемон парализован)";
        // }
        // else if (status == Status.POISON) {
        //     return "применяет Facade (Сила удваивается, т.к. покемон отравлен)";
        // }
        // else {
        //     return "применяет Facade (Неуспешно)";
        // }
    }
}
