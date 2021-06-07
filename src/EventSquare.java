public class EventSquare extends Square{

    final protected int value = 105; //ASCII E
    @Override
    protected int getValue() {
        return 0;
    }

    @Override
    protected void setValue(int v) {

    }


    public enum EventType {
        DOUBLE, HALF, RANDOM_MOVE
    }

}
