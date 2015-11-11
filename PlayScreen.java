
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class PlayScreen {
	ActionListener normalPlay;
	ActionListener checker;
	Board board;
	ArrayList<Integer> tracker = new ArrayList<Integer>();
	JTextField[] fields = new JTextField[81];
	JPanel p = new JPanel();
	public JButton btnPlayAgain;
	public JButton btnCheckAnswer;
	public JTextField textField_0;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_10;
	public JTextField textField_11;
	public JTextField textField_12;
	public JTextField textField_13;
	public JTextField textField_15;
	public JTextField textField_16;
	public JTextField textField_17;
	public JTextField textField_18;
	public JTextField textField_19;
	public JTextField textField_20;
	public JTextField textField_21;
	public JTextField textField_22;
	public JTextField textField_23;
	public JTextField textField_24;
	public JTextField textField_25;
	public JTextField textField_26;
	public JTextField textField_27;
	public JTextField textField_28;
	public JTextField textField_29;
	public JTextField textField_30;
	public JTextField textField_31;
	public JTextField textField_32;
	public JTextField textField_33;
	public JTextField textField_34;
	public JTextField textField_35;
	public JTextField textField_36;
	public JTextField textField_37;
	public JTextField textField_38;
	public JTextField textField_39;
	public JTextField textField_40;
	public JTextField textField_41;
	public JTextField textField_43;
	public JTextField textField_44;
	public JTextField textField_45;
	public JTextField textField_46;
	public JTextField textField_47;
	public JTextField textField_48;
	public JTextField textField_49;
	public JTextField textField_50;
	public JTextField textField_51;
	public JTextField textField_52;
	public JTextField textField_53;
	public JTextField textField_54;
	public JTextField textField_55;
	public JTextField textField_56;
	public JTextField textField_57;
	public JTextField textField_58;
	public JTextField textField_59;
	public JTextField textField_60;
	public JTextField textField_61;
	public JTextField textField_62;
	public JTextField textField_63;
	public JTextField textField_64;
	public JTextField textField_65;
	public JTextField textField_66;
	public JTextField textField_67;
	public JTextField textField_68;
	public JTextField textField_69;
	public JTextField textField_71;
	public JTextField textField_72;
	public JTextField textField_73;
	public JTextField textField_74;
	public JTextField textField_75;
	public JTextField textField_76;
	public JTextField textField_77;
	public JTextField textField_78;
	public JTextField textField_79;
	public JTextField textField_80;
	public JTextField textField_42;
	public JTextField textField_14;
	public JTextField textField_70;
	public JLabel lblCorrect;
	public JLabel lblWrong;
	int currDiff;

	PlayScreen(){
		p.setLayout(null);
		p.setSize(690,590);
		
		textField_0 = new JTextField();
		textField_0.setBounds(209, 87, 17, 20);
		p.add(textField_0);
		textField_0.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(232, 87, 17, 20);
		p.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(255, 87, 17, 20);
		p.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(299, 87, 17, 20);
		p.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(322, 87, 17, 20);
		p.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(345, 87, 17, 20);
		p.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(389, 87, 17, 20);
		p.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(412, 87, 17, 20);
		p.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(435, 87, 17, 20);
		p.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(209, 110, 17, 20);
		p.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(232, 110, 17, 20);
		p.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(255, 110, 17, 20);
		p.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(299, 110, 17, 20);
		p.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(322, 110, 17, 20);
		p.add(textField_13);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(389, 110, 17, 20);
		p.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(412, 110, 17, 20);
		p.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(435, 110, 17, 20);
		p.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(209, 133, 17, 20);
		p.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(232, 133, 17, 20);
		p.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(255, 133, 17, 20);
		p.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(299, 133, 17, 20);
		p.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(322, 133, 17, 20);
		p.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(345, 133, 17, 20);
		p.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(389, 133, 17, 20);
		p.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(412, 133, 17, 20);
		p.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(435, 133, 17, 20);
		p.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(412, 294, 17, 20);
		p.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(209, 167, 17, 20);
		p.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(232, 167, 17, 20);
		p.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(255, 167, 17, 20);
		p.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(299, 167, 17, 20);
		p.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(322, 167, 17, 20);
		p.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(345, 167, 17, 20);
		p.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(389, 167, 17, 20);
		p.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(412, 167, 17, 20);
		p.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(435, 167, 17, 20);
		p.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(209, 190, 17, 20);
		p.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(232, 190, 17, 20);
		p.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(255, 190, 17, 20);
		p.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(299, 190, 17, 20);
		p.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(322, 190, 17, 20);
		p.add(textField_41);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(389, 190, 17, 20);
		p.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(412, 190, 17, 20);
		p.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(435, 190, 17, 20);
		p.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(345, 190, 17, 20);
		p.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(209, 213, 17, 20);
		p.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(232, 213, 17, 20);
		p.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(255, 213, 17, 20);
		p.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(299, 213, 17, 20);
		p.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(322, 213, 17, 20);
		p.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(345, 213, 17, 20);
		p.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(389, 213, 17, 20);
		p.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(412, 213, 17, 20);
		p.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(435, 213, 17, 20);
		p.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(209, 248, 17, 20);
		p.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(232, 248, 17, 20);
		p.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(255, 248, 17, 20);
		p.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(299, 248, 17, 20);
		p.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(322, 248, 17, 20);
		p.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(345, 248, 17, 20);
		p.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(389, 248, 17, 20);
		p.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(412, 248, 17, 20);
		p.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(435, 248, 17, 20);
		p.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(209, 271, 17, 20);
		p.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(232, 271, 17, 20);
		p.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(255, 271, 17, 20);
		p.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(299, 271, 17, 20);
		p.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(322, 271, 17, 20);
		p.add(textField_69);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(389, 271, 17, 20);
		p.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(412, 271, 17, 20);
		p.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(435, 271, 17, 20);
		p.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(345, 271, 17, 20);
		p.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(209, 294, 17, 20);
		p.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(232, 294, 17, 20);
		p.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(255, 294, 17, 20);
		p.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(299, 294, 17, 20);
		p.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(322, 294, 17, 20);
		p.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(345, 294, 17, 20);
		p.add(textField_80);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(389, 294, 17, 20);
		p.add(textField_42);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(345, 110, 17, 20);
		p.add(textField_14);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(435, 294, 17, 20);
		p.add(textField_70);
		
		btnCheckAnswer = new JButton("Check Answer");
		btnCheckAnswer.addActionListener(checker = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        for(int i = 0; i<tracker.size(); i++){
		            board.puzzle[(int) tracker.get(i)/9][(int) tracker.get(i)%9] = Integer.parseInt(fields[(int) tracker.get(i)].getText());
		        }
		        if(board.checkAnswer()){
		            lblCorrect.setVisible(true);
		            btnPlayAgain.setEnabled(true);
		            Sudoku.frame.getContentPane().repaint();
		        }
		        else{
		            lblWrong.setVisible(true);
		            Sudoku.frame.getContentPane().repaint();
		        }
			}
		});
		btnCheckAnswer.setBounds(242, 334, 179, 29);
		p.add(btnCheckAnswer);
	
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu main = new MainMenu();
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(main.p, BorderLayout.CENTER);
			}
		});
		btnMainMenu.setBounds(546, 530, 115, 29);
		p.add(btnMainMenu);
		
		btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.addActionListener(normalPlay = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayScreen play = new PlayScreen();
				Sudoku.frame.getContentPane().removeAll();
				Sudoku.frame.getContentPane().repaint();
				Sudoku.frame.getContentPane().add(play.p, BorderLayout.CENTER);
				play.play(currDiff);
		}});
		btnPlayAgain.setEnabled(false);
		btnPlayAgain.setBounds(33, 530, 115, 29);
		p.add(btnPlayAgain);
		
		lblCorrect = new JLabel("Correct!");
		lblCorrect.setBounds(247, 379, 69, 20);
		lblCorrect.setVisible(false);
		p.add(lblCorrect);
		
		lblWrong = new JLabel("Wrong!");
		lblWrong.setBounds(360, 379, 69, 20);
		lblWrong.setVisible(false);
		p.add(lblWrong);
	}
	
	public void play(int diff){
		currDiff = diff;
		board = new Board(diff);
		int idx = 0;
		fields[idx++] = textField_0;
		fields[idx++] = textField_1;
		fields[idx++] = textField_2;
		fields[idx++] = textField_3;
		fields[idx++] = textField_4;
		fields[idx++] = textField_5;
		fields[idx++] = textField_6;
		fields[idx++] = textField_7;
		fields[idx++] = textField_8;
		fields[idx++] = textField_9;
		fields[idx++] = textField_10;
		fields[idx++] = textField_11;
		fields[idx++] = textField_12;
		fields[idx++] = textField_13;
		fields[idx++] = textField_14;
		fields[idx++] = textField_15;
		fields[idx++] = textField_16;
		fields[idx++] = textField_17;
		fields[idx++] = textField_18;
		fields[idx++] = textField_19;
		fields[idx++] = textField_20;
		fields[idx++] = textField_21;
		fields[idx++] = textField_22;
		fields[idx++] = textField_23;
		fields[idx++] = textField_24;
		fields[idx++] = textField_25;
		fields[idx++] = textField_26;
		fields[idx++] = textField_28;
		fields[idx++] = textField_29;
		fields[idx++] = textField_30;
		fields[idx++] = textField_31;
		fields[idx++] = textField_32;
		fields[idx++] = textField_33;
		fields[idx++] = textField_34;
		fields[idx++] = textField_35;
		fields[idx++] = textField_36;
		fields[idx++] = textField_37;
		fields[idx++] = textField_38;
		fields[idx++] = textField_39;
		fields[idx++] = textField_40;
		fields[idx++] = textField_41;
		fields[idx++] = textField_46;
		fields[idx++] = textField_43;
		fields[idx++] = textField_44;
		fields[idx++] = textField_45;
		fields[idx++] = textField_47;
		fields[idx++] = textField_48;
		fields[idx++] = textField_49;
		fields[idx++] = textField_50;
		fields[idx++] = textField_51;
		fields[idx++] = textField_52;
		fields[idx++] = textField_53;
		fields[idx++] = textField_54;
		fields[idx++] = textField_55;
		fields[idx++] = textField_56;
		fields[idx++] = textField_57;
		fields[idx++] = textField_58;
		fields[idx++] = textField_59;
		fields[idx++] = textField_60;
		fields[idx++] = textField_61;
		fields[idx++] = textField_62;
		fields[idx++] = textField_63;
		fields[idx++] = textField_64;
		fields[idx++] = textField_65;
		fields[idx++] = textField_66;
		fields[idx++] = textField_67;
		fields[idx++] = textField_68;
		fields[idx++] = textField_69;
		fields[idx++] = textField_74;
		fields[idx++] = textField_71;
		fields[idx++] = textField_72;
		fields[idx++] = textField_73;
		fields[idx++] = textField_75;
		fields[idx++] = textField_76;
		fields[idx++] = textField_77;
		fields[idx++] = textField_78;
		fields[idx++] = textField_79;
		fields[idx++] = textField_80;
		fields[idx++] = textField_42;
		fields[idx++] = textField_27;
		fields[idx++] = textField_70;
		idx = 0;
		for(int i=0; i<9; i++){
            for(int k=0; k<9; k++){
                if(board.puzzle[i][k] == 0){
                    tracker.add(idx);
                    fields[idx++].setText("");
                }
                else{
                fields[idx].setText(Integer.toString(board.puzzle[i][k]));
                fields[idx++].setEditable(false);
                }
            }
        }
		Sudoku.frame.getContentPane().repaint();
	}
}
