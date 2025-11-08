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

        this.status = p.getCondition();

        if (this.status == Status.BURN || this.status == Status.PARALYZE || this.status == Status.POISON) {
            p.addEffect(e);
        }
    }

    @Override public String describe() {
        if (this.status == Status.BURN) {
            return "применяет Facade (Сила удваивается, т.к. покемон обожжен)";
        }
        else if (this.status == Status.PARALYZE) {
            return "применяет Facade (Сила удваивается, т.к. покемон парализован)";
        }
        else if (this.status == Status.POISON) {
            return "применяет Facade (Сила удваивается, т.к. покемон отравлен)";
        }
        else {
            return "применяет Facade (Неуспешно)";
        }
    }
}
