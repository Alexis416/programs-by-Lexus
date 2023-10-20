package Mypokemons;

import Mymoves.Heliolisk.FocusBlast;
import ru.ifmo.se.pokemon.Type;

public class Heliolisk extends Helioptile{
    public Heliolisk(String name, int level) {
        super(name, level);
        super.setType(Type.ELECTRIC, Type.NORMAL);
        super.setStats(62, 55, 52, 109, 94, 109);
        FocusBlast focusBlast = new FocusBlast(120, 70);
        super.addMove(focusBlast);
    }
}
