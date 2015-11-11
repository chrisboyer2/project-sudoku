import java.awt.BorderLayout;
import javax.swing.JFrame;
public class Sudoku {
	static JFrame frame = new JFrame("Sudoku");
	int curDiff;

    public static void main(String[] args) {
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(700,600);
    	frame.setResizable(false);
    	frame.setVisible(true);
    	frame.setLayout(null);
    	MainMenu main = new MainMenu();
    	frame.getContentPane().add(main.p, BorderLayout.CENTER);
    	frame.getContentPane().repaint();
    }
    
}
