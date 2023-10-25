package Mypokemons;

import Mymoves.Vikavolt.Bite;
import ru.ifmo.se.pokemon.Type;

public class Vikavolt extends Charjabug{
    public Vikavolt(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(77, 70, 90, 145, 75, 43);
        Bite bite = new Bite(60,100);
        addMove(bite);
    }
}
