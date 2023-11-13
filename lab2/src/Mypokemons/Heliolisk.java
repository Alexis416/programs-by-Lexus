package pokemons;

import Lab_2.InvalidInputException;
import moves.damageMove.specialMove.FocusBlast;
import ru.ifmo.se.pokemon.Type;

public class Heliolisk extends Helioptile{
    public Heliolisk(String name, int level) throws InvalidInputException {
        super(name, level);
        setType(Type.ELECTRIC, Type.NORMAL);
        setStats(62, 55, 52, 109, 94, 109);
        FocusBlast focusBlast = new FocusBlast(120, 70);
        addMove(focusBlast);

        if (level<0 || level>100){
            throw new InvalidInputException("Уровень покемона должен быть от 1 до 100");
        }
    }
}
