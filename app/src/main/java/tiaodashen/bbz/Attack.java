package tiaodashen.bbz;

/**
 * Created by XavierWang on 15/10/3.
 */

public class Attack extends Gesture {

    private int capacity;

    public Attack( int capacity, int charge ) {
        super("Attack", charge);
        this.capacity = capacity;

    }

    public int compareTo( Gesture gesture ) {

        if ( gesture instanceof Attack ) {
            if ( this.getCapacity() == ((Attack) gesture).getCapacity()) {
                return 0;
            }
            else if (this.getCapacity() < ((Attack) gesture).getCapacity()) return -1;
            else return 1;
        }

        else if ( gesture instanceof Defend ) {
            if ( (this.getCapacity()+1)/2 != ((Defend) gesture).getCapacity()
               || this.getCapacity()/2 > ((Defend) gesture).getCharge() ) return 1;
            else return 0;
        }
        else return 1;
    }

    public int chargeChange(){
        return -capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

}
