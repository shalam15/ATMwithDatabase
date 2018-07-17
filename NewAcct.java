
import java.awt.BorderLayout;
import java.util.Random;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class NewAcct extends JFrame {
public static String cardNumber=ATMFramee.getCard();
	
	
	
	
	private JPanel contentPane;
	private JTextField fName_textField;
	private JTextField lName_textField;
	private JTextField email_textField;
	private JTextField textField_4;

	
	JButton btnCreateAcct = new JButton("CREATE SAVINGS");	
	JButton btnGoBack = new JButton("GO BACK");
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAcct frame = new NewAcct();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewAcct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("FIRST NAME");
		lblNewLabel.setForeground(SystemColor.blue);
		
		JLabel lblNewLabel_1 = new JLabel("LAST NAME");
		lblNewLabel_1.setForeground(SystemColor.blue);
		
		fName_textField = new JTextField();
		fName_textField.setColumns(10);
		
		lName_textField = new JTextField();
		lName_textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("EMAIL");
		lblNewLabel_3.setForeground(SystemColor.blue);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_4.setForeground(SystemColor.blue);
		
		JLabel lblNewLabel_5 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblNewLabel_6 = new JLabel("PLEASE FILL OUT NEW ACCOUNT FORM");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel pinNum_textField = new JLabel("PIN #");
		pinNum_textField.setForeground(SystemColor.blue);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		Random randNumb= new Random();
		Integer numbGenerated =randNumb.nextInt(1000000);
		String CardNumberGenerated= String.valueOf(numbGenerated);
		textField.setText(CardNumberGenerated);
		btnCreateAcct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TheDataBase.checkConnection()) {
					String Pin = textField_4.getText();
					String Email =email_textField.getText();
					String FirstName=fName_textField.getText();
					String LastName = lName_textField.getText();

				 TheDataBase.createNewCustomer(FirstName, LastName, Email, CardNumberGenerated , Pin, "Savings", "1", "0.00");
					JOptionPane.showMessageDialog(null, "Account Created\n Card Number is: "+textField.getText());
					System.out.println(Email+Pin);
				}else {
					JOptionPane.showMessageDialog(null, "UNBLE TO CREATE ACCOUNT");

				}

				
			}
		});
		
		
		btnCreateAcct.setForeground(SystemColor.blue);
		
		
		btnGoBack.setForeground(Color.RED);
		
		JButton btnCreateCheckings = new JButton("CREATE CHECKINGS");
		btnCreateCheckings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(TheDataBase.checkConnection()) {
					String Pin = textField_4.getText();
					String Email =email_textField.getText();
					String FirstName=fName_textField.getText();
					String LastName = lName_textField.getText();

				 TheDataBase.createNewCustomer(FirstName, LastName, Email, CardNumberGenerated , Pin, "Checkings", "1", "0.00");
					JOptionPane.showMessageDialog(null, "Account Created\n Card Number is: "+textField.getText());
					System.out.println(Email+Pin);
				}else {
					JOptionPane.showMessageDialog(null, "UNBLE TO CREATE ACCOUNT");
			}
			}
		});
		btnCreateCheckings.setForeground(Color.BLUE);
		
		
		
		JLabel lblGeneratedCard = new JLabel("GENERATED CARD #");
		lblGeneratedCard.setForeground(Color.BLUE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(54)
							.addComponent(lblNewLabel_4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(90)
							.addComponent(lblNewLabel_5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(62)
							.addComponent(lblNewLabel_6))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(pinNum_textField)
								.addComponent(lblNewLabel_3)
								.addComponent(lblGeneratedCard))
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_4, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
								.addComponent(lName_textField, 0, 0, Short.MAX_VALUE)
								.addComponent(email_textField, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(fName_textField, 0, 0, Short.MAX_VALUE)
								.addComponent(textField))
							.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnCreateCheckings, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCreateAcct, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
								.addComponent(btnGoBack, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_6)
							.addGap(15)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblGeneratedCard))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(fName_textField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lName_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(email_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnCreateCheckings)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCreateAcct)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(pinNum_textField)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnGoBack))
					.addGap(3))
		);
		contentPane.setLayout(gl_contentPane);
		actionGoBack();
	}
	
	public void actionGoBack() {
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
							ATMFramee ATMFramee=new ATMFramee();
							ATMFramee.setVisible(true); //open next window which is ATMFramee.java
							JOptionPane.showMessageDialog(null, "Account Activity Canceled" );
							dispose(); //close this window
			
			}
		});
	}
}
