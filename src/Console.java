import java.io.IOException;
import java.util.Scanner;

public class Console extends Engine implements Game { //Klasa Console dziedziczy Engine oraz implementuje interfejs Game
    public void Play(){
        while(true) {
            Show();
            arrows();
            generateRandomSquares();
        }
    }
    public void Show(){
        for(int x=0; x<4; x++){
            for(int y=0; y<4; y++){
                System.out.printf(" %d", board[x][y].getValue());
            }
            System.out.printf("%n");
        }
    }

    public int readKeyboardInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    public void arrows(){
        int input = readKeyboardInput();
        switch (input) {
            case 4 -> moveLeft();
            case 6 -> moveRight();
            case 8 -> moveUp();
            case 5 -> moveDown();
        }
    }




}
