package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainAndSystemClass.ShowsSys;
import SuperAndSubClasses.Films;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class AddFilmFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField releaseField;
	private JTextField awardField;
	private JTextField budgetField;
	private JTextField imdbField;
	private JTextField wpField;
	private JTextField castField;
	private JTextField tboField;
	private JTextField expenditureField;

	/**
	 * Create the frame.
	 */
	public AddFilmFrame(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD FILM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(373, 11, 165, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(45, 116, 100, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Release Date:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(45, 158, 120, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Award:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_2.setBounds(45, 198, 100, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Budget:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_3.setBounds(45, 239, 100, 31);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("IMDB Point:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_4.setBounds(456, 116, 114, 31);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Writers/Producers:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_5.setBounds(456, 158, 158, 31);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Casts:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_6.setBounds(456, 198, 100, 31);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Total Box Office:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_7.setBounds(456, 239, 152, 31);
		contentPane.add(lblNewLabel_1_7);
		
		nameField = new JTextField();
		nameField.setBounds(175, 125, 186, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		releaseField = new JTextField();
		releaseField.setColumns(10);
		releaseField.setBounds(175, 167, 186, 20);
		contentPane.add(releaseField);
		
		awardField = new JTextField();
		awardField.setColumns(10);
		awardField.setBounds(175, 207, 186, 20);
		contentPane.add(awardField);
		
		budgetField = new JTextField();
		budgetField.setColumns(10);
		budgetField.setBounds(175, 248, 186, 20);
		contentPane.add(budgetField);
		
		imdbField = new JTextField();
		imdbField.setColumns(10);
		imdbField.setBounds(642, 125, 186, 20);
		contentPane.add(imdbField);
		
		wpField = new JTextField();
		wpField.setColumns(10);
		wpField.setBounds(642, 167, 186, 20);
		contentPane.add(wpField);
		
		castField = new JTextField();
		castField.setColumns(10);
		castField.setBounds(642, 207, 186, 20);
		contentPane.add(castField);
		
		tboField = new JTextField();
		tboField.setColumns(10);
		tboField.setBounds(642, 248, 186, 20);
		contentPane.add(tboField);
		
		JLabel resultLabel = new JLabel("");
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resultLabel.setBounds(152, 339, 628, 35);
		contentPane.add(resultLabel);
		
		JLabel imdb = new JLabel("Expenditure:");
		imdb.setFont(new Font("Tahoma", Font.PLAIN, 19));
		imdb.setBounds(45, 281, 114, 31);
		contentPane.add(imdb);
		
		expenditureField = new JTextField();
		expenditureField.setColumns(10);
		expenditureField.setBounds(175, 290, 186, 20);
		contentPane.add(expenditureField);
		
		JButton addButton = new JButton("ADD");
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Films films = null;
				ArrayList<String> cast = new ArrayList<>();
				ArrayList<String> writerProducer = new ArrayList<>();
				
				if (nameField.getText().isEmpty() || releaseField.getText().isEmpty() || awardField.getText().isEmpty() ||
					    budgetField.getText().isEmpty() || imdbField.getText().isEmpty() ||
					    castField.getText().isEmpty() || wpField.getText().isEmpty() || tboField.getText().isEmpty() || 
					    expenditureField.getText().isEmpty()) {
					    resultLabel.setText("Please fill all fields!!!");
					}
				
				else {
					String name= nameField.getText();
					String releaseDate = releaseField.getText();
					String award = awardField.getText();
					double budget = Double.parseDouble(budgetField.getText());
					double imdbPoint = Double.parseDouble(imdbField.getText());
					double totalBoxOffice = Double.parseDouble(tboField.getText());
					double expenditure = Double.parseDouble(expenditureField.getText());
					
					String[] castArray = castField.getText().split(","); 
					cast.addAll(Arrays.asList(castArray));
					
					String[] wpArray = wpField.getText().split(","); 
					writerProducer.addAll(Arrays.asList(wpArray));
					
					films = new Films(name, releaseDate, award, budget, imdbPoint, writerProducer, cast, totalBoxOffice);
					films.calculateProfit(expenditure);
					ShowsSys.getShowList().add(films);
					
					nameField.setText("");
				    releaseField.setText("");
				    awardField.setText("");
				    budgetField.setText("");
				    imdbField.setText("");
				    castField.setText("");
				    wpField.setText("");
				    tboField.setText("");
				    expenditureField.setText("");
					resultLabel.setText("Film added to the system!!!");
				}
			}
		});
		addButton.setBounds(175, 385, 186, 46);
		contentPane.add(addButton);
		
		JButton closeButton = new JButton("CLOSE");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		closeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		closeButton.setBounds(573, 385, 186, 46);
		contentPane.add(closeButton);
	}
}
