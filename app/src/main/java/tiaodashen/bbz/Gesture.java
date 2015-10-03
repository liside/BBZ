package tiaodashen.bbz;

/**
 * Created by XavierWang on 15/10/3.
 */
import java.lang.Number;

public abstract class Gesture {

        private String name;
        private int charge;

        public Gesture() {
            setName("Gesture");
            this.charge = 0;
        }

        public Gesture( String name, int charge ) {
            setName(name);
            setCharge(charge);
        }

        public abstract int compareTo( Gesture gesture );

        public int chargeChange(){
            return 0;
        }

        private void setName( String name ) {
            this.name = name;
        }

        private void setCharge( int charge ) {
            this.charge = charge;
        }

        public String getName() {
            return this.name;
        }

        public int getCharge() {
            return this.charge;
        }

}
