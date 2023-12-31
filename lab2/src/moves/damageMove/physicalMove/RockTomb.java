package moves.damageMove.physicalMove;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect speed = new Effect();
        speed.stat(Stat.SPEED, -1);
        p.addEffect(speed);
    }

    @Override
    protected String describe(){
        return "использует Rock Tomb";
    }
}
