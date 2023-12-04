package objects;

import enums.Action;
import interfaces.Feel;
import interfaces.Property;

import java.util.Objects;

public class Entity extends Obj implements Property, Feel {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    private final String name;
    public Entity(String name) {
        super(name);
        this.name = name;
    }
    public void doSomething(Action action){
        System.out.print(super.name);
        if (action==Action.said){
            System.out.print(" сказал:");
        } else if (action==Action.feels) {
            System.out.print(" чувствует ");
        } else if (action==Action.needs_to_be_sent_immediately) {
            System.out.print(" нужно немедля отправить в ");
        } else if (action==Action.can_get_free) {
            System.out.print(" может освободиться от ");
        } else if (action==Action.by_giving_an_order) {
            System.out.print(" Отдав распоряжение ");
        } else if (action==Action.do_not_go_out) {
            System.out.print(" не выходить из ");
        } else if (action==Action.so_as_not_to_be_exposed) {
            System.out.print(" чтобы не подвергаться ");
        } else if (action==Action.went) {
            System.out.print(" отправился в ");
        }else if (action==Action.said_what) {
            System.out.print(" сказал, что ");
        }
    }


    @Override
    public void properties(String property) {
        System.out.print(property + " " + super.name);
    }
    @Override
    public void feels(String feel) {
        System.out.print(super.name +" "+ feel);

    }
}
