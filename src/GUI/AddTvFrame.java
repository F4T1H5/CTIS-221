package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainAndSystemClass.ShowsSys;
import SuperAndSubClasses.TVSeries;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddTvFrame extends JFrame {

	private JPanel contentPane;

	private JTextField nameField;
	private JTextField releaseField;
	private JTextField awardField;
	private JTextField budgetField;
	private JTextField imdbField;
	private JTextField wpField;
	private JTextField iscompField;
	private JTextField episodeField;
	private JTextField ageField;
	private JTextField castField;
	private JTextField emmyField;
	private JTextField expendtiureField;
	/**
	 * Create the frame.
	 */
	
	public AddTvFrame(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 43, 67, 35);
		contentPane.add(lblNewLabel);
		
		nameField = new JTextField();
		nameField.setBounds(205, 54, 132, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ADD TV SERIES");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(319, 11, 291, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblReleaseDate = new JLabel("Release Date:");
		lblReleaseDate.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblReleaseDate.setBounds(10, 89, 118, 35);
		contentPane.add(lblReleaseDate);
		
		releaseField = new JTextField();
		releaseField.setColumns(10);
		releaseField.setBounds(205, 100, 132, 20);
		contentPane.add(releaseField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Award:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(10, 135, 67, 35);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Budget:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1.setBounds(10, 181, 67, 35);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("IMDB Point:");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1.setBounds(10, 227, 118, 35);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Writers/Producers:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1.setBounds(363, 43, 185, 35);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		awardField = new JTextField();
		awardField.setColumns(10);
		awardField.setBounds(205, 146, 132, 20);
		contentPane.add(awardField);
		
		budgetField = new JTextField();
		budgetField.setColumns(10);
		budgetField.setBounds(205, 192, 132, 20);
		contentPane.add(budgetField);
		
		imdbField = new JTextField();
		imdbField.setColumns(10);
		imdbField.setBounds(205, 238, 132, 20);
		contentPane.add(imdbField);
		
		wpField = new JTextField();
		wpField.setColumns(10);
		wpField.setBounds(558, 54, 132, 20);
		contentPane.add(wpField);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Casts:");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1_1.setBounds(363, 89, 185, 35);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		iscompField = new JTextField();
		iscompField.setColumns(10);
		iscompField.setBounds(558, 146, 132, 20);
		contentPane.add(iscompField);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Is Comleted:");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(363, 135, 185, 35);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		episodeField = new JTextField();
		episodeField.setColumns(10);
		episodeField.setBounds(558, 238, 132, 20);
		contentPane.add(episodeField);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Age Restriction:");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(363, 181, 185, 35);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		ageField = new JTextField();
		ageField.setColumns(10);
		ageField.setBounds(558, 192, 132, 20);
		contentPane.add(ageField);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("Total Episodes:");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(363, 227, 185, 35);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		castField = new JTextField();
		castField.setColumns(10);
		castField.setBounds(558, 100, 132, 20);
		contentPane.add(castField);
		
		JLabel resultLabel = new JLabel("");
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resultLabel.setBounds(62, 329, 628, 35);
		contentPane.add(resultLabel);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1 = new JLabel("Won Emmy (Yes-No):");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setBounds(10, 273, 185, 35);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1);
		
		emmyField = new JTextField();
		emmyField.setColumns(10);
		emmyField.setBounds(205, 284, 132, 20);
		contentPane.add(emmyField);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_2 = new JLabel("Expenditure:");
		lblNewLabel_2_1_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1_1_1_1_1_2.setBounds(363, 273, 185, 35);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_2);
		
		expendtiureField = new JTextField();
		expendtiureField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					TVSeries tvSeries = null;
					ArrayList<String> cast = new ArrayList<>();
					ArrayList<String> writerProducer = new ArrayList<>();
					
					if (nameField.getText().isEmpty() || releaseField.getText().isEmpty() || awardField.getText().isEmpty() ||
						    budgetField.getText().isEmpty() || imdbField.getText().isEmpty() ||
						    castField.getText().isEmpty() || wpField.getText().isEmpty() || iscompField.getText().isEmpty() || 
						    ageField.getText().isEmpty() || episodeField.getText().isEmpty() || emmyField.getText().isEmpty() ||
						    expendtiureField.getText().isEmpty() ) {
						    resultLabel.setText("Please fill all fields!!!");
						}
					
					else {
						String emmyString = emmyField.getText();
						String name = nameField.getText();
						String releaseDate = releaseField.getText();
						String award = awardField.getText();
						double budget = Double.parseDouble(budgetField.getText());
						double imdbPoint = Double.parseDouble(imdbField.getText());
						double expenditure = Double.parseDouble(expendtiureField.getText());
						
						String[] castArray = castField.getText().split(","); 
						cast.addAll(Arrays.asList(castArray));  
						
						String[] wpArray = wpField.getText().split(","); 
						writerProducer.addAll(Arrays.asList(wpArray));
						
						String isCompleted = iscompField.getText();
						String ageRestriction = ageField.getText();
						int totalEpisodes=Integer.parseInt(episodeField.getText());
						
						tvSeries=new TVSeries(name, releaseDate, award, budget, imdbPoint, writerProducer,
								cast, isCompleted, ageRestriction, totalEpisodes);
						
						tvSeries.calculateProfit(expenditure);
		                tvSeries.setEmmyString(emmyString);
		                
						ShowsSys.getShowList().add(tvSeries);
						
						nameField.setText("");
					    releaseField.setText("");
					    awardField.setText("");
					    budgetField.setText("");
					    imdbField.setText("");
					    castField.setText("");
					    wpField.setText("");
					    iscompField.setText("");
					    ageField.setText("");
					    episodeField.setText("");
					    emmyField.setText("");
					    expendtiureField.setText("");
						resultLabel.setText("TV Series added to the system!!!");
					}
				}
			}
		});
		expendtiureField.setColumns(10);
		expendtiureField.setBounds(558, 284, 132, 20);
		contentPane.add(expendtiureField);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TVSeries tvSeries = null;
				ArrayList<String> cast = new ArrayList<>();
				ArrayList<String> writerProducer = new ArrayList<>();
				
				if (nameField.getText().isEmpty() || releaseField.getText().isEmpty() || awardField.getText().isEmpty() ||
					    budgetField.getText().isEmpty() || imdbField.getText().isEmpty() ||
					    castField.getText().isEmpty() || wpField.getText().isEmpty() || iscompField.getText().isEmpty() || 
					    ageField.getText().isEmpty() || episodeField.getText().isEmpty() || emmyField.getText().isEmpty() ||
					    expendtiureField.getText().isEmpty() ) {
					    resultLabel.setText("Please fill all fields!!!");
					}
				
				else {
					String emmyString = emmyField.getText();
					String name = nameField.getText();
					String releaseDate = releaseField.getText();
					String award = awardField.getText();
					double budget = Double.parseDouble(budgetField.getText());
					double imdbPoint = Double.parseDouble(imdbField.getText());
					double expenditure = Double.parseDouble(expendtiureField.getText());
					
					String[] castArray = castField.getText().split(","); 
					cast.addAll(Arrays.asList(castArray));  
					
					String[] wpArray = wpField.getText().split(","); 
					writerProducer.addAll(Arrays.asList(wpArray));
					
					String isCompleted = iscompField.getText();
					String ageRestriction = ageField.getText();
					int totalEpisodes=Integer.parseInt(episodeField.getText());
					
					tvSeries=new TVSeries(name, releaseDate, award, budget, imdbPoint, writerProducer,
							cast, isCompleted, ageRestriction, totalEpisodes);
					
					tvSeries.calculateProfit(expenditure);
	                tvSeries.setEmmyString(emmyString);
	                
					ShowsSys.getShowList().add(tvSeries);
					
					nameField.setText("");
				    releaseField.setText("");
				    awardField.setText("");
				    budgetField.setText("");
				    imdbField.setText("");
				    castField.setText("");
				    wpField.setText("");
				    iscompField.setText("");
				    ageField.setText("");
				    episodeField.setText("");
				    emmyField.setText("");
				    expendtiureField.setText("");
					resultLabel.setText("TV Series added to the system!!!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(62, 395, 241, 52);
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.setVisible(true);
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClose.setBounds(516, 395, 241, 52);
		contentPane.add(btnClose);
	
	}
}
