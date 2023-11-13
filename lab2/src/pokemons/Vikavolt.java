package pokemons;

import Lab_2.InvalidInputException;
import moves.damageMove.physicalMove.Bite;
import ru.ifmo.se.pokemon.Type;

public class Vikavolt extends Charjabug{
    public Vikavolt(String name, int level) throws InvalidInputException {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(77, 70, 90, 145, 75, 43);
        Bite bite = new Bite(60,100);
        addMove(bite);

        if (level<0 || level>100){
            throw new InvalidInputException("Уровень покемона должен быть от 1 до 100");
        }
    }
}
