import java.time.LocalDateTime;

public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;
   // protected Car car;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void reserveCar(Car car)throws Exception; ;

    public abstract void displayInfo();


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setReservedCar(Car car) {
        this.reservedCar = car;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }
   /* public Car getCar() {
        return car;
    }*/

}
