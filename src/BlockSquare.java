public class BlockSquare extends Square{

    final Type squareType = Type.BLOCK;

    final protected int value = -1;

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
    }

    @Override
    protected Type getType() {
        return squareType;
    }
}
