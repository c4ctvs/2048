import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Engine {
    protected Square[][] board;         //Tablica przechowujaca kwadraty
    protected Square[][] tempBoard;     //Tablica zastepcza w ktorej bedziemy dokonywac zmiany
    Random generator = new Random();

    Engine(){
        board = new Square[4][4];
        tempBoard = new Square[4][4];
        fillTable();                    // wypelniam tablice pustymi kwadratami
        Start();
    }

    void fillTable(){
        for(int x=0; x<4; x++){
            for(int y=0; y<4; y++){
                this.board[x][y] = new Square();
                this.tempBoard[x][y] = new Square();
            }
        }
    }
    void fill(int x, int y, int v){
        this.board[x][y].setValue(v);
    }

    void Start(){
        for(int i = 0; i<2; i++)
        {
            fill(generator.nextInt(4), generator.nextInt(4), 2);
        }

    }
    public class Arrows implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int arrow = e.getKeyCode();
            System.out.println(arrow);
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

}

