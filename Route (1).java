public class Route {
    private String pickAddress;
    private String destAddress;
    private double tripPrice;

    public Route(String pickAddress, String destAddress, double tripPrice) {
        this.pickAddress = pickAddress;
        this.destAddress = destAddress;
        this.tripPrice = tripPrice;
    }

    public String getPickAddress() {
        return pickAddress;
    }

    public void setPickAddress(String pickAddress) {
        this.pickAddress = pickAddress;
    }

    public String getDestAddress() {
        return destAddress;
    }

    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    /*public String getDisplay(){
        return "Pick Address: " + pickAddress + "Destination Address: " + destAddress;
    }*/
    }

