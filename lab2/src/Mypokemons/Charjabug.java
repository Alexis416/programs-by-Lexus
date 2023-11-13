package pokemons;

import Lab_2.InvalidInputException;
import moves.damageMove.specialMove.Discharge;
import ru.ifmo.se.pokemon.Type;

public class Charjabug extends Grubbin{
    public Charjabug(String name, int level) throws InvalidInputException {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(57, 82, 95, 55, 75, 36);
        Discharge discharge = new Discharge(80,100);
        addMove(discharge);

        if (level<0 || level>100){
            throw new InvalidInputException("Уровень покемона должен быть от 1 до 100");
        }
    }
}
