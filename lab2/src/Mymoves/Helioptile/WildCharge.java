package Mymoves.Helioptile;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove {
    public WildCharge(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Wild Charge";
    }

}
