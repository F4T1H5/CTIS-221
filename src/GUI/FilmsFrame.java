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
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class FilmsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField selectedField;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public FilmsFrame(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Films Main Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(297, 11, 278, 65);
		contentPane.add(lblNewLabel);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
                AddFilmFrame addFilmFrame = new AddFilmFrame(parent);
                addFilmFrame.setVisible(true);
			}
		});
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton.setBounds(38, 155, 168, 43);
		contentPane.add(addButton);
		
		JButton searchButton = new JButton("SEARCH");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
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
		searchButton.setBounds(297, 292, 168, 43);
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
		removeButton.setBounds(38, 292, 168, 43);
		contentPane.add(removeButton);
		
		JButton displayButton = new JButton("DISPLAY");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ShowsSys.displayFilms().isEmpty()) {
					textArea.setText("Nothing added to the system!");
				}
				else {
					textArea.setText(ShowsSys.displayFilms());
				}
			}
		});
		displayButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		displayButton.setBounds(297, 155, 168, 43);
		contentPane.add(displayButton);
		
		selectedField = new JTextField("Enter Film name to search or remove...");
		selectedField.setForeground(Color.GRAY);
		selectedField.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (selectedField.getText().equals("Enter Film name to search or remove...")) {
		            selectedField.setText("");
		            selectedField.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (selectedField.getText().isEmpty()) {
		            selectedField.setForeground(Color.GRAY);
		            selectedField.setText("Enter Film name to search or remove...");
		        }
		    }
		});
		selectedField.setToolTipText("Please, give a Name to search or remove.");
		selectedField.setBounds(38, 225, 427, 43);
		contentPane.add(selectedField);
		selectedField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(585, 60, 365, 359);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClose.setBounds(166, 363, 168, 43);
		contentPane.add(btnClose);
	}

}
