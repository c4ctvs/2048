
import java.util.Random;

public class EventSquare extends Square{
    Type squareType = Type.VALUE;

    final protected int value = -2; //ASCII E

    public EventSquare(){
        Random generator = new Random();
        int nr = generator.nextInt(2);
        squareType = Type.values()[nr];
    }

    public EventSquare(Square x){
        Random generator = new Random();
        int nr = generator.nextInt(3);
        squareType = Type.values()[nr];
    }


    @Override
    protected int getValue() {
        return value;
    }

    @Override
    protected void setValue(int v) {
        System.out.println(squareType);
    }

    @Override
    protected Type getType() {
        return squareType;
    }

}
