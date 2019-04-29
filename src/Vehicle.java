public abstract class Vehicle implements Parkable {

    public void park(ParkingLot parkLot){
        if(parkLot.addVehicle()) notifyPark();
    }

    public void unpark(ParkingLot parkLot)
    {
        parkLot.removeVehicle();
        notifyUnPark();
    }

    abstract public void notifyPark();

    abstract public void notifyUnPark();



}


