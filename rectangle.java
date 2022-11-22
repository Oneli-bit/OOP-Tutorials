
import java.awt.*;

public class rectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(0,0,100,50);
        System.out.println("R1: "+r1);


        Rectangle r2=new Rectangle(r1); //create new object
        r2.grow(10,20);
        System.out.println("R2: "+r2);

        Rectangle r3=r1; //pass the reference
        System.out.println("R3: "+r3);



    }








}
