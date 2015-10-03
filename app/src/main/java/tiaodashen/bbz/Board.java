package tiaodashen.bbz;
import java.util.Scanner;

/**
 * Created by guoziqing on 10/3/15.
 */
public class Board {

    public static String attack1 = "Stab";
    public static String attack2 = "Gunshot";
    public static String attack3 = "Canon";
    public static String attack4 = "Missile";
    public static String attack5 = "Atomic Bomb";
    public static String defense1 = "Shield";
    public static String defense2 = "Bunker";
    public static String charging = "Charging";

    public static int charge;
    public static int att;
    public static Board input;
    public static int Game = 1;
    public static int defense;
    public static Gesture ges;
    public static boolean start;

    public Board(int myCharge, Gesture myGes,Board input)
    {
        this.input = input;
        this.charge = myCharge;
        this.ges = myGes;
       // this.att = input.getAttack();
    }
    public Board( int charge, Gesture myGes )
    {
        this.input = null;
        this.charge = charge;
        this.ges = myGes;
    }

    public static void main (String[] args)
    {
        if(start) {
            start = false;
            Scanner in = new Scanner(System.in);
            Board myself;
            String initial = in.next();
            Gesture ch = null;
            if(initial.equals(charging)) {
                ch = new Charge(1);
            }
            else if (initial.equals(defense1))
            {
                ch = new Defend(1,1);
            }
            else if (initial.equals(defense2))
            {
                ch = new Defend(2,1);
            }
            else
            {
                System.out.println("Invalid!");
            }
            myself = new Board(0,ch);
        }
        else {
            while (Game == 0) {
                Scanner read = new Scanner(System.in);
                String s = read.next();
                Board myself = null;
                if (s.equals(attack1) && charge >= 1) {
                    Attack a1 = new Attack(1, charge);
                    myself = new Board(charge, a1, input);
                    Game = a1.compareTo(new Attack(input.getAttack(), input.getCharge()));
                    charge = charge + a1.chargeChange();
                } else if (s.equals(attack2) && charge >= 2) {
                    Attack a2 = new Attack(2, charge);
                    myself = new Board(charge, a2, input);
                    Game = a2.compareTo(new Attack(input.getAttack(), input.getCharge()));
                    charge = charge + a2.chargeChange();
                } else if (s.equals(attack3) && charge >= 3) {
                    Attack a3 = new Attack(3, charge);
                    myself = new Board(charge, a3, input);
                    Game = a3.compareTo(new Attack(input.getAttack(), input.getCharge()));
                    charge = charge + a3.chargeChange();
                } else if (s.equals(attack4) && charge >= 4) {
                    Attack a4 = new Attack(4, charge);
                    myself = new Board(charge, a4, input);
                    Game = a4.compareTo(new Attack(input.getAttack(), input.getCharge()));
                    charge = charge + a4.chargeChange();
                } else if (s.equals(attack5) && charge >= 5) {
                    Attack a5 = new Attack(5, charge);
                    myself = new Board(charge, a5, input);
                    Game = a5.compareTo(new Attack(input.getAttack(), input.getCharge()));
                    charge = charge + a5.chargeChange();
                } else if (s.equals(defense1)) {
                    Defend d1 = new Defend(1, charge);
                    myself = new Board(charge, d1, input);
                    Game = d1.compareTo(new Defend(input.getDefense(),input.getCharge()));
                    charge = charge + d1.chargeChange();
                } else if (s.equals(defense2)) {
                    Defend d2 = new Defend(2,charge);
                    myself = new Board(charge,d2);
                    Game = d2.compareTo(new Defend(input.getDefense(), input.getCharge()));
                    charge = charge + d2.chargeChange();
                } else if (s.equals(charging)) {
                    Charge cg= new Charge(1);
                    myself = new Board(charge,cg,input);
                    Game = cg.compareTo(new Charge(1));
                    charge = charge + cg.chargeChange();
                }
            }
            if(Game > 1)
            System.out.println("You Win!");
            else
                System.out.println("You Lose!");
            start = true; //game over
        }

    }

    public int getAttack()
    {
        return this.att;
    }
    public int getCharge()
    {
        return this.charge;
    }
    public int getDefense()
    {
        return this.defense;
    }
    public void setAttack(int a)
    {
        this.att = a;
    }
    public void setCharge(int c)
    {
        this.charge = c;
    }
    public void setDefense(int d)
    {
        this.defense = d;
    }
}
