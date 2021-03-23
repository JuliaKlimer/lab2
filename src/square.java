public class square implements Comparable<square>{
    int side;
    int x0;
    int y0;
    public square (int side, int x0, int y0){
        this.side = side;
        this.x0 = x0;
        this.y0 = y0;
    }
    public int getSide(){return side;}
    public void setSide (int side) throws Exception {
        if (this.side <= 10){ this.side = side;
        }
        else {throw new Exception(("Error"));
        }
    }
    public int getX0(){return x0;}
    public void setX0 (int x0) throws Exception {
        if (this.x0 <= 5){this.x0 = x0;
        }
        else {throw new Exception(("Error"));
        }
    }
    public int getY0(){return y0;}
    public void setY0(int y0) throws Exception {
        if (this.y0 <= 5){ this.y0 = y0;
        }
        else {throw new Exception(("Error"));
        }
    }
    //task 1
    @Override
    public int compareTo(square s) {
        if (this.side == s.side){
            return 0;
        }
        else if (this.side < s.side){
            return -1;
        }
        else{
            return 1;
        }
    }
    //task 2
    @Override
    public String toString(){
        return "Square: " + side + ", " + "(" + x0 + "," + y0 + ")";
    }
    //task 3
    public int divideside (int div){
        this.side /= div;
        return this.getSide();
    }
    public int incrementX0 (){ return ++this.x0; }
    public int incrementY0 (){ return ++this.y0; }
}
