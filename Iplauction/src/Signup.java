import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setTitle("PLayers Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_1_3 = new JLabel("Password:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(416, 122, 112, 48);
		contentPane.add(lblNewLabel_1_3);
		btnNewButton.setBounds(381, 435, 160, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 171, 90, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 218, 90, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Country:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(10, 265, 90, 48);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Matches played:");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_1.setBounds(10, 321, 151, 48);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Specialization:");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2.setBounds(10, 363, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Batting:");
		lblNewLabel_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2_1.setBounds(416, 218, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Bowling:");
		lblNewLabel_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2_1_1.setBounds(416, 171, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("C/U/A:");
		lblNewLabel_1_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(416, 274, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1 = new JLabel("Base Price:");
		lblNewLabel_1_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1_2_1_1_1_1.setBounds(416, 321, 136, 48);
		contentPane.add(lblNewLabel_1_1_1_2_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(156, 180, 242, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(156, 227, 242, 37);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(156, 274, 242, 37);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(156, 321, 242, 37);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(156, 363, 242, 37);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(527, 227, 242, 37);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(527, 180, 242, 37);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(527, 274, 242, 37);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(528, 321, 241, 37);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(156, 131, 240, 37);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(527, 133, 242, 37);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email:");
		lblNewLabel_1_2.setBackground(Color.GRAY);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 122, 90, 48);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Signup.class.getResource("/assests/studiu.png")));
		lblNewLabel.setBounds(0, 25, 795, 485);
		contentPane.add(lblNewLabel);
	}
}
