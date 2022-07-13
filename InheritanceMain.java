package javapractice.inheritance.oop;

public class InheritanceMain {
    public static void main(String[] args) {
        Truck auto = new Truck("Audi", "Sprinter", 2, "Universal", 2020, EngineType.PETROL);
        Car car = new Car("BMW", "7", 3, "coupe", 2018, EngineType.ELECTRIC);
        Bus bus = new Bus("Mers", "GL", 5, "sedan", 2003, EngineType.DIESEL);
        System.out.println("Car -> " + car + "\n" + "Bus -> " + bus + "\n" + "Truck -> " + auto);


    }


}
