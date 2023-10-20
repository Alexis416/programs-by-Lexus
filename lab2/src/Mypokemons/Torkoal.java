package Mypokemons;

import Mymoves.Torkoal.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Torkoal extends Pokemon {
    public Torkoal(String name, int level){
        super(name, level);
        super.setType(Type.FIRE);
        super.setStats(70, 85, 140, 85, 70, 20);
        RockSlide rockSlide = new RockSlide(75, 90);
        HeatWave heatWave = new HeatWave(95,90);
        Inferno inferno = new Inferno(100,50);
        StoneEdge stoneEdge = new StoneEdge(100,80);
        super.setMove(rockSlide,heatWave,inferno,stoneEdge);
    }
}
