package Mymoves.Helioptile;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove {
    public WildCharge(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applySelfDamage(Pokemon def, double damage){
        super.applySelfDamage(def, damage);
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        return 1d/4d;
    }

    @Override
    protected String describe(){
        return "использует Wild Charge";
    }
}
