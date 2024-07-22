public class NonSubscribersPassengers extends Passenger{
    private boolean hasCoupon;

    public NonSubscribersPassengers(String name, String id, boolean hasCoupon) {
        super(name, id);
        this.hasCoupon = hasCoupon;
    }
    public boolean isHasCoupon() {
        return hasCoupon;
    }

    public void setHasCoupon(boolean hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new IllegalArgumentException("This passenger can't reserve cars with max capacity equals 0.");
        }
        setReservedCar(car);
        if (hasCoupon)
            this.setTripCost((car.getFixRoute().getTripPrice())-(car.getFixRoute().getTripPrice()* 0.10));
         else {
            setTripCost(car.getFixRoute().getTripPrice());
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Information of Passenger:");
        System.out.println("Name of passenger: " + getName());
        System.out.println("ID of passenger: " + getId());
        System.out.println("Reserved Car: " + getReservedCar().getCodes());
        System.out.println("Trip cost before 10% discount: "+getReservedCar().getFixRoute().getTripPrice());
        System.out.println("Trip Cost after 10% discount: " + getTripCost());
       //System.out.println("Has Coupon: " + isHasCoupon());
    }



}
