
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class DifficultyMenu {
	JPanel p = new JPanel();
	
	DifficultyMenu(){
		p.setLayout(null);
		p.setSize(690,590);
		
		JButton easyButton = new JButton("Easy");
		easyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayScreen play = new PlayScreen();
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(play.p, BorderLayout.CENTER);
				play.play(15);
			}
		});
		easyButton.setBounds(282, 195, 89, 23);
		p.add(easyButton);
		
		JButton mediumButton = new JButton("Medium");
		mediumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayScreen play = new PlayScreen();
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(play.p, BorderLayout.CENTER);
				play.play(25);
			}
		});
		mediumButton.setBounds(282, 221, 89, 23);
		p.add(mediumButton);
		
		JButton hardButton = new JButton("Hard");
		hardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayScreen play = new PlayScreen();
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(play.p, BorderLayout.CENTER);
				play.play(35);
			}
		});
		hardButton.setBounds(281, 248, 89, 23);
		p.add(hardButton);
		
		JButton expertButton = new JButton("Expert");
		expertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayScreen play = new PlayScreen();
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(play.p, BorderLayout.CENTER);
				play.play(45);
			}
		});
		expertButton.setBounds(282, 275, 89, 23);
		p.add(expertButton);
		
		
	}
	
}
