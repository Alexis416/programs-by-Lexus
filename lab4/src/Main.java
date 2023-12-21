import enums.Action;
import objects.entity.*;
import objects.thing.*;

import static enums.Action.*;

public class Main {
    public static void main(String[] args) {
        //Создание экземпляров живых объектов
        DoctorPilulkin doctor = new DoctorPilulkin("Доктор Пилюлькин");
        Neznaika neznaika = new Neznaika("Незнайка");
        Znaika znaika = new Znaika("Знайка");
        Lunatiki lunatiki = new Lunatiki("Лунатики");
        Astronauts astronauts = new Astronauts("Космонавты");
        Nobody nobody = new Nobody("Никто");

        //Создание экземпляров похожих объектов, объединённых общими признаками(влож. статические классы)
        Crowd.Crowd1 crowd1 = new Crowd.Crowd1("Фуксия, Селёдочка и профессор Звездочкин");
        Crowd.Crowd2 crowd2 = new Crowd.Crowd2("Кантик и квантик и Альфа с Мемегой");
        Crowd.Crowd3 crowd3 = new Crowd.Crowd3("Все");
        Crowd.Crowd4 crowd4 = new Crowd.Crowd4("Некоторые");
        Crowd.Crowd5 crowd5 = new Crowd.Crowd5("Многие");
        Astronauts.Row row = new Astronauts.Row("Вереница");

        //Использование анонимных классов для изменения окончания названий объектов
        Neznaika neznaiku = new Neznaika("Незнайку"){
            @Override
            public void getName() {
                System.out.print(" незнайку ");
            }
        };
        Astronauts astronauts1 = new Astronauts("Космонавтов"){
            @Override
            public void getName() {
                System.out.print("космонавтов");
            }
        };


        //Создание экземпляров неживых объектов
        Rocket rocket = new Rocket("ракета");
        RockingChair rockingChair = new RockingChair("кресло-качалка");
        SpaceSuit spaceSuit = new SpaceSuit("скафандр");
        Cave cave = new Cave("пещера");
        Move move = new Move("действие");
        Ray ray = new Ray("луч");
        Way way = new Way("путь");
        Escort escort = new Escort("сопровождение");
        Cord cord = new Cord("шнур");
        Time time = new Time("время");
        Order order = new Order("приказание");
        Preparations preparations = new Preparations("приготовления");
        Chain chain = new Chain("цепочка");
        WeightlessnessDevice weightlessnessDevice = new WeightlessnessDevice("прибор невесомости");
        ElectricMotor electricMotor = new ElectricMotor("электродвигатель");
        Buzzing buzzing = new Buzzing("жужжание");
        Air air = new Air("воздух");
        Excitement excitement = new Excitement("возбуждение");

        //Создание экземпляров составных частей объектов(влож. нестатические классы)
        RockingChair.Strap strap = rockingChair.new Strap("ремень");
        RockingChair.Seat seat = rockingChair.new Seat("сиденье");
        SpaceSuit.Belt belt = spaceSuit.new Belt("пояс");
        SpaceSuit.AlpenshtockAndOtherTools alpenshtockAndOtherTools =
                spaceSuit.new AlpenshtockAndOtherTools("альпенштоки, и другие инструменты");
        Znaika.Back back = znaika.new Back("спина");
        ElectricMotor.Button button = electricMotor.new Button("кнопка");
        ElectricMotor.Propeller propeller = electricMotor.new Propeller("пропеллер");

        //Использование анонимных классов для изменения окончания
        // названий объектов и для неполных существительных
        RockingChair chair = new RockingChair("кресло"){
            @Override
            public void getName() {
                System.out.print("кресло");
            }
        };
        SpaceSuit spaceSuits = new SpaceSuit("скафандры"){
            @Override
            public void getName() {
                System.out.print("скафандры ");
            }
        };
        SpaceSuit spaceSuit1 = new SpaceSuit("скафандру"){
            @Override
            public void getName() {
                System.out.print("скафандру");
            }
        };
        Way way1 = new Way("пути"){
            @Override
            public void getName(){
                System.out.print("пути");
            }
        };



        try {

            //1 предложение
            System.out.print("Как" + " " + "только" + " ");
            spaceSuits.getName();
            nobody.doSomething(Action.were_wearing);
            znaika.doSomething(ordered_to_get_attached);
            System.out.print(" " + "к" + " ");
            cord.properties("длинному" + " " + "капроновому" + " ");
            cord.getName();
            System.out.print("," + " " + "который" + " ");
            nobody.doSomething(was_prepared);
            System.out.print(" " + "заранее" + ".");

            //2 предложение
            System.out.print(" " + "Все" + " " + "тотчас" + " ");
            nobody.doSomething(completed);
            order.getName();

            //3 предложение
            System.out.println("." + " " + "В" + " " + "то" + " " + "же");
            time.getName();
            crowd2.getName();
            crowd2.doSomething(set);
            neznaiku.getName();
            System.out.print("в" + " ");
            rockingChair.getName();
            crowd2.doSomething(attached);
            System.out.print(" " + "его" + " ");
            strap.getName();
            System.out.print(" " + "к" + " ");
            seat.getName();
            System.out.print("," + " " + "чтоб" + " " + "он" + " " + "не" + " ");
            neznaika.doSomething(fell_out);
            System.out.print(" " + "в" + " ");
            way1.getName();
            System.out.print("," + " " + "а" + " ");
            chair.getName();
            System.out.print(" " + "тоже" + " ");
            crowd2.doSomething(tied_up);
            System.out.println(" " + "к" + " ");
            cord.properties("капроновому" + " ");
            cord.getName();

            //4 предложение
            System.out.print("." + " " + "Наконец" + " " + "все" + " ");
            preparations.getName();
            nobody.doSomething(were_finished);

            //5 предложение
            System.out.print("." + " ");
            astronauts.doSomething(attached);
            System.out.print(" " + "к" + " ");
            belt.getName();
            alpenshtockAndOtherTools.getName();
            System.out.print(" " + "и" + " ");
            astronauts.doSomething(lined_up);
            System.out.println(" " + "в" + " ");
            chain.getName();
            System.out.print("." + " ");

            //6 предложение
            znaika.properties("Стоявший впереди всех" + " ");
            znaika.doSomething(turned_on);
            weightlessnessDevice.getName();
            System.out.print("," + " " + "который" + " ");
            nobody.doSomething(was_attached);
            System.out.print(" " + "к" + " ");
            spaceSuit1.getName();
            System.out.print(" " + "у" + " " + "него" + " " + "за" + " ");
            back.getName();
            System.out.print("," + " " + "и" + " ");
            znaika.doSomething(pressed);
            button.getName();
            electricMotor.getName();
            System.out.println("." + " ");

            //7 предложение
            nobody.doSomething(heard);
            buzzing.properties(" " + "мерное" + " ");
            buzzing.getName();

            //8 предложение
            System.out.print("." + " " + "Это" + " ");
            nobody.doSomething(spun);
            propeller.getName();

            //9 предложение
            System.out.print("." + " " + "Потеряв" + " " + "вес" + "," + " ");
            znaika.doSomething(got_up);
            System.out.print(" " + "плавно" + " " + "в" + " ");
            air.getName();
            System.out.print(" " + "и" + " ");
            znaika.doSomething(dragged);
            System.out.print(" " + "за" + " " + "собой" + " ");
            astronauts1.properties("остальных" + " ");
            astronauts1.getName();
            System.out.println("." + " ");

            //10 предложение
            lunatiki.doSomething(gasped_in_amazement);
            System.out.print("," + " " + "увидев" + "," + " " + "как" + " ");
            astronauts.getName();
            row.properties(" " + "длинною" + " ");
            row.getName();
            astronauts.doSomething(got_up);
            System.out.print(" " + "в" + " ");
            air.getName();
            System.out.print("." + " ");

            //11 предложение
            crowd3.doSomething(screamed);
            crowd3.doSomethingWithHelpOfSomething1();
            crowd3.doSomethingWithHelpOfSomething2();
            crowd3.doSomethingWithHelpOfSomething3();

            //12 предложение
            crowd4.doSomething(jumped);
            System.out.print(" " + "от" + " ");
            excitement.getName();
            System.out.print("." + " ");

            //13 предложение
            crowd5.doSomething(cried);
            System.out.println(".");

            //14 предложение
            doctor.doSomething(Action.said_what);
            neznaika.doSomething(feels);
            System.out.print("себя");
            neznaika.feels(" " + "очень плохо," + " ");
            System.out.print("поэтому его" + " ");
            neznaika.doSomething(Action.needs_to_be_sent_immediately);
            System.out.print(" " + "в" + " ");
            rocket.getName();
            System.out.print("," + " " + "где он" + " ");
            neznaika.doSomething(Action.can_get_free);
            System.out.print("от" + " ");
            spaceSuit.properties("тяжёлого" + " ");
            spaceSuit.getName();

            //15 предложение
            System.out.print("." + " " + "Но" + " ");
            znaika.doSomething(Action.said);

            //16 предложение
            znaika.doSomething(Action.by_giving_an_order);
            System.out.print(" " + "никому" + " ");
            znaika.doSomething(Action.do_not_go_out);
            cave.getName();
            System.out.print("," + " ");
            crowd1.doSomething(Action.so_as_not_to_be_exposed);
            System.out.print(" " + "лишний раз" + " ");
            move.getName();
            ray.properties("космических" + " ");
            ray.getName();
            System.out.print("," + " ");
            znaika.doSomething(went);
            System.out.print(" " + "в" + " ");
            way.properties("обратный" + " ");
            way.getName();
            System.out.print(" " + "в" + " ");
            escort.getName();
            System.out.print(" ");
            crowd1.getName();
            System.out.print(".");
        }catch (InvalidInputException e){
            System.out.println("...Здесь прописано действие, которым не владеет объект!");
        }
    }
}