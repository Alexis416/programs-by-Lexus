package objects.entity;

import enums.Action;

public class Nobody extends Entity{

    public Nobody(String name) {
        super(name);
    }

    @Override
    public void doSomething(Action action) throws InvalidInputException{
        if (action == Action.were_wearing) {
            System.out.print("были надеты");
        } else if (action == Action.was_prepared) {
            System.out.print("был приготовлен");
        } else if (action == Action.completed) {
            System.out.print("выполнили ");
        } else if (action == Action.were_finished) {
            System.out.print(" были закончены");
        } else if (action== Action.was_attached) {
            System.out.print("был прикреплён");
        } else if (action== Action.heard) {
            System.out.print("Послышалось");
        } else if (action== Action.spun) {
            System.out.print("завертелся ");
        }else if (action==null) {
            throw new NullException("Введёно пустое значение!");
        } else {
            throw new InvalidInputException("Введён не тот метод!");
        }
    }
}
