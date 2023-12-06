package objects.entity;

import enums.Action;

public class DoctorPilulkin extends Entity {
    private final String name;
    public DoctorPilulkin(String name) {
        super(name);
        this.name=name;
    }
    @Override
    public void doSomething(Action action) {
        System.out.print(this.name);
        if (action==Action.said_what) {
            System.out.print(" сказал, что ");
        }
    }
}