package it.bertolottipf.c2a;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabella extends JFrame {
	
	
	public Tabella() {
		String[] columnNames = {"Ascii", "Carattere"};
		
		Object[][] data = {
			    {"0", "Null"},
			    {"1", "Inizio intestazione"},
			    {"2", "inizio testo"},
			    {"3", "fine testo"},
			    {"4", "fine trasmissione"},
			    {"5", "richiesta di informazioni"},
			    {"6", "riconosci"},
			    {"7", "campana"},
			    {"8", "backspace"},
			    {"9", "tabulazione orizzontale"},
			    {"10", "avanzamento riga/nuova riga"},
			    {"11", "tabulazione verticale"},
			    {"12", "avanzamento carta/nuova pagina"},
			    {"13", "ritorno a capo"},
			    {"14", "carattere di controllo SO"},
			    {"15", "carattere di controllo SI"},
			    {"16", "escape collegamento dati"},
			    {"17", "controllo periferica 1"},
			    {"18", "controllo periferica 2"},
			    {"19", "controllo periferica 3"},
			    {"20", "controllo periferica 4"},
			    {"21", "riconoscimento negativo"},
			    {"22", "inattivo sincrono"},
			    {"23", "fine trasmissione"},
			    {"24", "annulla"},
			    {"25", "fine supporto"},
			    {"26", "sostituisci"},
			    {"27", "escape"},
			    {"28", "separatore di file"},
			    {"29", "separatore di gruppi"},
			    {"30", "separatore di record"},
			    {"31", "separatore di unit�"},
			    
			    {"32", "spazio"},
			    {"33", "!"},
			    {"34", "\""},
			    {"35", "#"},
			    {"36", "$"},
			    {"37", "%"},
			    {"38", "&"},
			    {"39", "'"},
			    {"40", "("},
			    {"41", ")"},
			    {"42", "*"},
			    {"43", "+"},
			    {"44", ","},
			    {"45", "-"},
			    {"46", "."},
			    {"47", "/"},
			    {"48", "0"},
			    {"49", "1"},
			    {"50", "2"},
			    {"51", "3"},
			    {"52", "4"},
			    {"53", "5"},
			    {"54", "6"},
			    {"55", "7"},
			    {"56", "8"},
			    {"57", "9"},
			    {"58", ":"},
			    {"59", ";"},
			    {"60", "<"},
			    {"61", "="},
			    {"62", ">"},
			    {"63", "?"},
			    {"64", "@"},
			    {"65", "A"},
			    {"66", "B"},
			    {"67", "C"},
			    {"68", "D"},
			    {"69", "E"},
			    {"70", "F"},
			    {"71", "G"},
			    {"72", "H"},
			    {"73", "I"},
			    {"74", "J"},
			    {"75", "K"},
			    {"76", "L"},
			    {"77", "M"},
			    {"78", "N"},
			    {"79", "O"},
			    {"80", "P"},
			    {"81", "Q"},
			    {"82", "R"},
			    {"83", "S"},
			    {"84", "T"},
			    {"85", "U"},
			    {"86", "V"},
			    {"87", "w"},
			    {"88", "X"},
			    {"89", "Y"},
			    {"90", "Z"},
			    {"91", "["},
			    {"92", "\\"},
			    {"93", "]"},
			    {"94", "^"},
			    {"95", "_"},
			    {"96", "`"},
			    {"97", "a"},
			    {"98", "b"},
			    {"99", "c"},
			    {"100", "d"},
			    {"101", "e"},
			    {"102", "f"},
			    {"103", "g"},
			    {"104", "h"},
			    {"105", "i"},
			    {"106", "j"},
			    {"107", "k"},
			    {"108", "l"},
			    {"109", "m"},
			    {"110", "n"},
			    {"111", "o"},
			    {"112", "p"},
			    {"113", "q"},
			    {"114", "r"},
			    {"115", "s"},
			    {"116", "t"},
			    {"117", "u"},
			    {"118", "v"},
			    {"119", "w"},
			    {"120", "x"},
			    {"121", "y"},
			    {"122", "z"},
			    {"123", "{"},
			    {"124", "|"},
			    {"125", "}"},
			    {"126", "~"},
			    {"127", "CANC"},
			    
			    {"128", "�"},
			    {"129", "�"},
			    {"130", "�"},
			    {"131", "�"},
			    {"132", "�"},
			    {"133", "�"},
			    {"134", "�"},
			    {"135", "�"},
			    {"136", "�"},
			    {"137", "�"},
			    {"138", "�"},
			    {"139", "�"},
			    {"140", "�"},
			    {"141", "�"},
			    {"142", "�"},
			    {"143", "�"},
			    {"144", "�"},
			    {"145", "�"},
			    {"146", "�"},
			    {"147", "�"},
			    {"148", "�"},
			    {"149", "�"},
			    {"150", "�"},
			    {"151", "�"},
			    {"152", "�"},
			    {"153", "�"},
			    {"154", "�"},
			    {"155", "�"},
			    {"156", "�"},
			    {"157", "�"},
			    {"158", "P"},
			    {"159", "�"},
			    {"160", "�"},
			    {"161", "�"},
			    {"162", "�"},
			    {"163", "�"},
			    {"164", "�"},
			    {"165", "�"},
			    {"166", "�"},
			    {"167", "�"},
			    {"168", "�"},
			    {"169", "�"},
			    {"170", "�"},
			    {"171", "�"},
			    {"172", "�"},
			    {"173", "�"},
			    {"174", "�"},
			    {"175", "�"},
			    {"176", "�"},
			    {"177", "�"},
			    {"178", "�"},
			    {"179", "�"},
			    {"180", "�"},
			    {"181", "�"},
			    {"182", "�"},
			    {"183", "+"},
			    {"184", "+"},
			    {"185", "�"},
			    {"186", "�"},
			    {"187", "+"},
			    {"188", "+"},
			    {"189", "+"},
			    {"190", "+"},
			    {"191", "+"},
			    {"192", "+"},
			    {"193", "-"},
			    {"194", "-"},
			    {"195", "+"},
			    {"196", "-"},
			    {"197", "+"},
			    {"198", "�"},
			    {"199", "�"},
			    {"200", "+"},
			    {"201", "+"},
			    {"202", "-"},
			    {"203", "-"},
			    {"204", "�"},
			    {"205", "-"},
			    {"206", "+"},
			    {"207", "-"},
			    {"208", "-"},
			    {"209", "-"},
			    {"210", "-"},
			    {"211", "+"},
			    {"212", "�"},
			    {"213", "+"},
			    {"214", "+"},
			    {"215", "+"},
			    {"216", "+"},
			    {"217", "+"},
			    {"218", "+"},
			    {"219", "�"},
			    {"220", "_"},
			    {"221", "�"},
			    {"222", "�"},
			    {"223", "�"},
			    {"224", "a"},
			    {"225", "�"},
			    {"226", "G"},
			    {"227", "p"},
			    {"228", "S"},
			    {"229", "s"},
			    {"230", "�"},
			    {"231", "t"},
			    {"232", "F"},
			    {"233", "T"},
			    {"234", "O"},
			    {"235", "d"},
			    {"236", "8"},
			    {"237", "f"},
			    {"238", "e"},
			    {"239", "n"},
			    {"240", "="},
			    {"241", "�"},
			    {"242", "="},
			    {"243", "="},
			    {"244", "("},
			    {"245", ")"},
			    {"246", "�"},
			    {"247", "�"},
			    {"248", "�"},
			    {"249", "�"},
			    {"250", "�"},
			    {"251", "v"},
			    {"252", "n"},
			    {"253", "�"},
			    {"254", "�"},
			    {"255", " "}
		};
		
		setSize(485, 455);
		setTitle("Tabella Ascii");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel tabPanel = new JPanel();
		getContentPane().add(tabPanel);
		tabPanel.setLayout(new FlowLayout(3));
		
		JTable table = new JTable(data, columnNames);
		
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);

		
		
		
		tabPanel.add(scrollPane);
		
		
		
		

	}
	
	/*public static void main(String[] args) {
		Tabella tab = new Tabella();
		tab.setVisible(true);
	}*/
}

	
	