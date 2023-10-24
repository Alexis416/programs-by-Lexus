package Mymoves.Torkoal;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Inferno extends SpecialMove {
    public Inferno(double pow, double acc){
        super(Type.FIRE, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.burn(p);

    }

    @Override
    protected String describe(){
        return "использует Inferno";
    }
}
