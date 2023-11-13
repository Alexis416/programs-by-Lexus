package pokemons;

import Lab_2.InvalidInputException;
import moves.damageMove.physicalMove.RockSlide;
import moves.damageMove.physicalMove.StoneEdge;
import moves.damageMove.specialMove.HeatWave;
import moves.damageMove.specialMove.Inferno;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Torkoal extends Pokemon {
    public Torkoal(String name, int level) throws InvalidInputException {
        super(name, level);
        setType(Type.FIRE);
        setStats(70, 85, 140, 85, 70, 20);
        RockSlide rockSlide = new RockSlide(75, 90);
        HeatWave heatWave = new HeatWave(95,90);
        Inferno inferno = new Inferno(100,50);
        StoneEdge stoneEdge = new StoneEdge(100,80);
        setMove(rockSlide,heatWave,inferno,stoneEdge);

        if (level<0 || level>100){
            throw new InvalidInputException("Уровень покемона должен быть от 1 до 100");
        }
    }
}
