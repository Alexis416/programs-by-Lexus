package Lab_2;

import Mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {
    public static void main(String[] args) {
        Battle b = new Battle();
        Torkoal p1 = new Torkoal("Паша", 1);
        Helioptile p2  = new Helioptile("Саша", 1);
        Heliolisk p3 = new Heliolisk("Лёша",1);
        Grubbin p4 = new Grubbin("Вася",1);
        Charjabug p5 = new Charjabug("Петя",1);
        Vikavolt p6 = new Vikavolt("Виталик",1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
    public static boolean chance(double d){
        return d > Math.random();
    }
}
