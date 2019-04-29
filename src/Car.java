public class Car extends Vehicle {

    private String registrationNumber;
    private String status;

    @Override
    public void notifyPark() {
            System.out.println("Car parked");
    }

    @Override
    public void notifyUnPark() {
        System.out.println("Car Unparked");
    }




   /* public void park(ParkingLot parkLot)
    {
        if(parkLot.isFull())
            System.out.println("Parking is full");
        else
        {
            System.out.println("Car parked");
            parkLot.addCar();

        }



    }

    public void unpark(ParkingLot parkLot)
    {

        System.out.println("Car unparked");
        parkLot.removeCar();


    }*/


}
