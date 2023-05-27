package GIU;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Batalla {

	private JFrame frame;
	private static Batalla instancia;

    private JLabel lblPuntosVidaJugador;
    private JButton btnAtaque1;
    private JButton btnAtaque2;
    private JButton btnAtaque3;
    private JLabel lblPuntosVidaEnemigo;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Batalla window = new Batalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Batalla() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblPuntosVidaEnemigo = new JLabel("New label");
		lblPuntosVidaEnemigo.setForeground(new Color(255, 255, 255));
		lblPuntosVidaEnemigo.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		lblPuntosVidaEnemigo.setBounds(452, 135, 199, 39);
		frame.getContentPane().add(lblPuntosVidaEnemigo);
		
		JLabel lblPuntosEnemigo = new JLabel("Puntos:");
		lblPuntosEnemigo.setForeground(new Color(255, 255, 255));
		lblPuntosEnemigo.setFont(new Font("Lucida Console", Font.BOLD, 20));
		lblPuntosEnemigo.setBounds(452, 110, 97, 14);
		frame.getContentPane().add(lblPuntosEnemigo);
		
		lblPuntosVidaJugador = new JLabel("New label");
		lblPuntosVidaJugador.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblPuntosVidaJugador.setBounds(452, 470, 199, 39);
		frame.getContentPane().add(lblPuntosVidaJugador);
		
		JLabel lblPuntosJugador = new JLabel("Puntos:");
		lblPuntosJugador.setFont(new Font("Lucida Console", Font.BOLD, 20));
		lblPuntosJugador.setBounds(452, 445, 97, 14);
		frame.getContentPane().add(lblPuntosJugador);
		
		btnAtaque3 = new JButton("Ataque 3");
		btnAtaque3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtaque3.setFont(new Font("Lucida Console", Font.BOLD, 15));
		btnAtaque3.setBounds(288, 488, 116, 23);
		btnAtaque3.setBorder(null);
        btnAtaque3.setOpaque(false);
        btnAtaque3.setContentAreaFilled(false);
        btnAtaque3.setBorderPainted(false);
		frame.getContentPane().add(btnAtaque3);
		
		btnAtaque2 = new JButton("Ataque 2");
		btnAtaque2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtaque2.setFont(new Font("Lucida Console", Font.BOLD, 15));
		btnAtaque2.setBounds(288, 441, 116, 23);
		btnAtaque2.setBorder(null);
        btnAtaque2.setOpaque(false);
        btnAtaque2.setContentAreaFilled(false);
        btnAtaque2.setBorderPainted(false);
		frame.getContentPane().add(btnAtaque2);
		
		btnAtaque1 = new JButton("Ataque 1");
		btnAtaque1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtaque1.setFont(new Font("Lucida Console", Font.BOLD, 15));
		btnAtaque1.setBounds(288, 396, 116, 23);
		btnAtaque1.setBorder(null);
        btnAtaque1.setOpaque(false);
        btnAtaque1.setContentAreaFilled(false);
        btnAtaque1.setBorderPainted(false);
		frame.getContentPane().add(btnAtaque1);
		
		JLabel lblPokemonEnemigo = new JLabel("enemigo");
		lblPokemonEnemigo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblPokemonEnemigo.setBounds(601, 217, 143, 142);
		frame.getContentPane().add(lblPokemonEnemigo);
		
		JLabel lblPokemon = new JLabel("");
		lblPokemon.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblPokemon.setBounds(124, 384, 143, 142);
		frame.getContentPane().add(lblPokemon);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\batallabien.jpg"));
		lblFondo.setBounds(-125, -63, 899, 613);
		frame.getContentPane().add(lblFondo);
	}

	
	
	
	
	
	
	

	    public static Batalla getInstancia() {
	        return instancia;
	    }


		public void mostrarMensaje(String mensaje) {
			
		}



}
