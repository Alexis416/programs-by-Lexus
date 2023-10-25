package Mypokemons;

import Mymoves.Helioptile.Rest;
import Mymoves.Helioptile.RockTomb;
import Mymoves.Helioptile.WildCharge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Helioptile extends Pokemon {
    public Helioptile(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC, Type.NORMAL);
        setStats(44, 38, 33, 61, 43, 70);
        RockTomb rockTomb = new RockTomb(60,95);
        Rest rest = new Rest(0,0);
        WildCharge wildCharge = new WildCharge(90,100);
        setMove(rockTomb,rest,wildCharge);
    }
}
