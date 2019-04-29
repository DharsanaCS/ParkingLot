public class Main {

    public static void main(String[] args){

        Parkable car1 = new Car();
        ParkingLot parkingLot = new ParkingLot(2);
        car1.park(parkingLot);

        Parkable car2 = new Car();
        car2.park(parkingLot);



        car2.unpark(parkingLot);

        Parkable jeep = new Jeep();
        jeep.park(parkingLot);

        if(parkingLot.isFull())
            System.out.println("Parking is full");

            // should return true


    }
}
