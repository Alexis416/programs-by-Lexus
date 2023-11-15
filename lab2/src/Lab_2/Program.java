package Lab_2;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {
    public static void main(String[] args) throws InvalidInputException {
        Battle battle = new Battle();
        Torkoal p1 = new Torkoal("Паша", 1);
        Helioptile p2  = new Helioptile("Саша", 1);
        Heliolisk p3 = new Heliolisk("Лёша",1);
        Grubbin p4 = new Grubbin("Вася",1);
        Charjabug p5 = new Charjabug("Петя",1);
        Vikavolt p6 = new Vikavolt("Виталик",1);
        battle.addAlly(p1);
        battle.addFoe(p2);
        battle.addAlly(p3);
        battle.addFoe(p4);
        battle.addAlly(p5);
        battle.addFoe(p6);
        battle.go();
    }
}
