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

public class Math400 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
static int point=400;

	
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
	public static int square(int n) {
		//Finds the square number
		//Pre:send the number as parameter
		//post: Output the number's square 
		  if(n== 0){
	            return 0;
	        }else{
	        int result= square(n-1)+(2*n)-1;
	        return result;
	        }
	    }
	public static int cube(int n) {
		//Finds the cube number
		//Pre:send the number as parameter
		//post: Output the number's cube
		if (n==0) {
			return 0;
		}else {
			int result=cube(n-1)+3*(square(n))-3*n+1;
			return result;
		}
	}
	public static int powerof4(int n) {
		//post: Output the number's cube
		if (n==0) {
			return 0;
		}else {
			int result=powerof4(n-1)+4*cube(n)-6*(square(n))+4*n-1;
			return result;
		}
	}

	public  Math400() {
		//initialize components of the the subprogram
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What is 5 to the power of 4");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(39, 13, 353, 39);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(49, 65, 330, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		//Checks if the ansewer is correct or not 
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
			String s;
				  s=textField.getText();
				  int n=5;
				 int num=Integer.parseInt(s);
				 
				   
				     
						
					if(powerof4(n)==num) {
						 Attemp1.score=Attemp1.score+point;
						  System.out.println("correct!");
						  System.out.println("You earned 400 points");
					}
					  if(powerof4(n)!=num) {
						  System.out.println("wrong!");	
						  Attemp1.score=Attemp1.score-point;
					  }
			
					
			}
		});
		btnNewButton.setBounds(295, 215, 97, 25);
		contentPane.add(btnNewButton);
	}

}
