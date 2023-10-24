package Mymoves.Grubbin;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove {
    public ThunderWave(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }

    @Override
    protected String describe(){
        return "использует Thunder Wave";
    }
}
