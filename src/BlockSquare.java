public class BlockSquare extends Square{

    final protected int value = 102; //ASCII B

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        System.out.println("Error, value of block square is final");
    }

}
