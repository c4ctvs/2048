public class Square {
    private int value;

    public Square(){
        this.value = 0;
    }
    public Square(int value_){
        this.value = value_;
    }

    protected int getValue(){ return this.value; }
    protected void setValue(int v){ this.value = v;}

}
