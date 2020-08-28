/*/
 * Author: Eric Bian Date 2019-12-15 The program uses GUI to create a jeopardy game,which contains 25 questions. It allows the users to review some knowledges
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Attemp1 {
public static int score=0;


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attemp1 window = new Attemp1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		
				});
		}
	//Science 
	
	
	


	/**
	 * Create the application.
	 */
	public Attemp1() {
		initialize();
	
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 723, 463);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		//Button creating
		JButton btnNewButton = new JButton("100");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//OOP from the class Math100
				Math100 frame=new Math100();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton.setBounds(26, 93, 132, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("200\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Math200
				Math200 frame=new Math200();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_1.setBounds(26, 147, 132, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("300");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//OOP from the class Math300
				Math300 frame=new Math300();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_2.setBounds(26, 190, 132, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("400");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//OOP from the class Math400
				Math400 frame=new Math400();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_3.setBounds(26, 237, 132, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("500");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//OOP from the class Math400
				Math500 frame=new Math500();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_4.setBounds(26, 285, 132, 50);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton button = new JButton("100");
		button.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Science100
				Science100 frame=new Science100();
				//Set the frame visible
				frame.setVisible(true);
				}});
		
		button.setFont(new Font("Tahoma", Font.PLAIN, 23));
	
		button.setBounds(156, 93, 132, 57);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("200\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Science200
				Science200 frame=new Science200();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_1.setBounds(156, 147, 132, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("300");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Science300
				Science300 frame=new Science300();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_2.setBounds(156, 190, 132, 50);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("400");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Science400
				Science400 frame=new Science400();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_3.setBounds(156, 237, 132, 50);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("500");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Science500
				Science500 frame=new Science500();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_4.setBounds(156, 285, 132, 50);
		frame.getContentPane().add(button_4);
		
		JLabel lblNewLabel = new JLabel("Welcome to Jeopardy!");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblNewLabel.setBounds(229, 0, 267, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button_5 = new JButton("100");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Computer100
				Computer100 frame=new Computer100();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_5.setBounds(286, 93, 132, 57);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("200");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Computer200
				Computer200 frame=new Computer200();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_6.setBounds(286, 147, 132, 50);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("300\r\n");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Computer300
				Computer300 frame=new Computer300();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_7.setBounds(286, 190, 132, 50);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("400");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Computer400
				Computer400 frame=new Computer400();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_8.setBounds(286, 237, 132, 50);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("500");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Computer500
				Computer500 frame=new Computer500();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_9.setBounds(286, 285, 132, 50);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("100");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class History100
				History100 frame=new History100();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_10.setBounds(416, 93, 132, 57);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("200\r\n");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class History200
				History200 frame=new History200();
				frame.setVisible(true);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_11.setBounds(416, 147, 132, 50);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("300\r\n");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class History300
				History300 frame=new History300();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_12.setBounds(416, 190, 132, 50);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("400");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class History400
				History400 frame=new History400();
				//Set the frame visible
				frame.setVisible(true);
			}
			
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_13.setBounds(416, 237, 132, 50);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("500");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class History500
				History500 frame=new History500();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_14.setBounds(416, 285, 132, 50);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("100");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Geography100
				Geography100 frame=new Geography100();
				//Set the frame visible
				frame.setVisible(true);
			}
			
		});
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_15.setBounds(546, 93, 132, 57);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("200");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Geography200
				Geography200 frame=new Geography200();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_16.setBounds(546, 147, 132, 50);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("300");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Geography300
				Geography300 frame=new Geography300();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_17.setBounds(546, 196, 132, 44);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("400");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Geography400
				Geography400 frame=new Geography400();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_18.setBounds(546, 237, 132, 50);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("500");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OOP from the class Geography500
				Geography500 frame=new Geography500();
				//Set the frame visible
				frame.setVisible(true);
			}
		});
		
		//Label creating
		button_19.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_19.setBounds(546, 285, 132, 50);
		frame.getContentPane().add(button_19);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblMath.setBounds(59, 64, 56, 16);
		frame.getContentPane().add(lblMath);
		
		JLabel lblScience = new JLabel("Science");
		lblScience.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblScience.setBounds(181, 64, 72, 16);
		frame.getContentPane().add(lblScience);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblComputer.setBounds(297, 63, 107, 17);
		frame.getContentPane().add(lblComputer);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblHistory.setBounds(443, 62, 78, 17);
		frame.getContentPane().add(lblHistory);
		
		JLabel lblGeography = new JLabel("Geography");
		lblGeography.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		lblGeography.setBounds(553, 64, 107, 17);
		frame.getContentPane().add(lblGeography);
		
	
		//Collect the score and file output
		JButton btnNewButton_5 = new JButton("Score");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Output the points
				System.out.println(score);
				
				//file output
				BufferedWriter output = null;
				try { 
				    File file = new File("itemsData.txt"); 
				     output = new BufferedWriter(new FileWriter(file, true)); 
				    
				   
				    	  output.write("your score is"+ score); 
				    	  output.newLine();
						    
							
						
				         
				   
				} //end try=
				catch ( IOException e1 ) { 



				    e1.printStackTrace(); 
				} //end catch
				finally { 
				    	if ( output != null ) { 
				       	try { 
				output.close(); 
				}//end try
				catch ( IOException e1 ) { 
				e1.printStackTrace(); 
				} //end catch
				}//end if 
				}//end finally
			

			}
		});
		btnNewButton_5.setBounds(59, 358, 124, 33);
		frame.getContentPane().add(btnNewButton_5);
		

 
	
		
	}
}


