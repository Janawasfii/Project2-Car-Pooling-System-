//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //First example of Route (From class Route I created a new objects r1 and r2.
        Route r1 = new Route("AlMalaz", "Tuwaiq Academy", 69.34);
        Route r2 = new Route("AlWadi", "AlMalaz", 26.56);

        //Here is two differnts car objects c1 and c2 and I assigned each of r1 and r2 to different Car object.
        // Also, c2 have a maximum capacity equals zero.
        Car c1 = new Car("C1A0", r1, 5);
        Car c2 = new Car("C1A1", r2, 0);

        //Setting the maximum Capacity.
        // c1.setMaxCapacity(3);

        //Here I used set to change the Destination address for r2 from AlMalaz to Dhahrat Laban
        r2.setDestAddress("Dhahrat Laban");
        //After changed destination for the trip the price also changed from 26.56 to 34.13
        r2.setTripPrice(74.13);
        //set the pick up address
        r1.setPickAddress("AlMuhammadiya");
        r1.setTripPrice(52.43);

        //Other example of Routes with different informations:

        Route r3 = new Route("Almalqa", "Altakhasusi", 37.67);
        Route r4 = new Route("AlYasmeen", "AlNarjs", 44.52);

        //Also Other example of Car objects.
        // Car c3 = new Car("C1A2",r1,0);
        // Car c4 = new Car("C2A3",r2,5);

        // Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber
        Passenger[] passengers = {
                new SubscribersPassengers("Jana", "111452"),
                new NonSubscribersPassengers("Jenan", "126393", true),};


        // Assign a different car object to each passenger and then display their information
        for (Passenger passenger : passengers) {
            try {
                System.out.println("************* Welcome to Car Pooling System *************");
                if (passenger instanceof SubscribersPassengers) {
                    passenger.reserveCar(c1);
                    System.out.println("Pick up address: " + r1.getPickAddress() + " " + ",Destination: " + r1.getDestAddress());
                } else {
                    passenger.reserveCar(c2);
                    System.out.println("Pick up address: " + r2.getPickAddress() + " " + ",Destination: " + r2.getDestAddress());
                }
                passenger.displayInfo();
                System.out.println("---------------------------------------------------------------");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occured");
            }
          //  System.out.println("Car code is reversed: " + passenger.getCar().isCodeReversed());

        }

        //Car 1 has been resrve


    }

}