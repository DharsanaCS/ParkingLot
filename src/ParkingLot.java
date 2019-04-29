public class ParkingLot {

    private int capacity;

    ParkingLot(int capacity){
        this.capacity = capacity;
    }

    public boolean isFull(){
        if(capacity == 0)
            return true;
        else
            return false;
    }


    public boolean addVehicle() {
        if(this.isFull()){
            System.out.println("Parking is full. Vehicle cannot be parked");
            return false;
        }

        else
        {
            capacity--;
            return true;
        }

    }

    public void removeVehicle() {
        capacity++;
    }
}
