package Mypokemons;

import Mymoves.Grubbin.DoubleTeam;
import Mymoves.Grubbin.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grubbin extends Pokemon {
    public Grubbin(String name, int level) {
        super(name, level);
        super.setType(Type.BUG);
        super.setStats(47, 62, 45, 55, 45, 46);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        ThunderWave thunderWave = new ThunderWave(0,90);
        setMove(doubleTeam,thunderWave);
    }
}
