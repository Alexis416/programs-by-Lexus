package moves.damageMove.specialMove;

import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {
    public Discharge(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect paralyze = new Effect();
        paralyze.condition(Status.PARALYZE);
        paralyze.chance(0.3);
        p.addEffect(paralyze);
    }

    @Override
    protected String describe(){
        return "использует Discharge";
    }
}
