import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Registerteam extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registerteam frame = new Registerteam();
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
	public Registerteam() {
		setTitle("RegisterTeam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(174, 157, 248, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 207, 248, 40);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(555, 207, 248, 40);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(174, 257, 248, 40);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(174, 307, 248, 40);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("TeamName:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 160, 131, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblManagername = new JLabel("ManagerName:");
		lblManagername.setForeground(Color.WHITE);
		lblManagername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblManagername.setBounds(10, 210, 150, 27);
		contentPane.add(lblManagername);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmail.setBounds(460, 160, 131, 27);
		contentPane.add(lblEmail);
		
		JLabel lblTeamid = new JLabel("TeamID:");
		lblTeamid.setForeground(Color.WHITE);
		lblTeamid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeamid.setBounds(10, 260, 131, 27);
		contentPane.add(lblTeamid);
		
		JLabel lblAvaliabeAmount = new JLabel("AvaliabeAmount:");
		lblAvaliabeAmount.setForeground(Color.WHITE);
		lblAvaliabeAmount.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAvaliabeAmount.setBounds(10, 310, 168, 27);
		contentPane.add(lblAvaliabeAmount);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(555, 157, 248, 40);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(460, 210, 131, 27);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("AddTeam");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(374, 424, 217, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Registerteam.class.getResource("/assests/studiu.png")));
		lblNewLabel_1.setBounds(0, 10, 864, 538);
		contentPane.add(lblNewLabel_1);
	}

}
