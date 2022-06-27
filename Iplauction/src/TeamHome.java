import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TeamHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamHome frame = new TeamHome();
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
	public TeamHome() {
		setTitle("TeamHomepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Avaliable Balance");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(106, 401, 220, 38);
		contentPane.add(btnNewButton);
		
		JButton btnEnterAuction = new JButton("Enter Auction");
		btnEnterAuction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnterAuction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnterAuction.setBackground(Color.ORANGE);
		btnEnterAuction.setBounds(367, 401, 220, 38);
		contentPane.add(btnEnterAuction);
		
		JButton btnMyplayers = new JButton("My_Players");
		btnMyplayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMyplayers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMyplayers.setBackground(Color.ORANGE);
		btnMyplayers.setBounds(626, 401, 220, 38);
		contentPane.add(btnMyplayers);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome Team, Best of luck");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(310, 242, 317, 55);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TeamHome.class.getResource("/assests/admin.png")));
		lblNewLabel.setBounds(10, 10, 900, 536);
		contentPane.add(lblNewLabel);
	}

}
