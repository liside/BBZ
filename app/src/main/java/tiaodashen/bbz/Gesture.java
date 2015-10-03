package tiaodashen.bbz;

/**
 * Created by XavierWang on 15/10/3.
 */
public abstract class Gesture {

        private String name;

        public Gesture() {
            setName("Gesture");
        }

        public Gesture( String name ) {
            setName(name);
        }

        public abstract void compareTo( Gesture gesture );

        private void setName( String name ) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

}
