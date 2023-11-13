package pokemons;

import Lab_2.InvalidInputException;
import moves.statusMove.DoubleTeam;
import moves.statusMove.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grubbin extends Pokemon {
    public Grubbin(String name, int level) throws InvalidInputException {
        super(name, level);
        setType(Type.BUG);
        setStats(47, 62, 45, 55, 45, 46);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        ThunderWave thunderWave = new ThunderWave(0,90);
        setMove(doubleTeam,thunderWave);

        if (level<0 || level>100){
            throw new InvalidInputException("Уровень покемона должен быть от 1 до 100");
        }
    }
}
