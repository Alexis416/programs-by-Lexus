package objects.entity;

import enums.Action;
import interfaces.Feel;
import interfaces.Property;
import objects.Obj;

import java.util.Objects;

public abstract class Entity extends Obj implements Property, Feel {
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
    public abstract void doSomething(Action action) throws InvalidInputException;

    public void getName(){

    };
    @Override
    public void properties(String property) {
        System.out.print(property);
    }
    @Override
    public void feels(String feel) {
        System.out.print(feel);

    }
}
