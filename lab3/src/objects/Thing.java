package objects;

import interfaces.Property;

public class Thing extends Obj implements Property {
    final String name;
    public Thing(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public void properties(String property) {
        System.out.print(property + super.name);
    }
}
