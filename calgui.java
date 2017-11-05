import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//https://www.javatpoint.com/notepad
//http://zetcode.com/tutorials/javaswingtutorial/firstprograms/
//https://stackoverflow.com/questions/20204437/im-trying-to-create-a-numeric-keypad-that-has-a-clear-button-and-a-piece-on-top


public class calgui extends JFrame{
	
	// class attributes
	String numberString = "";
	int but_x_base = 40;
	int but_y_pos = 40;
	int but_width = 60;
	int but_height = 40;
	JTextField txtf = new JTextField();
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton bEq = new JButton("=");
	JButton bAd = new JButton("+");
	JButton bMn = new JButton("-");	
	JButton bMp = new JButton("*");
	JButton bDv = new JButton("/");
	JButton bC = new JButton("C");
	JButton bDot = new JButton(".");
	
	// override constructor
	public calgui(){
		
		// This defines the JFrame
		JFrame f = new JFrame("Button Example");
		f.setSize(400,400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// defines objects on the JFrame
		txtf.setBounds(100, 40, 240, 20);
		b0.setBounds(but_x_base + 60,but_y_pos + 200,but_width +60,but_height);
		b1.setBounds(but_x_base + 60,but_y_pos + 160,but_width,but_height);
		b2.setBounds(but_x_base + 120,but_y_pos + 160,but_width,but_height);
		b3.setBounds(but_x_base + 180,but_y_pos + 160,but_width,but_height);
		b4.setBounds(but_x_base + 60,but_y_pos + 120,but_width,but_height);
		b5.setBounds(but_x_base + 120,but_y_pos + 120,but_width,but_height);
		b6.setBounds(but_x_base + 180,but_y_pos + 120,but_width,but_height);
		b7.setBounds(but_x_base + 60,but_y_pos + 80,but_width,but_height);
		b8.setBounds(but_x_base + 120,but_y_pos + 80,but_width,but_height);
		b9.setBounds(but_x_base + 180,but_y_pos + 80,but_width,but_height);
		bEq.setBounds(but_x_base + 240,but_y_pos + 160,but_width,but_height +40);
		bAd.setBounds(but_x_base + 240,but_y_pos + 80,but_width,but_height +40);
		bMn.setBounds(but_x_base + 240,but_y_pos + 40,but_width,but_height);
		bMp.setBounds(but_x_base + 180,but_y_pos + 40,but_width,but_height);
		bDv.setBounds(but_x_base + 120,but_y_pos + 40,but_width,but_height);
		bDot.setBounds(but_x_base + 180,but_y_pos + 200,but_width,but_height);	
		bC.setBounds(but_x_base + 60,but_y_pos + 40,but_width,but_height);			
		ButtonListener listener = new ButtonListener();


		// adds listeners to the buttons
		b0.addActionListener(listener);
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);		
		b7.addActionListener(listener);		
		b8.addActionListener(listener);		
		b9.addActionListener(listener);
		bEq.addActionListener(listener);
		bAd.addActionListener(listener);
		bMn.addActionListener(listener);
		bMp.addActionListener(listener);
		bDv.addActionListener(listener);
		bC.addActionListener(listener);
		bDot.addActionListener(listener);
		
		// adds the objects to the JFrame
		f.add(txtf);
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bEq);
		f.add(bAd);
		f.add(bMn);
		f.add(bMp);
		f.add(bDv);
		f.add(bC);
		f.add(bDot);
		
		// makes it visible
		f.setVisible(true);  
	}

	public static void main(String args[]) {
		// Creates the JFrame by calling the override constructor
		new calgui();
	}

	// this is a class method that is called each time a button
	// with a listener is pressed
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b0) {
				numberString += "0";
				txtf.setText(numberString);
			} else if (e.getSource() == b1) {
				numberString += "1";
				txtf.setText(numberString);
			} else if (e.getSource() == b2) {
				numberString += "2";
				txtf.setText(numberString);
			} else if (e.getSource() == b3) {
				numberString += "3";
				txtf.setText(numberString);
			} else if (e.getSource() == b4) {
				numberString += "4";
				txtf.setText(numberString);
			} else if (e.getSource() == b5) {
				numberString += "5";
				txtf.setText(numberString);
			} else if (e.getSource() == b6) {
				numberString += "6";
				txtf.setText(numberString);
			} else if (e.getSource() == b7) {
				numberString += "7";
				txtf.setText(numberString);
			} else if (e.getSource() == b8) {
				numberString += "8";
				txtf.setText(numberString);
			} else if (e.getSource() == b9) {
				numberString += "9";
				txtf.setText(numberString);
			} else if (e.getSource() == bEq) {
				numberString += " = ";
				txtf.setText(numberString);
			} else if (e.getSource() == bAd) {
				numberString += " + ";
				txtf.setText(numberString);
			} else if (e.getSource() == bMn) {
				numberString += " - ";
				txtf.setText(numberString);
			} else if (e.getSource() == bMp) {
				numberString += " * ";
				txtf.setText(numberString);
			} else if (e.getSource() == bDv) {
				numberString += " / ";
				txtf.setText(numberString);
			} else if (e.getSource() == bC) {
				numberString += "";
				txtf.setText("");
			} else if (e.getSource() == bDot) {
				numberString += ".";
				txtf.setText(numberString);
			}
		}
	}
}