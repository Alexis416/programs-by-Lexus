package objects.entity;

import enums.Action;

public class DoctorPilulkin extends Entity {
    private final String name;
    public DoctorPilulkin(String name) {
        super(name);
        this.name=name;
    }
    @Override
    public void doSomething(Action action) throws InvalidInputException {
        System.out.print(name);
        if (action==Action.said_what) {
            System.out.print(" сказал, что ");
        }else if (action==null) {
            throw new NullException("Введёно пустое значение!");
        } else {
            throw new InvalidInputException("Введён не тот метод!");
        }
    }
}