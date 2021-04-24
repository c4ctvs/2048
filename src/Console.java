import java.io.IOException;

public class Console extends Engine implements Game { //Klasa Console dziedziczy Engine oraz implementuje interfejs Game
    public void Play(){
        int input;
        Arrows x = new Arrows();
        while(true)
        {
            Show();
           // x.keyPressed(KeyEc);

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

    public static void main(String args[]){
        Console Game = new Console();
        Game.Play();
    }

}
