package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class LibStudent extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtFirstNametextField;
	private JTextField txtLastNametextField;
	private JTextField txtMiddleNametextField;
	private JTextField txtWebmailtextField;
	private JTextField txtDateOfBirthtextField;
	private JTextField txtAddresstextField;
	private JTextField txtCitytextField;
	private JTextField txtProvincetextField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibStudent frame = new LibStudent();
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
	public LibStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 439, 511);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstNameLabel = new JLabel("First Name");
		lblFirstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFirstNameLabel.setBounds(10, 29, 98, 32);
		panel.add(lblFirstNameLabel);
		
		txtFirstNametextField = new JTextField();
		txtFirstNametextField.setBounds(121, 27, 291, 34);
		panel.add(txtFirstNametextField);
		txtFirstNametextField.setColumns(10);
		
		JLabel lblLastNameLabel = new JLabel("Last Name");
		lblLastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLastNameLabel.setBounds(10, 71, 98, 32);
		panel.add(lblLastNameLabel);
		
		txtLastNametextField = new JTextField();
		txtLastNametextField.setColumns(10);
		txtLastNametextField.setBounds(121, 69, 291, 34);
		panel.add(txtLastNametextField);
		
		JLabel lblMiddleNameLabel = new JLabel("Middle Name");
		lblMiddleNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMiddleNameLabel.setBounds(10, 113, 98, 32);
		panel.add(lblMiddleNameLabel);
		
		txtMiddleNametextField = new JTextField();
		txtMiddleNametextField.setColumns(10);
		txtMiddleNametextField.setBounds(121, 111, 291, 34);
		panel.add(txtMiddleNametextField);
		
		JLabel lblWebmailLabel = new JLabel("Webmail");
		lblWebmailLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWebmailLabel.setBounds(10, 157, 98, 32);
		panel.add(lblWebmailLabel);
		
		txtWebmailtextField = new JTextField();
		txtWebmailtextField.setColumns(10);
		txtWebmailtextField.setBounds(121, 155, 291, 34);
		panel.add(txtWebmailtextField);
		
		JLabel lblDateOfBirthLabel = new JLabel("Date Of Birth");
		lblDateOfBirthLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateOfBirthLabel.setBounds(10, 201, 98, 32);
		panel.add(lblDateOfBirthLabel);
		
		txtDateOfBirthtextField = new JTextField();
		txtDateOfBirthtextField.setColumns(10);
		txtDateOfBirthtextField.setBounds(121, 199, 291, 34);
		panel.add(txtDateOfBirthtextField);
		
		JLabel lblAddressLabel = new JLabel("Address");
		lblAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddressLabel.setBounds(10, 289, 98, 32);
		panel.add(lblAddressLabel);
		
		txtAddresstextField = new JTextField();
		txtAddresstextField.setColumns(10);
		txtAddresstextField.setBounds(121, 287, 291, 34);
		panel.add(txtAddresstextField);
		
		JLabel lblCityLabel = new JLabel("City");
		lblCityLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblCityLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCityLabel.setBounds(10, 354, 98, 32);
		panel.add(lblCityLabel);
		
		txtCitytextField = new JTextField();
		txtCitytextField.setColumns(10);
		txtCitytextField.setBounds(86, 352, 146, 34);
		panel.add(txtCitytextField);
		
		JLabel lblProvinceLabel = new JLabel("Province");
		lblProvinceLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProvinceLabel.setBounds(10, 398, 98, 32);
		panel.add(lblProvinceLabel);
		
		txtProvincetextField = new JTextField();
		txtProvincetextField.setColumns(10);
		txtProvincetextField.setBounds(86, 396, 146, 34);
		panel.add(txtProvincetextField);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCourse.setBounds(10, 245, 98, 32);
		panel.add(lblCourse);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 243, 291, 34);
		panel.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 340, 402, 2);
		panel.add(separator);
		
		JCheckBox chckbxisGraduatedCheckBox = new JCheckBox("Are you a graduate?");
		chckbxisGraduatedCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisGraduatedCheckBox.setBounds(249, 361, 171, 21);
		panel.add(chckbxisGraduatedCheckBox);
		
		JCheckBox chckbxisEnrolledCheckBox = new JCheckBox("currently enrolled?");
		chckbxisEnrolledCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxisEnrolledCheckBox.setBounds(249, 398, 184, 21);
		panel.add(chckbxisEnrolledCheckBox);
		
		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(236, 467, 158, 32);
		panel.add(btnNewButton);
		
		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(29, 468, 158, 32);
		panel.add(btnDiscardChanges);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 527, 511);
		contentPane.add(panel_1);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);
		
		JLabel lblTitleLabel = new JLabel("Student Entry");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}
}
