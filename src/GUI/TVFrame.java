package GUI;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainAndSystemClass.ShowsSys;
import SuperAndSubClasses.Shows;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class TVFrame extends JFrame {

	private JPanel contentPane;
	private JTextField selectedField;
	private JTextArea textArea;
	/**
	 * Create the frame.
	 */
	AddTvFrame addTvFrame = new AddTvFrame(this);
	
	public void fillComboBox() {
	}
	
	public TVFrame(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TV Series Main Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(297, 11, 278, 65);
		contentPane.add(lblNewLabel);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
                AddTvFrame addTvFrame = new AddTvFrame(parent);
                addTvFrame.setVisible(true);
			}
		});
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton.setBounds(38, 167, 211, 43);
		contentPane.add(addButton);
		
		JButton searchButton = new JButton("SEARCH");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shows shows = null;
				
				if (ShowsSys.searchShow(selectedField.getText()) == null) {
					textArea.setText("Please, enter a valid name!");
					selectedField.setText(null);
				}
				
				else {
					shows = ShowsSys.searchShow(selectedField.getText());
					textArea.setText(shows.toString());
				}
			}
		});
		searchButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		searchButton.setBounds(323, 293, 168, 43);
		contentPane.add(searchButton);
		
		JButton removeButton = new JButton("REMOVE");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Shows shows = null;
				
				if (ShowsSys.searchShow(selectedField.getText()) == null) {
					textArea.setText("Please, enter a valid name!");
					selectedField.setText(null);
				}
				
				else {
					if(ShowsSys.deleteShow(selectedField.getText())) {
						textArea.setText("Selected show deleted!");
						selectedField.setText(null);
					}
				}
				
			}
		});
		removeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		removeButton.setBounds(38, 293, 168, 43);
		contentPane.add(removeButton);
		
		JButton displayButton = new JButton("DISPLAY");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ShowsSys.displayTVSeries().isEmpty()) {
					textArea.setText("Nothing added to the system!");
				}
				
				else {
					textArea.setText(ShowsSys.displayTVSeries());
				}
			}
		});
		displayButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		displayButton.setBounds(280, 167, 211, 43);
		contentPane.add(displayButton);
		
		selectedField = new JTextField("Enter TV series name to search or remove...");
		selectedField.setForeground(Color.GRAY);
		selectedField.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (selectedField.getText().equals("Enter TV series name to search or remove...")) {
		            selectedField.setText("");
		            selectedField.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (selectedField.getText().isEmpty()) {
		            selectedField.setForeground(Color.GRAY);
		            selectedField.setText("Enter TV series name to search or remove...");
		        }
		    }
		});
		selectedField.setToolTipText("Please, give a Name to search or remove.");
		selectedField.setBounds(38, 239, 453, 43);
		contentPane.add(selectedField);
		selectedField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(569, 56, 360, 338);
		contentPane.add(scrollPane);

		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setTabSize(9);
		textArea.setEditable(false);
		
		JButton closeButton = new JButton("CLOSE");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		closeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		closeButton.setBounds(156, 358, 168, 43);
		contentPane.add(closeButton);

	        fillComboBox();
	}
}
