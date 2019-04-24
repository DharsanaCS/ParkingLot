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


    public void addCar() {
        capacity--;
    }

    public void removeCar() {
        capacity++;
    }
}
