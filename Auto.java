package javapractice.inheritance.oop;

public class Auto {

    private String producer;
    private String model;
    private int engineVolume;
    private String bodyType;
    private int productionYear;
    private EngineType engineType;

    public Auto(String producer, String model, int engineVolume, String bodyType, int productionYear, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineVolume = engineVolume;
        this.bodyType = bodyType;
        this.productionYear = productionYear;
        this.engineType = engineType;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", bodyType='" + bodyType + '\'' +
                ", productionYear=" + productionYear +
                ", engineType=" + engineType +
                '}';
    }
}
