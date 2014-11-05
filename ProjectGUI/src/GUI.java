/*Elohe Yonas
 * csc200
 * Assignment 5
 * 
 */
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener {
	/*have GUI class use Jframe options 
	 * 
	 */
	
	JTextField [] jtxtScore = new JTextField[4];
	JTextField [] jtxtWeight = new JTextField[4];
	JButton jbtnCalScore = new JButton("Calcuate Score");
	JPanel jpanelScore = new JPanel(); 
	JTextField jtxtDisplay = new JTextField();
	/*
	 * implement text panels and has placeholders for weight and score.
	 */
	
	int [] score = new int [4];
	double [] weight = new double [4];
	public GUI() {
		for(int i=0; i<jtxtScore.length; i++) {
			jtxtScore[i] = new JTextField(6);
			jtxtWeight[i] = new JTextField(6);
			jpanelScore.add(jtxtScore[i]);
			jpanelScore.add(jtxtWeight[i]);
		}
		/*
		 * set I in JText to input numbers.
		 */
		jbtnCalScore.addActionListener(this);
		add(jtxtDisplay, BorderLayout.NORTH);
		add(jpanelScore);
		add(jbtnCalScore, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		/*seperate display and and calscore to north and south borders
		 * setting the display to being visible
		 */
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		for(int i=0; i<score.length; i++) {
			score[i] = Integer.parseInt(jtxtScore[i].getText());
			weight[i] = Double.parseDouble(jtxtWeight[i].getText());
		}
		jtxtDisplay.setText(Calculate.calscore(score, weight)+"");
		/*
		 * have txtdisplay output the results
		 */
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculate();
	}
/*
 * implement GUI into Class Calculate
 */
}