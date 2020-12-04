import java.io.IOException;
import java.util.Random;

public class main {
    public static void main (String[] args) throws IOException {
        square sq1 = new square(10,0,1);
        square sq2 = new square(15,0,0);
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq1.compareTo(sq2));
        System.out.println("Divided side: " + sq1.divideside(2));
        System.out.println("Increment of x0: " + sq1.incrementx0());
        System.out.println("Increment of y0: " + sq1.incrementy0());
        //task 4
        squares s0 = new squares();
        for (int i = 0; i<=3; i++){
            Random rnd = new Random();
            int side, x0, y0;
            side = rnd.nextInt(10);
            x0 = rnd.nextInt(10);
            y0 = rnd.nextInt(10);
            try {
                square s = new square(side,x0,y0);
                s0.addsquare(s);
            }
            catch (Exception e){
                square s = new square(side,x0,y0);
                s0.addsquare(s);
            }
        }
        s0.savetofile();
        s0.searchzero();
        s0.searchminside();
        s0.calculateaverageside();
    }
}
