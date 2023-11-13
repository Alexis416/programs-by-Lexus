package moves.damageMove.physicalMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(0.3 > Math.random()){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Rock Slide";
    }
}
