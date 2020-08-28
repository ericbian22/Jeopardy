import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Math100 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
static int point=100;

	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					
				
				;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
					
		});
	
		
	}
	
	/**
	 * Create the frame.
	 */
	
	public  Math100() {
		//initialize components of the the subprogram
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What is the largest number in the following set");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(39, 13, 353, 39);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(49, 97, 330, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Checks if the answer is correct or not 
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[]array= {1324321,234514,2135123,1245123};
				int temp;
				
				//use selection sort to sort the array in ascending order
				    for (int i = 0; i < ( array.length - 1 ); i++) {
				      for (int j = 0; j < array.length - i - 1; j++) {
				        if (array[j] > array[j+1]) 
				        {
				           temp = array[j];
				           array[j] = array[j+1];
				           array[j+1] = temp;
				         
				        }
				      }
				    }
			String s;
				  s=textField.getText();
				int num=Integer.parseInt(s);
				  if(num==array[array.length-1]) {
					  
					 Attemp1.score=Attemp1.score+point;
					  System.out.println("correct!");
					  System.out.println("You earned 100 points");
				
					  }else if(num!=array[array.length-1]) {
						  System.out.println("wrong!");	
						  Attemp1.score=Attemp1.score-point;
					  }
			
					
			}
		});
		btnNewButton.setBounds(295, 215, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("1324321,234514,2135123,1245123");
		lblNewLabel_1.setBounds(79, 55, 270, 16);
		contentPane.add(lblNewLabel_1);
	}
}
