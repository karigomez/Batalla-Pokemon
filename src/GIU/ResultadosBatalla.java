package GIU;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResultadosBatalla {

	private JFrame frame;
	private JLabel lblDañoJugador;
	private JLabel lblDañoEnemigo;
	private JLabel lblGanadorBatalla;
	private JLabel lblInformacion;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultadosBatalla window = new ResultadosBatalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ResultadosBatalla() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setTitle("RESULTADO BATALLA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Lucida Console", Font.BOLD, 15));
		btnSalir.setBounds(655, 503, 89, 23);
		btnSalir.setBorder(null);
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblTitulo = new JLabel("RESULTADO DE LA BATALLA FINAL");
		lblTitulo.setFont(new Font("Lucida Console", Font.BOLD, 30));
		lblTitulo.setBounds(117, 61, 570, 50);
		frame.getContentPane().add(lblTitulo);
		
		lblDañoEnemigo = new JLabel("");
		lblDañoEnemigo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblDañoEnemigo.setBounds(549, 177, 129, 64);
		frame.getContentPane().add(lblDañoEnemigo);
		
		lblDañoJugador = new JLabel("");
		lblDañoJugador.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblDañoJugador.setBounds(119, 177, 129, 64);
		frame.getContentPane().add(lblDañoJugador);
		
		lblGanadorBatalla = new JLabel("");
		lblGanadorBatalla.setBounds(269, 308, 300, 50);
		lblGanadorBatalla.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblGanadorBatalla.setFont(new Font("Hack Nerd Font", Font.BOLD, 25));
		frame.getContentPane().add(lblGanadorBatalla);
		
		lblInformacion = new JLabel("");
		lblInformacion.setBounds(269, 380, 300, 107);
		lblInformacion.setFont(new Font("Hack Nerd Font", Font.BOLD, 25));
		lblInformacion.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		frame.getContentPane().add(lblInformacion);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\imagenbien.jpg"));
		lblFondo.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(lblFondo);
	}
}
