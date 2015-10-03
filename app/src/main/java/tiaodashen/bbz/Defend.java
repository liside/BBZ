package tiaodashen.bbz;

/**
 * Created by XavierWang on 15/10/3.
 */
public class Defend extends Gesture {

    private int capacity;
    private int capacityChange;

    public Defend( int capacity, int charge ) {
        super("Defend", charge);
        this.capacity = capacity;
        this.capacityChange = 0;
    }

    public int compareTo( Gesture gesture ) {

        if ( gesture instanceof Attack ) {
            if ( this.getCapacity() != (((Attack) gesture).getCapacity()+1)/2
                 || this.getCharge() < ((Attack) gesture).getCapacity()/2 )    {
                setCapacityChange( ((Attack) gesture).getCapacity()/2 );
                return -1;
            }
            else {
                setCapacityChange( ((Attack) gesture).getCapacity()/2 );
                return 0;
            }
        }
        else return 0;

    }

    public void setCapacityChange( int change ){
        this.capacityChange = change;
    }

    public int chargeChange(){
        return capacityChange;
    }

    public int getCapacity() {
        return this.capacity;
    }


}
