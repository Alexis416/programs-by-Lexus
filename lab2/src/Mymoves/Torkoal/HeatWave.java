package Mymoves.Torkoal;

import Lab_2.Program;
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
        if(Program.chance(0.1)){
            Effect.burn(p);
        }
    }

    @Override
    protected String describe(){
        return "использует Heat Wave";
    }

}
