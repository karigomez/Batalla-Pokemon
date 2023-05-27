package GIU;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuBar;


public class Seleccion {

	private JFrame frame;
	private JPanel contentPane;
	ButtonGroup grupo = new ButtonGroup();
	ButtonGroup grupo1 = new ButtonGroup();
	private boolean bulbasaurSeleccionado = false;
	private boolean charmanderSeleccionado = false;
	private boolean squirtleSeleccionado = false;
	private JRadioButton radBulbasaur;
	private JRadioButton radCharmander;
	private JRadioButton radSquirtle;
	private JRadioButton radEntrenador1;
	private JRadioButton radEntrenador2;
	private JRadioButton radEntrenador3;
	private JRadioButton radEntrenador4;
	private JLabel lblFondo;
	private JLabel lblAsh;
	private JLabel lblBrock;
	private JLabel lblSurge;
	private JLabel lblMitsy;
	private JLabel lblBulbasaur;
	private JLabel lblCharmander;
	private JLabel lblSquirtle;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seleccion window = new Seleccion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Seleccion() {
		initialize();
		grupo1.add(radEntrenador1);
		grupo1.add(radEntrenador2);
		grupo1.add(radEntrenador3);
		grupo1.add(radEntrenador4);
		grupo.add(radBulbasaur);
		grupo.add(radCharmander);
		grupo.add(radSquirtle);
		
		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\fondo2bien.jpg"));
		lblFondo.setBounds(-61, 0, 845, 561);
		contentPane.add(lblFondo);
		
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSquirtle = new JLabel("");
		lblSquirtle.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\squirtlebien.png"));
		lblSquirtle.setBounds(555, 365, 123, 100);
		contentPane.add(lblSquirtle);
		
		lblCharmander = new JLabel("");
		lblCharmander.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\charmandersi.png"));
		lblCharmander.setBounds(331, 365, 123, 100);
		contentPane.add(lblCharmander);
		
		lblBulbasaur = new JLabel("");
		lblBulbasaur.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\bulbasaurbien.jpg"));
		lblBulbasaur.setBounds(106, 364, 123, 100);
		contentPane.add(lblBulbasaur);
		
		lblMitsy = new JLabel("");
		lblMitsy.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\mitsybien.jpg"));
		lblMitsy.setBounds(612, 126, 106, 111);
		contentPane.add(lblMitsy);
		
		lblSurge = new JLabel("");
		lblSurge.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\surgebien.jpg"));
		lblSurge.setBounds(443, 126, 94, 111);
		contentPane.add(lblSurge);
		
		lblBrock = new JLabel("");
		lblBrock.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\brockbien.jpg"));
		lblBrock.setBounds(249, 126, 106, 111);
		contentPane.add(lblBrock);
		
		lblAsh = new JLabel("");
		lblAsh.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\ashbien.jpg"));
		lblAsh.setBounds(67, 126, 106, 111);
		contentPane.add(lblAsh);

		JLabel lblSeleccionarEntrenador = new JLabel("SELECCIONA TU ENTRENADOR POKEMON");
		lblSeleccionarEntrenador.setForeground(new Color(255, 255, 255));
		lblSeleccionarEntrenador.setFont(new Font("Lucida Console", Font.BOLD, 31));
		lblSeleccionarEntrenador.setBounds(57, 61, 679, 47);
		contentPane.add(lblSeleccionarEntrenador);

		JLabel lblSeleccionarPokemon = new JLabel("SELECCIONA TU POKEMON PARA LA BATALLA");
		lblSeleccionarPokemon.setForeground(new Color(255, 255, 255));
		lblSeleccionarPokemon.setFont(new Font("Lucida Console", Font.BOLD, 30));
		lblSeleccionarPokemon.setBounds(37, 303, 784, 61);
		contentPane.add(lblSeleccionarPokemon);
		
		RadioTransparente radEntrenador1 = new RadioTransparente(("ASH KETCHUM"));
		radEntrenador1.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		radEntrenador1.setFont(new Font("Lucida Console", Font.BOLD, 15));
		radEntrenador1.setBounds(57, 248, 133, 23);
		contentPane.add(radEntrenador1);

		RadioTransparente radEntrenador2 = new RadioTransparente(("BROCK BROCK"));
		radEntrenador2.setFont(new Font("Lucida Console", Font.BOLD, 15));
		radEntrenador2.setBounds(239, 248, 133, 23);
		contentPane.add(radEntrenador2);

		RadioTransparente radEntrenador3 = new RadioTransparente(("LT. SURGE"));
		radEntrenador3.setFont(new Font("Lucida Console", Font.BOLD, 15));
		radEntrenador3.setBounds(427, 248, 123, 23);
		contentPane.add(radEntrenador3);

		RadioTransparente radEntrenador4 = new RadioTransparente(("MITSY MITSY"));
		radEntrenador4.setFont(new Font("Lucida Console", Font.BOLD, 15));
		radEntrenador4.setBounds(589, 248, 152, 23);
		contentPane.add(radEntrenador4);

		RadioTransparente radBulbasaur = new RadioTransparente(("BULBASAUR"));
		radBulbasaur.setFont(new Font("Lucida Console", Font.BOLD, 15));
		radBulbasaur.setBounds(90, 472, 152, 23);
		contentPane.add(radBulbasaur);
	
		RadioTransparente radCharmander = new RadioTransparente(("CHARMANDER"));
		radCharmander.setFont(new Font("Lucida Console", Font.BOLD, 15));
		radCharmander.setBounds(313, 472, 152, 23);
		contentPane.add(radCharmander);

		RadioTransparente radSquirtle = new RadioTransparente(("SQUIRTLE"));
		radSquirtle.setFont(new Font("Lucida Console", Font.BOLD, 15));
		radSquirtle.setBounds(543, 472, 152, 23);
		contentPane.add(radSquirtle);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Lucida Console", Font.BOLD, 15));
		btnSiguiente.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnSiguiente.setBounds(668, 519, 106, 31);
		btnSiguiente.setBorder(null);
        btnSiguiente.setOpaque(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setBorderPainted(false);
		contentPane.add(btnSiguiente);
		btnSiguiente.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        bulbasaurSeleccionado = radBulbasaur.isSelected();
		        charmanderSeleccionado = radCharmander.isSelected();
		        squirtleSeleccionado = radSquirtle.isSelected();
		    }
		});
		
		
	}
}
