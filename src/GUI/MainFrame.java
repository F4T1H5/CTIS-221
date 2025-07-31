package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	
	TVFrame tvFrame = new TVFrame(this);
	AddTvFrame addTvFrame = new AddTvFrame(this);
	FilmsFrame filmsFrame = new FilmsFrame(this);
	AddFilmFrame addFilmFrame = new AddFilmFrame(this);
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to The TV App");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(345, 11, 287, 82);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please, choose your service");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(335, 85, 287, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton tvButton = new JButton("TV Series");
		tvButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tvFrame.setVisible(true);
			}
		});
		tvButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tvButton.setBounds(130, 157, 196, 59);
		contentPane.add(tvButton);
		
		JButton filmButton = new JButton("Films");
		filmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filmsFrame.setVisible(true);
			}
		});
		filmButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		filmButton.setBounds(633, 157, 196, 59);
		contentPane.add(filmButton);
		
		JButton closeButton = new JButton("Close");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		closeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		closeButton.setBounds(405, 329, 147, 43);
		contentPane.add(closeButton);
	}
}
