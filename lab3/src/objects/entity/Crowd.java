package objects.entity;

import enums.Action;

public class Crowd extends Entity {
    private final String name;
    public Crowd(String name) {
        super(name);
        this.name=name;
    }
    @Override
    public void getName(){
        System.out.print("Фуксии, Селёдочки и профессора Звездочкина");
    }
    @Override
    public void doSomething(Action action) {
        if (action==Action.so_as_not_to_be_exposed){
            System.out.print("чтобы не подвергаться");
        }
    }
}
