package Mymoves.Helioptile;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect sleep = new Effect();
        sleep = sleep.condition(Status.SLEEP);
        sleep = sleep.turns(2);
        p.restore();
        p.addEffect(sleep);

    }
    @Override
    protected String describe(){
        return "использует Rest";
    }
}
