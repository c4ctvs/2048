abstract public class Square {

    abstract protected int getValue();
    abstract protected void setValue(int v);
    abstract protected Type getType();


    public enum Type {
        DOUBLE, HALF, VALUE, BLOCK
    }
}
