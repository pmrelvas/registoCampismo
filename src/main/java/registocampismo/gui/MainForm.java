package registocampismo.gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class MainForm {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable tableFernanda;
	private JTable tableArtur;
	private JTable tableLucky;


	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Registos Campismo");
		frame.setBounds(100, 100, 802, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"}));
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JButton btnSettings = new JButton("Configuracoes");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SettingsDialog dialog = new SettingsDialog();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_5 = new JPanel();
		
		JSeparator separator = new JSeparator();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(comboBoxMonth, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 532, Short.MAX_VALUE)
							.addComponent(btnSettings))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
							.addGap(1))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
							.addGap(1)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSettings))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
					.addGap(2)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] {30, 30, 30, 30};
		gbl_panel_5.rowHeights = new int[]{0, 0};
		gbl_panel_5.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0};
		gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblNewLabel_8 = new JLabel("Fernanda");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 0;
		panel_5.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Artur");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 0;
		panel_5.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_7 = new JLabel("Lucky");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.gridx = 4;
		gbc_lblNewLabel_7.gridy = 0;
		panel_5.add(lblNewLabel_7, gbc_lblNewLabel_7);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {0, 30, 0, 30, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton btnAddEntranceFernanda = new JButton("Novo Registo");
		btnAddEntranceFernanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NewEntryDialog dialog = new NewEntryDialog();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnAddEntranceFernanda = new GridBagConstraints();
		gbc_btnAddEntranceFernanda.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddEntranceFernanda.gridx = 0;
		gbc_btnAddEntranceFernanda.gridy = 0;
		panel_3.add(btnAddEntranceFernanda, gbc_btnAddEntranceFernanda);
		
		JButton btnAddEntranceArtur = new JButton("Novo Registo");
		GridBagConstraints gbc_btnAddEntranceArtur = new GridBagConstraints();
		gbc_btnAddEntranceArtur.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddEntranceArtur.gridx = 2;
		gbc_btnAddEntranceArtur.gridy = 0;
		panel_3.add(btnAddEntranceArtur, gbc_btnAddEntranceArtur);
		
		JButton btnAddEntranceLucky = new JButton("Novo Registo");
		GridBagConstraints gbc_btnAddEntranceLucky = new GridBagConstraints();
		gbc_btnAddEntranceLucky.gridx = 4;
		gbc_btnAddEntranceLucky.gridy = 0;
		panel_3.add(btnAddEntranceLucky, gbc_btnAddEntranceLucky);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {0, 30, 0, 30, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0};
		gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel_2.add(scrollPane, gbc_scrollPane);
		
		tableFernanda = new JTable();
		tableFernanda.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Entrada", "Saida"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tableFernanda);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 0;
		panel_2.add(scrollPane_1, gbc_scrollPane_1);
		
		tableArtur = new JTable();
		tableArtur.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Entrada", "Saida"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(tableArtur);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 4;
		gbc_scrollPane_2.gridy = 0;
		panel_2.add(scrollPane_2, gbc_scrollPane_2);
		
		tableLucky = new JTable();
		tableLucky.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Entrada", "Saida"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_2.setViewportView(tableLucky);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Impulsos Inicio");
		lblNewLabel_1.setBounds(0, 29, 105, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Impulsos Final");
		lblNewLabel_1_1.setBounds(199, 29, 88, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Total Impulsos");
		lblNewLabel_4.setBounds(0, 54, 105, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o Eletricidade");
		lblNewLabel_5.setBounds(0, 79, 105, 14);
		panel_1.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(116, 76, 67, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(116, 51, 67, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(115, 26, 67, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(291, 26, 67, 20);
		panel_1.add(textField_3);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fernanda");
		lblNewLabel.setBounds(0, 32, 69, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Artur");
		lblNewLabel_2.setBounds(0, 57, 69, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lucky");
		lblNewLabel_3.setBounds(0, 82, 69, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Total Dias");
		lblNewLabel_6.setBounds(79, 11, 60, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_6_1.setBounds(156, 11, 60, 14);
		panel.add(lblNewLabel_6_1);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(79, 29, 67, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(79, 54, 67, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(79, 79, 67, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(156, 29, 67, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(156, 54, 67, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(156, 79, 67, 20);
		panel.add(textField_9);
		frame.getContentPane().setLayout(groupLayout);
	}
}
