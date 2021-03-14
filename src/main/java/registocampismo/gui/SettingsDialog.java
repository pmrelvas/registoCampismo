package registocampismo.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import registocampismo.domain.entities.Setting;
import registocampismo.domain.usecases.settings.ReadSettingUseCase;

import java.awt.event.ActionListener;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;

public class SettingsDialog extends JDialog {
	
	private static final long serialVersionUID = 9087660598366505404L;
	
	private final ReadSettingUseCase readSettingUseCase;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldPriceElectricityLowSeason;
	private JTextField textFieldPricePersonHighSeason;
	private JTextField textFieldPricePersonLowSeason;
	private JTextField textFieldPriceDogHighSeason;
	private JTextField textFieldPriceDogLowSeason;
	private JTextField textFieldPriceElectricityHighSeason;
	private JTextField textFieldMonthsHighSeason;
	private JTextField textFieldMonthsLowSeason;

	/**
	 * Create the dialog.
	 */
	public SettingsDialog() {	
		setResizable(false);
		setBounds(100, 100, 370, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Pre\u00E7o Pessoa \u00C9poca Alta");
		JLabel lblPreoPessoapoca = new JLabel("Pre\u00E7o Pessoa \u00C9poca Baixa");
		JLabel lblPreoCopoca = new JLabel("Pre\u00E7o C\u00E3o \u00C9poca Alta");
		JLabel lblPreoCopoca_1 = new JLabel("Pre\u00E7o C\u00E3o \u00C9poca Baixa");
		JLabel lblPreoEletricidadepoca = new JLabel("Pre\u00E7o Eletricidade \u00C9poca Alta");
		JLabel lblPreoEletricidadepoca_2 = new JLabel("Pre\u00E7o Eletricidade \u00C9poca Baixa");
		JLabel lblMesespocaAlta = new JLabel("Meses \u00C9poca Alta");
		JLabel lblMesespocaBaixa = new JLabel("Meses \u00C9poca Baixa");
		
		textFieldPriceElectricityLowSeason = new JTextField();
		textFieldPriceElectricityLowSeason.setColumns(10);
		
		textFieldPricePersonHighSeason = new JTextField();
		textFieldPricePersonHighSeason.setColumns(10);
		
		textFieldPricePersonLowSeason = new JTextField();
		textFieldPricePersonLowSeason.setColumns(10);
		
		textFieldPriceDogHighSeason = new JTextField();
		textFieldPriceDogHighSeason.setColumns(10);
		
		textFieldPriceDogLowSeason = new JTextField();
		textFieldPriceDogLowSeason.setColumns(10);
		
		textFieldPriceElectricityHighSeason = new JTextField();
		textFieldPriceElectricityHighSeason.setColumns(10);
		
		textFieldMonthsHighSeason = new JTextField();
		textFieldMonthsHighSeason.setColumns(10);
		
		textFieldMonthsLowSeason = new JTextField();
		textFieldMonthsLowSeason.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblPreoEletricidadepoca, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblPreoPessoapoca, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING)
						.addComponent(lblPreoCopoca_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(lblPreoCopoca, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMesespocaAlta, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMesespocaBaixa, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreoEletricidadepoca_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldPriceElectricityLowSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldPricePersonHighSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldPricePersonLowSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldPriceDogHighSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldPriceDogLowSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldPriceElectricityHighSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldMonthsHighSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldMonthsLowSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(150, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textFieldPricePersonHighSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreoPessoapoca)
						.addComponent(textFieldPricePersonLowSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreoCopoca)
						.addComponent(textFieldPriceDogHighSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreoCopoca_1)
						.addComponent(textFieldPriceDogLowSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreoEletricidadepoca)
						.addComponent(textFieldPriceElectricityHighSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreoEletricidadepoca_2)
						.addComponent(textFieldPriceElectricityLowSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMesespocaAlta)
						.addComponent(textFieldMonthsHighSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMesespocaBaixa)
						.addComponent(textFieldMonthsLowSeason, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setContentAreaFilled(false);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setContentAreaFilled(false);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		readSettingUseCase = new ReadSettingUseCase();
		textFieldPricePersonHighSeason.setText(readSettingUseCase.getPricePersonHighSeason().toString());
		textFieldPricePersonLowSeason.setText(readSettingUseCase.getPricePersonLowSeason().toString());
		textFieldPriceDogHighSeason.setText(readSettingUseCase.getPriceDogHighSeason().toString());
		textFieldPriceDogLowSeason.setText(readSettingUseCase.getPriceDogLowSeason().toString());
		textFieldPriceElectricityHighSeason.setText(readSettingUseCase.getPriceElectricityHighSeason().toString());
		textFieldPriceElectricityLowSeason.setText(readSettingUseCase.getPriceElectricityLowSeason().toString());
		textFieldMonthsHighSeason.setText(String.join(", ", readSettingUseCase.getMonthsHighSeason().stream().map((m) -> m.toString()).collect(Collectors.toList())));
		textFieldMonthsLowSeason.setText(String.join(", ", readSettingUseCase.getMonthsLowSeason().stream().map((m) -> m.toString()).collect(Collectors.toList())));
	}
}
