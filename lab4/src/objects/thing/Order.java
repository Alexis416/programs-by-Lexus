package objects.thing;

public class Order extends Thing{

    public Order(String name) {
        super(name);
    }
    public void getName(){
        System.out.print("приказание");
    }
}
