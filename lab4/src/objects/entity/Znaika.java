package objects.entity;

import enums.Action;
import objects.thing.Thing;

public class Znaika extends Entity {
    private final String name;

    public Znaika(String name) {
        super(name);
        this.name = name;
    }
    public class Back extends Thing {
        public Back(String name) {
            super(name);
        }

        @Override
        public void getName() {
            System.out.print("спиной");
        }
    }

    public void doSomething(Action action) throws InvalidInputException {
        if (action == Action.said) {
            System.out.print(name + " " + "сказал:");
        } else if (action == Action.by_giving_an_order) {
            System.out.print(" " + "Отдав распоряжение");
        } else if (action == Action.do_not_go_out) {
            System.out.print("не выходить из" + " ");
        } else if (action == Action.went) {
            System.out.print(name + " " + "отправился");
        } else if (action == Action.ordered_to_get_attached) {
            System.out.print("," + " " + name + " " + "приказал всем привязаться");
        } else if (action == Action.was_received) {
            System.out.print("было получено");
        } else if (action == Action.turned_on) {
            System.out.print(name+" "+"включил");
        } else if (action == Action.pressed){
            System.out.print("нажал"+" ");
        } else if (action == Action.got_up) {
            System.out.print(name+" "+"поднялся");
        } else if (action == Action.dragged) {
            System.out.print("потащил");
        }else if (action==null) {
            throw new NullException("Введёно пустое значение!");
        } else {
            throw new InvalidInputException("Введён не тот метод!");
        }
    }
}
