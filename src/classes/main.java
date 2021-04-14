package classes;

import javax.swing.JFrame;

/**
 *
 * @author ChrisForc
 */
public class main {
    public static void main(String[] args) throws InterruptedException {
        
        JFrame jFrame = new JFrame("DragonBoy & AxolotlGirl");
        Game game = new Game();
        jFrame.add(game);
	jFrame.setSize(780, 1400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
    }
}
