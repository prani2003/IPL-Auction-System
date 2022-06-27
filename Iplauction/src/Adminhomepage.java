import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Adminhomepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminhomepage frame = new Adminhomepage();
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
	public Adminhomepage() {
		setTitle("Homepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("RegisterTeam ");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(344, 363, 220, 83);
		contentPane.add(btnNewButton);
		
		JButton btnStartauction = new JButton("StartAuction");
		btnStartauction.setForeground(Color.WHITE);
		btnStartauction.setBackground(Color.ORANGE);
		btnStartauction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStartauction.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnStartauction.setBounds(593, 363, 220, 83);
		contentPane.add(btnStartauction);
		
		JButton btnPlayers = new JButton("Players");
		btnPlayers.setForeground(Color.WHITE);
		btnPlayers.setBackground(Color.ORANGE);
		btnPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlayers.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlayers.setBounds(100, 363, 220, 83);
		contentPane.add(btnPlayers);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome Admin, Have a good day ");
		lblNewLabel_1.setBackground(Color.GREEN);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(259, 274, 419, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Adminhomepage.class.getResource("/assests/admin.png")));
		lblNewLabel.setBounds(0, 0, 873, 533);
		contentPane.add(lblNewLabel);
	}

}
