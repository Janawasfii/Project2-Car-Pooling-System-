import java.util.SortedMap;


public class SubscribersPassengers extends Passenger {
    public SubscribersPassengers(String name, String id) {
        super(name,id);}

    @Override
   public void reserveCar(Car car) throws Exception {
            if (car.getMaxCapacity() == 0) {
                throw new IllegalArgumentException("This passenger can't reserve cars with max capacity equals 0.");
            }
            setReservedCar(car);
            this.setTripCost(car.getFixRoute().getTripPrice() * 0.50);
        }
        @Override
   public void displayInfo() {
            System.out.println("Information of Passenger:");
            System.out.println("Name of passenger: " + getName());
            System.out.println("ID of passenger: " + getId());
            System.out.println("Reserved Car: " + getReservedCar().getCodes());
            System.out.println("Trip cost before 50% discount: "+getReservedCar().getFixRoute().getTripPrice());
            System.out.println("Trip Cost after 50% discount: " + getTripCost());

        }



}





















