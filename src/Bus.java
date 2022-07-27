public class Bus extends Transport implements Terrestrial, PublicTransport, UseLiquidFuel {

    static {
        type = "Наземный";
        movementPrinciple = "На жидком топливе";
        purpose = "Общественный транспорт";
    }

    public Bus() {
        canDeliverPeople(60);
        letMove();
        calcFuel("бензин", 200);
    }

    @Override
    public void canDeliverPeople(int passengers) {
        System.out.println("Я могу перевозить " + passengers + " пассажиров");
    }

    @Override
    public void letMove() {
        System.out.println("Мчим во все 4 колеса!!!");
    }

    @Override
    public void calcFuel(String fuel, int distance) {
        int litres = distance * 8;
        System.out.println("Необходимо " + litres + " литров " + fuel);
    }
}
