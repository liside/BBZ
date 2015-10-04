package tiaodashen.bbz;
import java.util.Random;

/**
 * Created by XavierWang on 15/10/3.
 */
public class Ainpc {

    private Random generator;
    private Board aiBoard;
    private Gesture aiMove;
    private int aiCharge;
    private int round;
    private int var;
    private int chargeVar = 40;
    private int defendVar = 30;
    private int attackVar = 30;

    public Ainpc() {

        this.generator = new Random();
        this.aiMove = new Charge(0);
        this.aiBoard = new Board( 0, this.aiMove);
        this.aiCharge = 0;
        this.round = 1;
        this.var = 0;


    }

    public void rollNextMove() {

        int chargePercent = generator.nextInt(40);
        int defendPercent = generator.nextInt(30);
        int attackPercent = generator.nextInt(30);
        if ( attackPercent > chargePercent ) {
            if ( defendPercent > chargePercent ) {
                int capacity = generator.nextInt(aiCharge);
                while ( capacity == 0 ){
                    capacity = generator.nextInt(aiCharge);
                }
                setMove( new Attack( capacity, aiCharge ) );
            }
            else {

            }
        }
        else
        setVar(var + generator.nextInt(20));
    }

    public Board getBoard() {
        return this.aiBoard;
    }

    public void setMove( Gesture move ) { this.aiMove = move; }
    public void setVar(int newVar) { this.var = newVar; }

}
