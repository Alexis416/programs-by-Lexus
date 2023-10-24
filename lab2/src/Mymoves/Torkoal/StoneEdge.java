package Mymoves.Torkoal;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (att.getStat(Stat.SPEED) / (512.0 / 3) > Math.random()){
            return 2.0;
        }
        else {
            return 1.0;
        }
    }

    @Override
    protected String describe(){
        return "использует Stone Edge";
    }
}
