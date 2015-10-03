package tiaodashen.bbz;

/**
 * Created by XavierWang on 15/10/3.
 */
public class Charge extends Gesture {

    public Charge( int charge ) {
        super("Charge", charge);
    }

    public int compareTo( Gesture gesture ) {

        if ( gesture instanceof Attack ) return -1;
        else return 0;

    }

    public int chargeChange(){
        return 1;
    }

}
