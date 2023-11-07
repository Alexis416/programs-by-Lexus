package Mymoves.Grubbin;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect evasion = new Effect();
        evasion.stat(Stat.EVASION,+1);
        p.addEffect(evasion);
    }

    @Override
    protected String describe(){
        return "использует Double Team";
    }

}
