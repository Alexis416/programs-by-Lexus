package objects.entity;

import enums.Action;
import objects.entity.Entity;

public class Znaika extends Entity {
    private final String name;
    public Znaika(String name) {
        super(name);
        this.name=name;
    }
    public void doSomething(Action action) {
        if (action==Action.said){
            System.out.print(name+" сказал:");
        }else if (action==Action.by_giving_an_order){
            System.out.print(" "+"Отдав распоряжение");
        }else if (action==Action.do_not_go_out){
            System.out.print("не выходить из"+" ");
        }else if (action==Action.went) {
            System.out.print(name+" "+"отправился");
        }

    }
}
