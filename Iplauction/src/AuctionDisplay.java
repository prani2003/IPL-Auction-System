import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

public class AuctionDisplay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuctionDisplay frame = new AuctionDisplay();
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
	public AuctionDisplay() {
		setTitle("Auction Screen ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("30");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(571, 47, 132, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Time:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(515, 47, 132, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(297, 263, 81, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAge.setBounds(295, 295, 155, 42);
		contentPane.add(lblAge);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCountry.setBounds(297, 329, 97, 42);
		contentPane.add(lblCountry);
		
		JLabel lblSpecializatin = new JLabel("Specializatin:");
		lblSpecializatin.setForeground(Color.WHITE);
		lblSpecializatin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSpecializatin.setBounds(33, 353, 155, 42);
		contentPane.add(lblSpecializatin);
		
		JLabel lblBatting = new JLabel("Batting:");
		lblBatting.setForeground(Color.WHITE);
		lblBatting.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBatting.setBounds(33, 382, 155, 42);
		contentPane.add(lblBatting);
		
		JLabel lblBownling = new JLabel("Bowling:");
		lblBownling.setForeground(Color.WHITE);
		lblBownling.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBownling.setBounds(33, 421, 155, 42);
		contentPane.add(lblBownling);
		
		JLabel lblCua = new JLabel("Matches played:");
		lblCua.setForeground(Color.WHITE);
		lblCua.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua.setBounds(515, 382, 155, 42);
		contentPane.add(lblCua);
		
		JLabel lblBaseprice = new JLabel("Baseprice:");
		lblBaseprice.setForeground(Color.WHITE);
		lblBaseprice.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBaseprice.setBounds(515, 421, 155, 42);
		contentPane.add(lblBaseprice);
		
		JLabel lblCua_1 = new JLabel("C/U/A:");
		lblCua_1.setForeground(Color.WHITE);
		lblCua_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_1.setBounds(515, 353, 155, 42);
		contentPane.add(lblCua_1);
		
		JLabel lblNewLabel_1 = new JLabel("MS Dhoni");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(370, 271, 132, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCua_2 = new JLabel("40");
		lblCua_2.setForeground(Color.WHITE);
		lblCua_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2.setBounds(370, 295, 155, 42);
		contentPane.add(lblCua_2);
		
		JLabel lblCua_2_1 = new JLabel("India ");
		lblCua_2_1.setForeground(Color.WHITE);
		lblCua_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1.setBounds(380, 329, 155, 42);
		contentPane.add(lblCua_2_1);
		
		JLabel lblCua_2_1_1 = new JLabel("WKB");
		lblCua_2_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1.setBounds(154, 353, 155, 42);
		contentPane.add(lblCua_2_1_1);
		
		JLabel lblCua_2_1_1_1 = new JLabel("RHB");
		lblCua_2_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1.setBounds(154, 382, 155, 42);
		contentPane.add(lblCua_2_1_1_1);
		
		JLabel lblCua_2_1_1_1_1 = new JLabel("RHB");
		lblCua_2_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1.setBounds(154, 421, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1 = new JLabel("205");
		lblCua_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1.setBounds(667, 382, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1_1 = new JLabel("1500");
		lblCua_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1_1.setBounds(641, 421, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1_1_1 = new JLabel("Capped");
		lblCua_2_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1_1_1.setBounds(590, 353, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AuctionDisplay.class.getResource("/assests/images.png")));
		lblNewLabel_2.setBounds(10, 10, 758, 545);
		contentPane.add(lblNewLabel_2);
	}
}
