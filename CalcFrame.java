import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame implements ActionListener {
		
		final int FRAME_WIDTH = 340;
		final int FRAME_HEIGHT = 150;
			
			JLabel heading;
			JLabel heading2;
			JLabel spacing;
			JTextField numField1;
			JTextField numField2;
			JButton button1;// x
			JButton button2;// -
			JButton button3;// /
			JButton button4;// +
			
			public CalcFrame() {
				super("Calculator");
				setSize(FRAME_WIDTH, FRAME_HEIGHT);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setLocationRelativeTo(null);
				setLayout(new FlowLayout());
				
				heading = new JLabel("Calculator Application");
				heading.setFont(new Font("Arial", Font.BOLD, 20));
				
				heading2 = new JLabel("       ");
				heading2.setFont(new Font("Arial", Font.BOLD, 16));
				
				spacing = new JLabel("            ");
				spacing.setFont(new Font("Arial", Font.BOLD, 16));
				
				numField1 = new JTextField(12);
				numField1.setFont(new Font("Arial", Font.BOLD, 12));
				
				numField2 = new JTextField(12);
				numField2.setFont(new Font("Arial", Font.BOLD, 12));
				
				button1 = new JButton("X");
				button1.setFont(new Font("Arial", Font.BOLD, 12));
				
				button2 = new JButton("-");
				button2.setFont(new Font("Arial", Font.BOLD, 12));
				
				button3 = new JButton("/");
				button3.setFont(new Font("Arial", Font.BOLD, 12));
				
				button4 = new JButton("+");
				button4.setFont(new Font("Arial", Font.BOLD, 12));
				
				add(heading);
				add(numField1);
				add(numField2);
				add(button1);
				add(button2);
				add(button3);
				add(button4);
				add(heading2);
				
				button1.addActionListener(this);
				button2.addActionListener(this);
				button3.addActionListener(this);
				button4.addActionListener(this);
				numField1.addActionListener(this);
				numField2.addActionListener(this);
				numField1.setToolTipText("Press Enter for pow 2");
				numField2.setToolTipText("Press Enter for sqrt");
			}
				
				@Override 
				public void actionPerformed(ActionEvent e) {
					Object source = e.getSource();
					String numString;
					double num1;
					double num2;
					double mult;
					double sub;
					double div;
					double add;
					double pow;
					double rad;
					
					
					try {
					numString = numField1.getText();
					num1 = Double.parseDouble(numString);
					} catch (Exception ex)
					{
						numField1.setText("0");
						numString = numField1.getText();
						num1 = Double.parseDouble(numString);
					}
					try {
						numString = numField2.getText();
						num2 = Double.parseDouble(numString);
					} catch (Exception ex)
					{
						numField2.setText("0");
						numString = numField2.getText();
						num2 = Double.parseDouble(numString);
					}
					
					if (source == button1) {
						mult = num1 * num2;
						heading2.setText("      " + mult + "     ");
					} else if (source == button2) {
						sub = num1 - num2;
						heading2.setText("      " + sub + "     ");
					} else if (source == button3) {
						div = num1 / num2;
						heading2.setText("      " + div + "     ");
					} else if (source == button4) {
						add = num1 + num2;
						heading2.setText("      " + add + "     ");
					} else if (source == numField1) {
						pow = num1 * num1;
						heading2.setText("     " + pow + "     ");
					} else if (source == numField2) {
						rad = Math.sqrt(num2);
						heading2.setText("     " + rad + "     ");
					}
				}
			}

