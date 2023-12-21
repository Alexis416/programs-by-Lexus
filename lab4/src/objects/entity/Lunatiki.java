package objects.entity;

import enums.Action;

public class Lunatiki extends Entity{
    private final String name;

    public Lunatiki(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void doSomething(Action action) throws InvalidInputException {
        if (action == Action.gasped_in_amazement){
            System.out.print(name+" "+"ахнули от изумления");
        }else if (action==null) {
            throw new NullException("Введёно пустое значение!");
        } else {
            throw new InvalidInputException("Введён не тот метод!");
        }
    }
}
