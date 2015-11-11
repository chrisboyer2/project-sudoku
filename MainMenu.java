
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MainMenu {
	JPanel p = new JPanel();
	
	MainMenu(){
		p.setLayout(null);
		p.setSize(690,590);
		
		JLabel title = new JLabel("Project Sudoku");
		title.setBounds(313, 180, 90, 14);
		p.add(title);
		
		JLabel version = new JLabel("v0.2");
		version.setBounds(632, 548, 25, 14);
		p.add(version);
		
		JButton playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModeMenu mode = new ModeMenu();
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(mode.p, BorderLayout.CENTER);
			}
		});
		playButton.setBounds(305, 206, 90, 23);
		p.add(playButton);
		
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		quitButton.setBounds(305, 242, 90, 23);
		p.add(quitButton);
	}
}
