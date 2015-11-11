import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;


public class TAttackScreen extends PlayScreen {
	JLabel lblTime;
	JLabel lblTimeOut;
	Timer timer;
	int mins = 10;
	int secs = 0;
	
	public TAttackScreen(){
		super();
		int delay = 1000;
		int period = 1000;
		timer = new Timer();
		lblTime = new JLabel(Integer.toString(mins) + ":0" + Integer.toString(secs));
		lblTime.setBounds(315, 16, 263, 20);
		p.add(lblTime);
		timer.scheduleAtFixedRate(new TimerTask(){
			public void run(){
				lblTime.setText(setTime());
				Sudoku.frame.getContentPane().repaint();
			}
		}, delay, period);
		lblTimeOut = new JLabel("Times Up!");
		lblTimeOut.setBounds(300, 379, 69, 20);
		lblTimeOut.setVisible(false);
		p.add(lblTimeOut);
		
		btnPlayAgain.removeActionListener(normalPlay);
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAttackScreen play = new TAttackScreen();
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(play.p, BorderLayout.CENTER);
				play.play(currDiff);
		}});
		
		btnCheckAnswer.removeActionListener(checker);
		btnCheckAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        for(int i = 0; i<tracker.size(); i++){
		            board.puzzle[(int) tracker.get(i)/9][(int) tracker.get(i)%9] = Integer.parseInt(fields[(int) tracker.get(i)].getText());
		        }
		        if(board.checkAnswer()){
		            lblCorrect.setVisible(true);
		            btnPlayAgain.setEnabled(true);
		            timer.cancel();
		            Sudoku.frame.getContentPane().repaint();
		        }
		        else{
		            lblWrong.setVisible(true);
		            Sudoku.frame.getContentPane().repaint();
		        }
			}
		});
		
	}
	
	public String setTime(){
		if(mins == 0 && secs == 0){
			timer.cancel();
			int idx = 0;
			for(int i=0; i<9; i++){
	            for(int k=0; k<9; k++){
	                fields[idx++].setEditable(false);
	                }
	            }
			lblTimeOut.setVisible(true);
			btnPlayAgain.setEnabled(true);
			return "0:00";
	        }
		if(secs != 0 && secs > 10){
			secs--;
			return (Integer.toString(mins) + ":" + Integer.toString(secs));
		}
		else if(secs != 0){
			secs--;
			return (Integer.toString(mins) + ":0" + Integer.toString(secs));
		}
		else{
			mins--;
			secs = 59;
			return (Integer.toString(mins) + ":" + Integer.toString(secs));
		}
	}

}
