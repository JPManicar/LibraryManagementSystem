package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DropMode;
import javax.swing.JComboBox;

public class LibMaterialReview extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtCommenttextField;
	private JTextField txtTimestamptextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibMaterialReview frame = new LibMaterialReview();
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
	public LibMaterialReview() {
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

		JLabel lblMaterialIdLabel = new JLabel("Materials");
		lblMaterialIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMaterialIdLabel.setBounds(10, 29, 98, 32);
		panel.add(lblMaterialIdLabel);

		JLabel lblStudentIdLabel = new JLabel("Student");
		lblStudentIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblStudentIdLabel.setBounds(10, 89, 98, 32);
		panel.add(lblStudentIdLabel);

		JLabel lblProfessorIdLabel = new JLabel("Professor");
		lblProfessorIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProfessorIdLabel.setBounds(10, 142, 98, 32);
		panel.add(lblProfessorIdLabel);

		JLabel lblCommentLabel = new JLabel("Comment");
		lblCommentLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCommentLabel.setBounds(10, 198, 98, 32);
		panel.add(lblCommentLabel);

		txtCommenttextField = new JTextField();
		txtCommenttextField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCommenttextField.setToolTipText("");
		txtCommenttextField.setColumns(10);
		txtCommenttextField.setBounds(119, 199, 290, 34);
		panel.add(txtCommenttextField);

		JLabel lblTimestampLabel = new JLabel("Timestamp");
		lblTimestampLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTimestampLabel.setBounds(10, 257, 131, 32);
		panel.add(lblTimestampLabel);

		txtTimestamptextField = new JTextField();
		txtTimestamptextField.setColumns(10);
		txtTimestamptextField.setBounds(118, 255, 291, 34);
		panel.add(txtTimestamptextField);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 454, 402, 2);
		panel.add(separator);

		JButton btnNewButton = new JButton("Save Entry");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(236, 467, 158, 32);
		panel.add(btnNewButton);

		JButton btnDiscardChanges = new JButton("Discard Changes");
		btnDiscardChanges.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiscardChanges.setBounds(29, 468, 158, 32);
		panel.add(btnDiscardChanges);
		
		btnDiscardChanges.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Sucessfully Discarded Changes.");
				LibHome objLib = new LibHome();
				objLib.setVisible(true);
			}
		});

		JComboBox cmbMaterialscomboBox = new JComboBox();
		cmbMaterialscomboBox.setBounds(118, 31, 291, 34);
		panel.add(cmbMaterialscomboBox);
		
		JComboBox cmbStudentcomboBox = new JComboBox();
		cmbStudentcomboBox.setBounds(118, 87, 291, 34);
		panel.add(cmbStudentcomboBox);
		
		JComboBox cmbMaterialcomboBox = new JComboBox();
		cmbMaterialcomboBox.setBounds(118, 140, 291, 34);
		panel.add(cmbMaterialcomboBox);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 42, 527, 511);
		contentPane.add(panel_1);

		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		panel_1.add(table);

		JLabel lblTitleLabel = new JLabel("Material Review");
		lblTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitleLabel.setBounds(27, 10, 178, 30);
		contentPane.add(lblTitleLabel);
	}
}