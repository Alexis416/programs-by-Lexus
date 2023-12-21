package objects.entity;

import enums.Action;

public class Astronauts extends Entity{
    private final String name;
    public Astronauts(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public void getName() {
        System.out.print("космонавты");
    }

    @Override
    public void doSomething(Action action) throws InvalidInputException {
        if (action==Action.attached){
            System.out.print(name+" "+"прикрепили");
        }else if (action==Action.lined_up){
            System.out.print("выстроились");
        }else if (action==Action.got_up) {
            System.out.print(" поднялись");
        } else if (action==null) {
            throw new NullException("Введёно пустое значение!");
        } else {
            throw new InvalidInputException("Введён не тот метод!");
        }
    }
    public static class Row extends Entity {
        public Row(String name) {
            super(name);
        }

        @Override
        public void getName() {
            System.out.print("вереницей");
        }

        @Override
        public void doSomething(Action action) {

        }
    }
}
