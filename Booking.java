public class Booking {
    private String pickupLocation;
    private String dropLocation;
    private float totalFair;
    public void makeBooking(String pickupLocation, String dropLocation, int distance, int carType)
    {
        this.pickupLocation=pickupLocation;
        this.dropLocation=dropLocation;
        if(carType==1)
            totalFair=0;
        else if(carType==2)
            totalFair=100;
        else if(carType==3)
            totalFair=200;

        if(distance>100)
            this.totalFair+=1000;
        else if(distance>50)
            this.totalFair+=500;
        else if(distance>20)
            this.totalFair+=200;
        else
            this.totalFair+=100;
    }

    public float getTotalFair() {
        return totalFair;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void makePayment(int p)
    {
        System.out.println("Payment Successful");
    }
}
