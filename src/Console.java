public class Console extends Engine implements Game { //Klasa Console dziedziczy Engine oraz implementuje interfejs Game
    public void Play(){
        while(true)
        {

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
        Game.Show();
    }

}
