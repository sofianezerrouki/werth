import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import javafx.scene.control.ComboBox;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class MainFrame {

	private JFrame frame;
	private JTextField werth;//une Text fild pour ajouter la valeure de Tarika
	
	private static boolean leParentExiste = false ;
	private static boolean LaMereExiste = false ;
	private static int  nbrFils ;
	private static int nbrGar  ;
	private static int nbrFrr  ;
	private static int nbrSis  ;
	private static int nbrZawdjat  ;
	//Nasib kol fard
	private static double nasibParent = 0;
	private static double  nasibMere = 0 ;
	private static double  nasibKolBint = 0;
	private static double nasibGar = 0 ;
	private static double nasibFrr = 0 ;
	private static double nasibSis = 0 ;
	private static double nasibZawdjat =0 ;
	private static double nasibLbintLwahida = 0;
	private static double nasibLbanat = 0;
	
	//les JCheckBox
	JComboBox mam;
	JComboBox parent;
	JComboBox enfant;
	JComboBox fils;
	JComboBox sister;
	JComboBox dam;
	JComboBox frr;
	JTable jt;
	private JLabel d;
	private JLabel a;
	private JLabel b;
	private JLabel c;
	private JLabel e;
	private JLabel f;
	private JLabel g;
	private JLabel h;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 810, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		inttialise();
		
		JButton btnCalculer = new JButton("\u062D\u0633\u0627\u0628");
		btnCalculer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nbrFils = getNbrInCheckBox(fils) ;
				nbrGar = getNbrInCheckBox(enfant) ;
				nbrFrr = getNbrInCheckBox(frr) ;
				nbrSis = getNbrInCheckBox(sister) ;
				nbrZawdjat = getNbrInCheckBox(dam) ;
				
				if(parent.getSelectedItem() == "نعم") {
					leParentExiste = true ;	
				}
				else {
					leParentExiste = true ;					
				}
				if(mam.getSelectedItem() == "نعم") {
					LaMereExiste = true;
				}
				else {
					LaMereExiste = false ;	
				}
				nasibParent = 0;
				nasibMere = 0 ;
				nasibKolBint = 0;
				nasibGar = 0 ;
				nasibFrr = 0 ;
				nasibSis = 0 ;
				nasibZawdjat =0 ;
				nasibLbintLwahida = 0;
				nasibLbanat = 0;
				//regle1Fonction 
				
				calculeResulta(nbrGar,nbrFils,leParentExiste,LaMereExiste,nbrFrr,nbrSis,nbrZawdjat);
			}

			
		});
		btnCalculer.setBounds(441, 350, 147, 37);
		frame.getContentPane().add(btnCalculer);
		
		 enfant = new JComboBox();
		enfant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		enfant.setBounds(579, 104, 91, 26);
		frame.getContentPane().add(enfant);
		
		JLabel label = new JLabel("\u0639\u062F\u062F \u0627\u0644\u0623\u0648\u0644\u0627\u062F");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setForeground(Color.ORANGE);
		label.setBounds(700, 104, 84, 37);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0639\u062F\u062F \u0627\u0644\u0628\u0646\u0627\u062A");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setForeground(Color.ORANGE);
		label_1.setBounds(700, 152, 84, 37);
		frame.getContentPane().add(label_1);
		
		 fils = new JComboBox();
		fils.setBounds(579, 163, 91, 26);
		frame.getContentPane().add(fils);
		
		JLabel label_2 = new JLabel("\u0627\u0644\u0623\u0628");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setForeground(Color.ORANGE);
		label_2.setBounds(700, 265, 84, 37);
		frame.getContentPane().add(label_2);
		
		 parent = new JComboBox();
		parent.setBounds(579, 276, 91, 26);
		frame.getContentPane().add(parent);
		
		JLabel label_3 = new JLabel("\u0627\u0644\u0623\u0645");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setForeground(Color.ORANGE);
		label_3.setBounds(700, 217, 84, 37);
		frame.getContentPane().add(label_3);
		
		 mam = new JComboBox();
		mam.setBounds(579, 228, 91, 26);
		frame.getContentPane().add(mam);
		
		JLabel label_5 = new JLabel("\u0639\u062F\u062F \u0627\u0644\u0632\u0648\u062C\u0627\u062A");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setForeground(Color.ORANGE);
		label_5.setBounds(459, 200, 84, 37);
		frame.getContentPane().add(label_5);
		
		 dam = new JComboBox();
		dam.setBounds(338, 205, 91, 26);
		frame.getContentPane().add(dam);
		
		JLabel label_6 = new JLabel("\u0639\u062F\u062F \u0627\u0644\u0623\u062E\u0648\u0627\u062A");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setForeground(Color.ORANGE);
		label_6.setBounds(459, 152, 84, 37);
		frame.getContentPane().add(label_6);
		
		 sister = new JComboBox();
		sister.setBounds(338, 157, 91, 26);
		frame.getContentPane().add(sister);
		
		 frr = new JComboBox();
		frr.setBounds(338, 104, 91, 26);
		frame.getContentPane().add(frr);
		
		JLabel label_7 = new JLabel("\u0639\u062F\u062F \u0627\u0644\u0625\u062E\u0648\u0629");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setForeground(Color.ORANGE);
		label_7.setBounds(459, 104, 84, 37);
		frame.getContentPane().add(label_7);
		
		werth = new JTextField();
		werth.setForeground(Color.RED);
		werth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		werth.setBounds(441, 42, 106, 37);
		frame.getContentPane().add(werth);
		werth.setColumns(10);
		
		boucle(enfant);
		boucle(fils);
		boucle(sister);
		boucle(frr);
		boucleZ(dam);
		boucleP(mam);
		boucleP(parent);
		
		
		
		
	}
	//fonctions et prédicat 
	int getNbrInCheckBox(JComboBox c ) {
		int nbr = 0;
	    String n = (String) c.getSelectedItem();
	    if(n == "لا") {
	    	nbr = 0 ; 
	    }
	    else {
	    	nbr =extractIntVersion2(c.getSelectedItem().toString());
	    	
	    }
	    System.out.println(nbr);
		return nbr;
		
	}
	
	
	
	//get Tarika 
	double getTarika() {
		double w = Double.parseDouble(werth.getText());
		return w;
	}
	
	//Boucle pour seulement initialiser les ComboBox
	void boucle(JComboBox c) {
		c.addItem("لا");
		for(int i = 1;i<=20;i++) {
			c.addItem(""+i);
		}
		
	}
	void boucleZ(JComboBox c) {
		c.addItem("لا");
		for(int i = 1;i<=4;i++) {
			c.addItem(""+i);
		}
	}
	void boucleP(JComboBox c ) {
		c.addItem("لا");
		c.addItem("نعم");
	}
	
	public static Integer extractIntVersion2(String input) {
	    try (Scanner scanner = new Scanner(input)) {
	        if (scanner.hasNextInt()) {
	            return scanner.nextInt();
	        } else {
	            return null;
	        }
	    }
	}
	
	//La fonction principale de programme
	private void calculeResulta(int nbrGar, int nbrFils, boolean leParentExiste, boolean laMereExiste,
		int nbrFrr, int nbrSis, int nbrZawdjat) {
		
		System.out.println(getTarika());
		if(nbrGar > 0) {
			regle1(nbrGar, nbrFils);
		}else if(nbrFils>=1){
			double reste = 0;
			if(nbrFils == 1) {
				nasibLbintLwahida = (double)getTarika()/2;
				nasibLbanat = nasibLbintLwahida;
				 reste = (double)getTarika()/2;
			}else {
				nasibKolBint = (getTarika()*(double)2/(double)3)/(double)nbrFils;
				nasibLbanat = nasibKolBint*nbrFils;; 
				reste = getTarika()/2;
			}
			nasibParent = reste * ((double)1/6);
			nasibMere = reste * ((double)1/6);
			nasibZawdjat = reste*nbrZawdjat/8;
			nasibFrr = 0;
			nasibSis = 0;
		}
		else {
			//halat lkalala .
		}
		affich();	
	}
	
	//Aficher les résultas
		//initialiser 
	
	/**
	 * @param nbrGar
	 * @param nbrFils
	 */
	public void regle1(int nbrGar, int nbrFils) {
		//regle 01 
		
		nasibParent = 0;//la yarith
		nasibMere = 0 ;//la tarith
		nasibGar = (getTarika()*(double)1/(nbrFils+(nbrGar*2)))*2 ;
		nasibLbanat = getTarika() * ((double)1/(nbrFils+(nbrGar*2)));
	
		
		nasibFrr = 0 ;//la yarith
		nasibSis = 0 ;//la yarith
		nasibZawdjat =0 ;//la yarith
	}
	
	void inttialise() {
		JLabel label_4 = new JLabel("قيمة التركة");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setForeground(Color.ORANGE);
		label_4.setBounds(592, 47, 91, 28);
		frame.getContentPane().add(label_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(27, 58, 249, 355);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_9 = new JLabel("نصيب الأولاد");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setForeground(Color.BLUE);
		label_9.setBounds(150, 11, 89, 24);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("نصيب البنات");
		label_10.setForeground(Color.BLUE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_10.setBounds(150, 60, 89, 24);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("نصيب الأب");
		label_11.setForeground(Color.BLUE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(160, 115, 89, 24);
		panel.add(label_11);
		
		JLabel label_14 = new JLabel("نصيب الأم");
		label_14.setForeground(Color.BLUE);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setBounds(160, 172, 89, 24);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("نصيب الإخوة");
		label_15.setForeground(Color.BLUE);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_15.setBounds(141, 227, 89, 24);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("نصيب الأخوات");
		label_16.setForeground(Color.BLUE);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setBounds(131, 272, 108, 24);
		panel.add(label_16);
		
		 a = new JLabel("");
		a.setBackground(Color.WHITE);
		a.setForeground(Color.DARK_GRAY);
		a.setFont(new Font("Tahoma", Font.BOLD, 14));
		a.setBounds(21, 11, 100, 24);
		panel.add(a);
		
		 b = new JLabel("");
		b.setBackground(Color.WHITE);
		b.setForeground(Color.DARK_GRAY);
		b.setFont(new Font("Tahoma", Font.BOLD, 14));
		b.setBounds(21, 60, 100, 24);
		panel.add(b);
		
		d = new JLabel("");
		d.setForeground(Color.DARK_GRAY);
		d.setFont(new Font("Tahoma", Font.BOLD, 14));
		d.setBounds(21, 172, 100, 24);
		panel.add(d);
		
		 c = new JLabel("");
		c.setBackground(Color.WHITE);
		c.setForeground(Color.DARK_GRAY);
		c.setFont(new Font("Tahoma", Font.BOLD, 14));
		c.setBounds(21, 115, 100, 24);
		panel.add(c);
		
		JLabel label_13 = new JLabel("");
		label_13.setBackground(Color.WHITE);
		label_13.setForeground(Color.GREEN);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBounds(32, 172, 89, 24);
		panel.add(label_13);
		
		 e = new JLabel("");
		e.setBackground(Color.WHITE);
		e.setForeground(Color.DARK_GRAY);
		e.setFont(new Font("Tahoma", Font.BOLD, 14));
		e.setBounds(21, 227, 100, 24);
		panel.add(e);
		
		f = new JLabel("");
		f.setBackground(Color.WHITE);
		f.setForeground(Color.DARK_GRAY);
		f.setFont(new Font("Tahoma", Font.BOLD, 14));
		f.setBounds(21, 272, 100, 24);
		panel.add(f);
		
		JLabel label_17 = new JLabel("نصيب الزوجات");
		label_17.setForeground(Color.BLUE);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(131, 320, 108, 24);
		panel.add(label_17);
		
		g = new JLabel("");
		g.setForeground(Color.DARK_GRAY);
		g.setFont(new Font("Tahoma", Font.BOLD, 14));
		g.setBackground(Color.WHITE);
		g.setBounds(21, 320, 100, 24);
		panel.add(g);
		
		JLabel label_8 = new JLabel("قسمة التركة");
		label_8.setBounds(109, 25, 96, 30);
		frame.getContentPane().add(label_8);
		label_8.setBackground(Color.ORANGE);
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a.setText("0.00");
		b.setText("0.00");
		c.setText("0.00");
		d.setText("0.00");
		e.setText("0.00");
		f.setText("0.00");
		g.setText("0.00");
	}
	void affich() {
		a.setText(nasibGar + "");
		b.setText(nasibLbanat + "");
		c.setText(nasibParent+"");
		d.setText(nasibMere+"");
		e.setText(nasibFrr+"");
		f.setText(nasibSis+"");
		g.setText(nasibZawdjat+"");
		
	}

}
