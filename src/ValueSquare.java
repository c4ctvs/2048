public class ValueSquare extends Square{
    protected int value;


    public ValueSquare(){
        this.value = 0;
    }
    public ValueSquare(int value_){
        this.value = value_;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }
}
