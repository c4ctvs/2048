import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GUIGame extends Game{
    GUI gui;
    public void Show(){
        gui = new GUI();
    }

public class GUI extends JFrame{
    int spacing = 5;
    GUI(){
        this.setTitle("2048");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board boardG = new Board();
        this.setContentPane(boardG);
        Arrows arrows = new Arrows();
        this.addKeyListener(arrows);
    }



    public class Board extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(0, 0, 600, 600);
            g.setColor(Color.decode("#EDC691"));
            g.setFont(new Font("Calibri", Font.BOLD, 30));

            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    switch (board[x][y].getValue()) {
                        case 0 -> fillColor(g, "#EDC691", x, y);
                        case 2 -> fillColor(g, "#EBBA78", x, y);
                        case 4 -> fillColor(g, "#EBAA52", x, y);
                        case 8 -> fillColor(g, "#E89f3C", x, y);
                        case 16 -> fillColor(g, "#E69155", x, y);
                        case 32 -> fillColor(g, "#E8823A", x, y);
                        case 64 -> fillColor(g, "#FFBF47", x, y);
                        case 128 -> fillColor(g, "#ffb324", x, y);
                        case 256 -> fillColor(g, "#ffb04f", x, y);
                        case 512 -> fillColor(g, "#ff8e3d", x, y);
                        case 1024 -> fillColor(g, "#ffd04f", x, y);
                        case 2048 -> fillColor(g, "#fcba05", x, y);
                    }
                   if(board[x][y].getValue() != 0)
                   {
                       writeValue(g, x, y);
                   }

                }
            }
            repaint();
        }

        void fillColor(Graphics g, String color, int x, int y)
        {
            g.setColor(Color.decode(color));
            g.fillRect((spacing + 3 * x) * 25, (spacing + 3 * y) * 25, 80 - 2 * spacing, 80 - 2 * spacing);
        }
        void writeValue(Graphics g, int x, int y)
        {
            g.setColor(Color.BLACK);
            g.drawString(Integer.toString(board[x][y].getValue()), x*80 + 140, y*80 + 80 +80);
        }


    }
}


public class Arrows implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            switch (key) {
                case KeyEvent.VK_LEFT -> moveUp();
                case KeyEvent.VK_RIGHT -> moveDown();
                case KeyEvent.VK_UP -> moveLeft();
                case KeyEvent.VK_DOWN -> moveRight();
            }
            generateRandomSquares();

        }

        @Override
        public void keyTyped(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    }
}
