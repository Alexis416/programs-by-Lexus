package moves.damageMove.specialMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HeatWave extends SpecialMove {
    public HeatWave(double pow, double acc){
        super(Type.FIRE, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(0.1 > Math.random()){
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Heat Wave";
    }

}
