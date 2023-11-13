package pokemons;

import Lab_2.InvalidInputException;
import moves.statusMove.Rest;
import moves.damageMove.physicalMove.RockTomb;
import moves.damageMove.physicalMove.WildCharge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Helioptile extends Pokemon {
    public Helioptile(String name, int level) throws InvalidInputException {
        super(name, level);
        setType(Type.ELECTRIC, Type.NORMAL);
        setStats(44, 38, 33, 61, 43, 70);
        RockTomb rockTomb = new RockTomb(60,95);
        Rest rest = new Rest(0,0);
        WildCharge wildCharge = new WildCharge(90,100);
        setMove(rockTomb,rest,wildCharge);

        if (level<0 || level>100){
            throw new InvalidInputException("Уровень покемона должен быть от 1 до 100");
        }
    }
}
