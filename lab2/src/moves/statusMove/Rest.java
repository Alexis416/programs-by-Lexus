package moves.statusMove;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect sleep = new Effect();
        sleep.condition(Status.SLEEP);
        sleep.turns(2);
        p.restore();
        p.addEffect(sleep);

    }
    @Override
    protected String describe(){
        return "использует Rest";
    }
}
