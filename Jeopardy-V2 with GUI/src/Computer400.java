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

public class Computer400 extends JFrame {

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
	
	public  Computer400() {
		//initialize components of the the subprogram
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What is the full name of RAM?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(49, 13, 383, 39);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(49, 65, 330, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		//Checks if the answer is correct or not 
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  String[][] answer={ 
							{"4", "hydrogen", "Steve Jobs", "1867", "13"},
							{"2", "lead", "1943", "1939", "37 million"},
							{"53.1", "9.8", "1024", "John Macdonald", "7"},
							{"60","300000000m/s","random access memory","ndrew Johnson", "Algeria"},
							{"3","5","2002","Columbus","50km"}
						   };
			String s;
				  s=textField.getText();
				    int counter=0;
				      for(int i=0;i<5;i++) {
						for( int j=0;j<5;j++) {
					if(answer[i][j].contentEquals(s)) {
					counter++;
					}
						}
					}
				  if(counter==1) {
					  
					 Attemp1.score=Attemp1.score+point;
					  System.out.println("correct!");
					  System.out.println("You earned 400 points");
				
					  }if(counter==0) {
						  System.out.println("wrong!");	
						  Attemp1.score=Attemp1.score-point;
					  }
			
					
			}
		});
		btnNewButton.setBounds(295, 215, 97, 25);
		contentPane.add(btnNewButton);
	}

}
