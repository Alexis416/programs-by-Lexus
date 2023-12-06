package objects.entity;

import enums.Action;
import objects.entity.Entity;

public class Neznaika extends Entity {
    private final String name;
    public Neznaika(String name) {
        super(name);
        this.name=name;

    }

    @Override
    public void doSomething(Action action) {
        if (action == Action.feels) {
            System.out.print(name + " чувствует ");
        }else if (action == Action.needs_to_be_sent_immediately){
            System.out.print("нужно немедля отправить");
        }else if (action == Action.can_get_free) {
            System.out.println("сможет освободиться");
        }
    }
}
