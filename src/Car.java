public class Car {

    private String registrationNumber;
    private String status;


    public void park(ParkingLot parkLot)
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


    }


}
