public class TrolleyBus extends Transport implements Terrestrial, UseElectricity, PublicTransport{

    static {
        type = "Наземный";
        movementPrinciple = "На электричестве";
        purpose = "Общественный транспорт";
    }

    public TrolleyBus() {
        canDeliverPeople(80);
        letMove();
        isThereElectricLine("Любава");
    }

    @Override
    public void canDeliverPeople(int passengers) {
        System.out.println("Я могу перевозить " + passengers + " пассажиров");

    }

    @Override
    public void letMove() {
        System.out.println("Мчим во все 4 колеса!!! были б только провода!!!");
    }

    @Override
    public void isThereElectricLine(String station) {
       System.out.println("До станции " + station + " доехать не могу. Там не проложен электролиний путь!");
    }
}
