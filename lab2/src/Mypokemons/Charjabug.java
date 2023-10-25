package Mypokemons;

import Mymoves.Charjabug.Discharge;
import ru.ifmo.se.pokemon.Type;

public class Charjabug extends Grubbin{
    public Charjabug(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(57, 82, 95, 55, 75, 36);
        Discharge discharge = new Discharge(80,100);
        addMove(discharge);
    }
}
