import enums.Action;
import objects.entity.*;
import objects.thing.*;

public class Main {
    public static void main(String[] args) {
        Entity doctor = new DoctorPilulkin("Доктор Пилюлькин");
        Entity neznaika = new Neznaika("Незнайка");
        Entity znaika = new Znaika("Знайка");
        Entity crowd = new Crowd("Фуксия, Селёдочка и профессор Звездочкин");

        Thing rocket = new Rocket("ракета");
        Thing spaceSuit = new SpaceSuit("скафандр");
        Thing cave = new Cave("пещера");
        Thing move = new Move("действие");
        Thing ray = new Ray("луч");
        Thing way = new Way("путь");
        Thing escort = new Escort("сопровождение");


        doctor.doSomething(Action.said_what);
        neznaika.doSomething(Action.feels);
        System.out.print("себя");
        neznaika.feels(" "+"очень плохо,"+" ");
        System.out.print("поэтому его"+" ");
        neznaika.doSomething(Action.needs_to_be_sent_immediately);
        System.out.print(" "+"в"+" ");
        rocket.getName();
        System.out.print(","+" "+"где он"+" ");
        neznaika.doSomething(Action.can_get_free);
        System.out.print("от"+" ");
        spaceSuit.properties("тяжёлого"+" ");
        spaceSuit.getName();
        System.out.print("."+" "+"Но"+" ");
        znaika.doSomething(Action.said);
        znaika.doSomething(Action.by_giving_an_order);
        System.out.print(" "+"никому"+" ");
        znaika.doSomething(Action.do_not_go_out);
        cave.getName();
        System.out.print(","+" ");
        crowd.doSomething(Action.so_as_not_to_be_exposed);
        System.out.print(" "+"лишний раз"+" ");
        move.getName();
        ray.properties("космических"+" ");
        ray.getName();
        System.out.print(","+" ");
        znaika.doSomething(Action.went);
        System.out.print(" "+"в"+" ");
        way.properties("обратный"+" ");
        way.getName();
        System.out.print(" "+"в"+" ");
        escort.getName();
        System.out.print(" ");
        crowd.getName();
        System.out.print(".");
    }
}