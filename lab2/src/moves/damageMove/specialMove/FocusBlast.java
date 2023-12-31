package moves.damageMove.specialMove;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(double pow, double acc){
        super(Type.FIGHTING, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect def = new Effect();
        def.stat(Stat.SPECIAL_DEFENSE,-1);
        if (0.1 > Math.random());
        p.addEffect(def);
    }

    @Override
    protected String describe(){
        return "использует Focus Blast";
    }
}
