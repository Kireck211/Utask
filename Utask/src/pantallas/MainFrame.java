package pantallas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private JPanel header;
	private PanelBarraDeOpciones options;
	private JPanel board; 

	public MainFrame() {
		
		getContentPane().setBackground(new Color(255,255,255));
		header = new HeaderPanel();
		options = new PanelBarraDeOpciones();
//		board = new PanelBoard();
//		board = new AjustesBoard();
//		header= new AjustesPanel();
		board = new TareasBoard();
		header = new TareasPanel();
	
		
		setPanels();
		
		options.setButtonListener(new ButtonListener() {
			public void actionOcurred() {
				board.setVisible(false);
			}
			
		});

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(1100, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void setPanels() {

		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		//////////// Primera Fila ////////////
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 100;
		gc.weighty = 0.0;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridwidth = 2;
		add(header, gc);

		//////////// Segunda Fila ////////////
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 10;
		gc.weighty = 900;
		gc.gridwidth = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(options, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		gc.weightx = 90;
		add(board, gc);
	}

}
