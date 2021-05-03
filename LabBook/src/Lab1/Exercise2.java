package Lab1;

import javax.swing.*;
import java.awt.event.*;

class Demo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JRadioButton jRadioButton1;

	JRadioButton jRadioButton2;

	JRadioButton jRadioButton3;

	JButton jButton;

	ButtonGroup G1;

	JLabel L1;

	public Demo() {

		this.setLayout(null);

		jRadioButton1 = new JRadioButton();

		jRadioButton2 = new JRadioButton();

		jRadioButton3 = new JRadioButton();

		jButton = new JButton("Click");

		G1 = new ButtonGroup();


		L1 = new JLabel("Traffic Light");

		jRadioButton1.setText("Red");

		
		jRadioButton2.setText("Yellow");

		jRadioButton3.setText("Green");
		
		jRadioButton1.setBounds(100, 30, 100, 50);

		jRadioButton2.setBounds(200, 30, 80, 50);

		jRadioButton3.setBounds(300, 30, 600, 50);
		
		jButton.setBounds(125, 90, 80, 30);

		L1.setBounds(20, 30, 150, 50);

		this.add(jRadioButton1);

		this.add(jRadioButton2);

		this.add(jRadioButton3);
		
		this.add(jButton);

		
		this.add(L1);

		
		G1.add(jRadioButton1);
		G1.add(jRadioButton2);
		G1.add(jRadioButton3);

		jButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String qual = " ";

				
				if (jRadioButton1.isSelected()) {

					qual = "Stop";
				}

				else if (jRadioButton2.isSelected()) {

					qual = "Ready";
				} 
				else if (jRadioButton3.isSelected()) {

					qual = "Go";
				} else {

					qual = "NO Button selected";
				}

				JOptionPane.showMessageDialog(Demo.this, qual);
			}
		});
	}
}

public class Exercise2 {

	public static void main(String args[]) { 
		Demo f = new Demo();

		f.setBounds(100, 100, 400, 200);

		f.setTitle("Traffic Lights");

		f.setVisible(true);
	}
}