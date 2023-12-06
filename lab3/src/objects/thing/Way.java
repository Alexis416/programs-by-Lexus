package objects.thing;

import objects.thing.Thing;

public class Way extends Thing {
    public Way(String name) {
        super(name);
    }

    public void getName(){
        System.out.print("путь");
    }
}
