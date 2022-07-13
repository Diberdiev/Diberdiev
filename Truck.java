package javapractice.inheritance.oop;

public class Truck extends Auto{
    private String colour = "Blue";

    public Truck(String producer, String model, int engineVolume, String bodyType, int productionYear, EngineType engineType) {
        super(producer, model, engineVolume, bodyType, productionYear, engineType);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "colour='" + colour + '\'' +
                ", producer='" + getProducer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume='" + getEngineVolume() + '\'' +
                ", bodyType='" + getBodyType() + '\'' +
                ", productionYear='" + getProductionYear() + '\'' +
                ", engineType='" + getEngineType() + '\'' +
                '}';
    }
}
