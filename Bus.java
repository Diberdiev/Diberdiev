package javapractice.inheritance.oop;

public class Bus extends Auto{
    private String colour = "Red";
    private int capacityOfPeople = 25;



    public Bus(String bmw, String sprinter, int engineVolume, String universal, int productionYear, EngineType diesel) {
        super(bmw, sprinter, engineVolume, universal, productionYear, diesel);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCapacityOfPeople() {
        return capacityOfPeople;
    }

    public void setCapacityOfPeople(int capacityOfPeople) {
        this.capacityOfPeople = capacityOfPeople;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "colour='" + colour + '\'' +
                ", capacityOfPeople=" + capacityOfPeople +
                ", producer='" + getProducer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume='" + getEngineVolume() + '\'' +
                ", bodyType='" + getBodyType() + '\'' +
                ", productionYear='" + getProductionYear() + '\'' +
                ", engineType='" + getEngineType() + '\'' +
                '}';
    }
}
