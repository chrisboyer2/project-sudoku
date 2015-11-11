

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModeMenu {
	JPanel p = new JPanel();
	
	ModeMenu(){
		p.setLayout(null);
		p.setSize(690,590);
		
		JButton normalButton = new JButton("Normal");
		normalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DifficultyMenu diff = new DifficultyMenu(false);
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(diff.p, BorderLayout.CENTER);
			}
		});
		normalButton.setBounds(286, 230, 171, 23);
		p.add(normalButton);
		
		JButton marathonButton = new JButton("Marathon Mode");
		marathonButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayScreen play = new MarathonScreen(0);
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(play.p, BorderLayout.CENTER);
				play.play(1);
			}
		});
		marathonButton.setBounds(286, 263, 169, 23);
		p.add(marathonButton);
		
		JButton timeAttackButton = new JButton("Time Attack");
		timeAttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DifficultyMenu diff = new DifficultyMenu(true);
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(diff.p, BorderLayout.CENTER);
			}
		});
		timeAttackButton.setBounds(288, 295, 169, 23);
		p.add(timeAttackButton);
		
	}
}
