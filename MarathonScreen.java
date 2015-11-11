

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MarathonScreen extends PlayScreen {
	
	public int counter;
	
	public MarathonScreen(int count) {
		super();
		counter = count;
		btnCheckAnswer.setVisible(false);
		JButton btnCheckAnswer = new JButton("Check Answer");
		btnCheckAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        for(int i = 0; i<tracker.size(); i++){
		            board.puzzle[(int) tracker.get(i)/9][(int) tracker.get(i)%9] = Integer.parseInt(fields[(int) tracker.get(i)].getText());
		        }
		        if(board.checkAnswer()){
		            lblCorrect.setVisible(true);
		            if(counter < 50){
		            	counter++;
		            }
		            MarathonScreen play = new MarathonScreen(counter);
					Sudoku.frame.getContentPane().removeAll();
					Sudoku.frame.getContentPane().repaint();
					Sudoku.frame.getContentPane().add(play.p, BorderLayout.CENTER);
					play.play(counter + 1);
		        }
		        else{
		            lblWrong.setVisible(true);
		            Sudoku.frame.getContentPane().repaint();
		        }
			}
		});
		btnCheckAnswer.setBounds(242, 334, 179, 29);
		p.add(btnCheckAnswer);
		
		btnPlayAgain.setVisible(false);
		JLabel lblCount = new JLabel("Puzzles Completed: " + Integer.toString(counter));
		lblCount.setBounds(265, 16, 263, 20);
		p.add(lblCount);
	}

}
