package objects.thing;

import interfaces.Property;
import objects.Obj;

import java.util.Objects;

public abstract class Thing extends Obj implements Property {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name.toLowerCase(), thing.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    final String name;
    public Thing(String name) {
        super(name);
        this.name=name;
    }
    public void getName(){};
    @Override
    public void properties(String property) {
        System.out.print(property);
    }
}
