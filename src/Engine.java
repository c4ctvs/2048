import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Engine  {
    protected Square[][] board;         //Tablica przechowujaca kwadraty
    Random generator = new Random();

    Engine(){
        board = new Square[4][4];
        fillTable();                    // wypelniam tablice pustymi kwadratami
        Start();

    }

    void fillTable(){
        for(int x=0; x<4; x++){
            for(int y=0; y<4; y++){
                this.board[x][y] = new Square();
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

    void moveLeft(){
        for(int x=0; x<4; x++)
        {
            for(int y=0; y<4; y++)
            {
                if(board[x][y].getValue() != 0)
                {
                    if(y-1 >= 0) {
                        if (board[x][y-1].getValue() == 0) {
                            board[x][y-1].setValue(board[x][y].getValue());
                            board[x][y].setValue(0);
                            moveLeft();
                        }

                    else if(board[x][y-1].getValue() == board[x][y].getValue())
                    {
                        board[x][y-1].setValue(board[x][y].getValue() + board[x][y-1].getValue());
                        board[x][y].setValue(0);

                    }
                    }

                }
            }
        }
    }
    void moveRight(){
        for(int x=0; x<4; x++)
        {
            for(int y=0; y<4; y++)
            {
                if(board[x][y].getValue() != 0)
                {
                    if(y+1 <= 3) {
                        if(board[x][y+1].getValue() == 0){
                            board[x][y+1].setValue(board[x][y].getValue());
                            board[x][y].setValue(0);
                            moveRight();
                        }
                        else if(board[x][y+1].getValue() == board[x][y].getValue())
                        {
                            board[x][y+1].setValue(board[x][y].getValue() + board[x][y+1].getValue());
                            board[x][y].setValue(0);

                        }
                    }

                }
            }
        }
    }
    void moveUp() {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (board[x][y].getValue() != 0) {
                    if (x - 1 >= 0) {
                        if (board[x - 1][y].getValue() == 0)
                        {
                            board[x - 1][y].setValue(board[x][y].getValue());
                            board[x][y].setValue(0);
                            moveUp();
                        } else if (board[x - 1][y].getValue() == board[x][y].getValue())
                        {
                            board[x - 1][y].setValue(board[x][y].getValue() + board[x-1][y].getValue());
                            board[x][y].setValue(0);

                        }
                    }
                }
            }
        }
    }
    void moveDown(){
        for(int x=0; x<4; x++)
        {
            for(int y=0; y<4; y++)
            {
                if(board[x][y].getValue() != 0)
                {
                    if(x+1 <= 3) {
                        if (board[x+1][y].getValue() == 0) {
                            board[x + 1][y].setValue(board[x][y].getValue());
                            board[x][y].setValue(0);
                            moveDown();
                        }
                       else if(board[x+1][y].getValue() == board[x][y].getValue())
                        {
                            board[x+1][y].setValue(board[x][y].getValue() + board[x+1][y].getValue());
                            board[x][y].setValue(0);

                        }
                    }
                }
            }
        }
    }

    void generateRandomSquares()
    {
        for(int i = 0; i<2; i++)
        {
            int x = generator.nextInt(4);
            int y = generator.nextInt(4);
            if(board[x][y].getValue() == 0)
                fill(x, y, 2);
        }
    }




}

