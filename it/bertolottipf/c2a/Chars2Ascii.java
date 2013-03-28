package it.bertolottipf.c2a;

// import eventi

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//import grafica
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;



// tipi di layout voluti
import java.awt.FlowLayout;
import java.awt.GridLayout;



public class Chars2Ascii extends JFrame {
		
	/**
	 * Versione 3.0.0
	 */
	private static final long serialVersionUID = 6L;
	
	private JPopupMenu popup;
	protected Action cutAction;
	protected Action copyAction;
	protected Action pasteAction;
	//JTextArea textarea;
	
	
	
	private JTextArea jtaChar;
	private JButton charsToAscii;
	JTable table;
	//JPopupMenu popup;
	JFrame frame;
	private final String[] colHeads = { "Char", "Ascii" };
	private Object[][] data = {{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}};
	// Creo il modello di tabella dando i dati e le colonne e dicendo che la tabella non è editabile
	DefaultTableModel model = new DefaultTableModel(data,colHeads) {
		public boolean isCellEditable(int row, int col) {
			return false;
		}
	};
	
	
	// costruttore per il programma grafico
	public Chars2Ascii() {
		try {
			
			// Creazione della la finestra principale
			frame = new JFrame("Chars2Ascii");
			frame.setSize(700, 304);
			frame.setResizable(false);
			frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
			// Creazione la barra menù
			JMenuBar menubar = new JMenuBar();
			JMenu file = new JMenu("File");
			ImageIcon fileTabIco = new ImageIcon(
	            Chars2Ascii.class.getResource("imgs/table.png"));
			JMenuItem fileTab = new JMenuItem("Tabella ascii", fileTabIco);
			fileTab.addActionListener(new TabActionListener());
			file.add(fileTab);
			ImageIcon fileCloseIco = new ImageIcon(
	            Chars2Ascii.class.getResource("imgs/exit.png"));
			JMenuItem fileClose = new JMenuItem("Close", fileCloseIco);
			fileClose.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent event) { System.exit(0); } });
			file.add(fileClose);
			JMenu about = new JMenu("Help");
			ImageIcon helpAboutIco = new ImageIcon(
	            Chars2Ascii.class.getResource("imgs/info.png"));
			JMenuItem helpAbout = new JMenuItem("About", helpAboutIco);
			helpAbout.addActionListener(new AboutActionListener());
			about.add(helpAbout);
			menubar.add(file);
			menubar.add(about);
			frame.setJMenuBar(menubar);
			
			
			
			// Contenitore
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel);
			GridLayout gl = new GridLayout(1, 3);
			panel.setLayout(gl);
			
			// Condetitore textarea
			JPanel panelLeft = new JPanel();
			panelLeft.setLayout(new FlowLayout());
			panel.add(panelLeft);
			
			// Condetitore botton
			JPanel panelCenter = new JPanel();
			panelCenter.setLayout(new FlowLayout());
			panel.add(panelCenter);
			
			// Contenitore tabella
			JPanel panelRight = new JPanel();
			panelRight.setLayout(new FlowLayout());
			panel.add(panelRight);			
			
			
			
			jtaChar = new JTextArea(15,20);
			jtaChar.setLineWrap(true);
			jtaChar.setWrapStyleWord(true);
			JScrollPane areaScrollPane = new JScrollPane(jtaChar);
			areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			areaScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			panelLeft.add(areaScrollPane);
			
			
			
			// popup tasto destro del mouse
			createActions();
			popup = new JPopupMenu();
			popup.add(cutAction);
			popup.add(copyAction);
			popup.add(pasteAction);



			
			
			// Aggiunge un MouseListener al componente che deve mostrare il menu
		    MouseListener popupListener1 = new PopupListener();
		    jtaChar.addMouseListener(popupListener1);
		    
		    
		   
		  
		    
		    
			
			charsToAscii = new JButton("« Char2Ascii »");
			JTextArea a = new JTextArea("\n\n\n\n\n\n\n");
			panelCenter.add(a);
			panelCenter.add(charsToAscii, FlowLayout.CENTER);

			
			
			
			int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
			int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
			
			
			
			
			table = new JTable(model);
			table.setPreferredScrollableViewportSize(table.getPreferredSize());
			
			// scoll della tabella
			JScrollPane jsp3 = new JScrollPane(table, v, h);
			panelRight.add(jsp3);
			
			// definisco il comportamento degli oggetti
			charsToAscii.addActionListener(new ButtonActionListener());
			
			
			frame.setVisible(true);
			
		} catch(Exception e) {
			
		}
		
	} // fine costruttore
	
	
	
	// Azione tasto destro del mouse su jtaChars
	class PopupListener extends MouseAdapter {
	   public void mousePressed(MouseEvent e) {
		   if (e.isPopupTrigger()) {
			   popup.show(e.getComponent(),e.getX(), e.getY());
		   }
	   }
	   public void mouseReleased(MouseEvent e) {
		   if (e.isPopupTrigger()) {
			   	popup.show(e.getComponent(),e.getX(), e.getY());
		   }
	   }
   }
	
	// Azioni del menù popup
	protected void createActions() {
		cutAction = new AbstractAction("taglia") {
			public void actionPerformed(ActionEvent e) {
				jtaChar.cut();
			}
		};
		copyAction = new AbstractAction("copia") {
			public void actionPerformed(ActionEvent e) {
				jtaChar.copy();
			}
		};
		pasteAction = new AbstractAction("incolla") {
			public void actionPerformed(ActionEvent e) {
				jtaChar.paste();
			}
		};
	}
	
	
	
	
	
	// Azione del sottomenù tabella ascii
	class TabActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			Tabella tab = new Tabella();
			tab.setVisible(true);
		}
	}
	
	// Azione del sottomenù about
	class AboutActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(frame, "Chars2Ascii v. 3.0.0\n" + 
												 "by BERTOLOTTI Paolo Francesco\n");
		}
	}
	
	
	// Azione del bottone CharsToAscii
	class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			
			
			// Pulisco la tabella, qualora sia sporca
			while (model.getRowCount() > 0) {
				model.removeRow(0);
			}
						
			// Prendo il testo contenuto della jtextarea
			String contenutoJtfChar = jtaChar.getText().toString();
			
			int i = 0;
			int col = 0;
			int row = 0;
			boolean firstCol = true;
			for ( i = 0; i < contenutoJtfChar.length(); i++ ) {
				
				String col2 = null;
				String col1 = null;
				
				char c = contenutoJtfChar.charAt(i);
				col1 = Character.toString(c);
				int j = (int) c;
				col2 = Integer.toString(j);
				
				if (j == 32) {
					col1 = "'SP'";
				}
				if (j == 10) {
					col1 = "'NR'";
				}
				
				model.insertRow(table.getRowCount(),new Object[]{col1, col2});
				table.getColumnModel().getColumn(0).setPreferredWidth(50);
				table.getColumnModel().getColumn(0).setMaxWidth(100);
				table.getColumnModel().getColumn(0).setMinWidth(30);
				table.getColumnModel().getColumn(1).setPreferredWidth(50);
				table.getColumnModel().getColumn(1).setMaxWidth(100);
				table.getColumnModel().getColumn(1).setMinWidth(30);
			}
			
		
		}
	
	}
	
	// il metodo main
	public static void main(String[] args) {
		Chars2Ascii simple = new Chars2Ascii();
	}
}
