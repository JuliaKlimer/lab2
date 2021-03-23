import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class squares {
    public ArrayList<square> squaresArray;
    public squares() {
        squaresArray = new ArrayList<>();
    }
    public squares(square s) {
        squaresArray = new ArrayList<>();
        squaresArray.add(s);
    }
    public void addSquare(square s) {
        if (s != null) squaresArray.add(s);
    }
    public boolean saveToFile() throws IOException {
        try {
            File fw = new File("D:\\output.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(fw);
            PrintWriter pw = new PrintWriter(fw);
            for (square s : this.squaresArray) {
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
    public boolean searchZero() throws IOException {
        try {
            File srch = new File("D:\\srch.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(srch);
            PrintWriter pw = new PrintWriter(srch);
            for (square s : squaresArray) {
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
    public boolean searchMinSide() {
        try {
            File srch = new File("D:\\srch1.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(srch);
            PrintWriter pw = new PrintWriter(srch);
            Integer min = Integer.MAX_VALUE;
            for (square s : squaresArray) {
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
    public boolean calculateAverageSide (){
        try {
            File srch = new File("D:\\srch2.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(srch);
            PrintWriter pw = new PrintWriter(srch);
            Integer sum = 0;
            for (square s : squaresArray) {
                sum += s.getSide();
            }
            Double average = (double)sum/squaresArray.size();
            pw.println(average.toString());
            pw.flush();
            pw.close();
        } catch (Exception e) {
            return false;
        }
        return true;
        }
    }

