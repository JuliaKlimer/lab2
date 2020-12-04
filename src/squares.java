import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class squares {
    public ArrayList<square> squaresarray;
    public squares() {
        squaresarray = new ArrayList<>();
    }
    public squares(square s) {
        squaresarray = new ArrayList<>();
        squaresarray.add(s);
    }
    public void addsquare(square s) {
        if (s != null) squaresarray.add(s);
    }
    public boolean savetofile() throws IOException {
        try {
            File fw = new File("D:\\input.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(fw);
            PrintWriter pw = new PrintWriter(fw);
            for (square s : this.squaresarray) {
                if (s != null) pw.println(s.toString());
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    //task 5
    public boolean searchzero() throws IOException {
        try {
            File srch = new File("D:\\srch.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(srch);
            PrintWriter pw = new PrintWriter(srch);
            for (square s : squaresarray) {
                if (s.getX0() == 0 || s.getY0() == 0) {
                    pw.println(s.toString());
                }
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    //task 6
    public boolean searchminside() {
        try {
            File srch = new File("D:\\srch1.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(srch);
            PrintWriter pw = new PrintWriter(srch);
            Integer min = Integer.MAX_VALUE;
            for (square s : squaresarray) {
                if(s.getSide() < min) min = s.getSide();
            }
            pw.println(min.toString());
            pw.flush();
            pw.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    //task 7
    public boolean calculateaverageside (){
        try {
            File srch = new File("D:\\srch2.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(srch);
            PrintWriter pw = new PrintWriter(srch);
            Integer sum = 0;
            for (square s : squaresarray) {
                sum += s.getSide();
            }
            Double average = (double)sum/squaresarray.size();
            pw.println(average.toString());
            pw.flush();
            pw.close();
        } catch (Exception e) {
            return false;
        }
        return true;
        }
    }

