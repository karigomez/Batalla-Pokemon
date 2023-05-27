package GIU;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configuracion {

    private JFrame frame;
    private JRadioButton radFacil;
    private JRadioButton radMedia;
    private JRadioButton radDificil;
    private JRadioButton radEstadioPokemon;
    private JRadioButton radHierbaAlta;
    private JRadioButton radCuevaOscura;
    private JRadioButton radLluvioso;
    private JRadioButton radSoleado;
    private JRadioButton radNublado;
    private JButton btnSiguiente;
    ButtonGroup grupoDificultad = new ButtonGroup();
    ButtonGroup grupoEntorno = new ButtonGroup();
    ButtonGroup grupoClima = new ButtonGroup();
    private JLabel lblfFondo;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Configuracion window = new Configuracion();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Configuracion() {
        initialize();
        grupoDificultad.add(radFacil);
        grupoDificultad.add(radMedia);
        grupoDificultad.add(radDificil);
        grupoEntorno.add(radCuevaOscura);
        grupoEntorno.add(radEstadioPokemon);
        grupoEntorno.add(radHierbaAlta);
        grupoClima.add(radNublado);
        grupoClima.add(radSoleado);
        grupoClima.add(radLluvioso);
                
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblModoJuego = new JLabel("TU MODO DE JUEGO ES");
        lblModoJuego.setForeground(new Color(0, 0, 0));
        lblModoJuego.setFont(new Font("Lucida Console", Font.PLAIN, 44));
        lblModoJuego.setBounds(26, 57, 542, 41);
        contentPane.add(lblModoJuego);

        JLabel lblModoJuego_2 = new JLabel("1 vs 1");
        lblModoJuego_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblModoJuego_2.setFont(new Font("Lucida Console", Font.BOLD, 40));
        lblModoJuego_2.setBounds(547, 45, 208, 67);
        contentPane.add(lblModoJuego_2);

        JLabel lblDificultad = new JLabel("SELECCIONA LA DIFICULTAD DE LA PARTIDA");
        lblDificultad.setForeground(new Color(255, 255, 255));
        lblDificultad.setFont(new Font("Lucida Console", Font.BOLD, 30));
        lblDificultad.setHorizontalAlignment(SwingConstants.CENTER);
        lblDificultad.setBounds(26, 110, 733, 73);
        contentPane.add(lblDificultad);
        
        RadioTransparente radFacil = new RadioTransparente(("FACIL"));
        radFacil.setForeground(new Color(0, 0, 0));
        radFacil.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radFacil.setBounds(107, 190, 111, 23);
        contentPane.add(radFacil);

        RadioTransparente radMedia = new RadioTransparente(("MEDIA"));
        radMedia.setForeground(new Color(0, 0, 0));
        radMedia.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radMedia.setBounds(335, 190, 111, 23);
        contentPane.add(radMedia);

        RadioTransparente radDificil = new RadioTransparente(("DIFICIL"));
        radDificil.setForeground(new Color(0, 0, 0));
        radDificil.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radDificil.setBounds(537, 190, 111, 23);
        contentPane.add(radDificil);

        JLabel lblEntorno = new JLabel("SELECCIONA EL ENTORNO DE LA PARTIDA");
        lblEntorno.setForeground(new Color(255, 255, 255));
        lblEntorno.setHorizontalAlignment(SwingConstants.CENTER);
        lblEntorno.setFont(new Font("Lucida Console", Font.BOLD, 30));
        lblEntorno.setBounds(55, 231, 700, 73);
        contentPane.add(lblEntorno);

        RadioTransparente radEstadioPokemon = new RadioTransparente(("ESTADIO POKEMON"));
        radEstadioPokemon.setForeground(new Color(0, 0, 0));
        radEstadioPokemon.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radEstadioPokemon.setBounds(107, 311, 180, 23);
        contentPane.add(radEstadioPokemon);
   
        RadioTransparente radHierbaAlta = new RadioTransparente(("HIERBA ALTA"));
        radHierbaAlta.setForeground(new Color(0, 0, 0));
        radHierbaAlta.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radHierbaAlta.setVerticalAlignment(SwingConstants.BOTTOM);
        radHierbaAlta.setBounds(335, 311, 130, 23);
        contentPane.add(radHierbaAlta);

        RadioTransparente radCuevaOscura = new RadioTransparente(("CUEVA OSCURA"));
        radCuevaOscura.setForeground(new Color(0, 0, 0));
        radCuevaOscura.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radCuevaOscura.setBounds(548, 311, 147, 23);
        contentPane.add(radCuevaOscura);

        JLabel lblClima = new JLabel("SELECCIONA EL CLIMA DE LA PARTIDA");
        lblClima.setForeground(new Color(0, 0, 0));
        lblClima.setHorizontalAlignment(SwingConstants.CENTER);
        lblClima.setFont(new Font("Lucida Console", Font.BOLD, 33));
        lblClima.setBounds(55, 346, 700, 73);
        contentPane.add(lblClima);

        RadioTransparente radLluvioso = new RadioTransparente(("LLUVIOSO"));
        radLluvioso.setForeground(new Color(0, 0, 0));
        radLluvioso.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radLluvioso.setBounds(107, 426, 111, 23);
        contentPane.add(radLluvioso);

        RadioTransparente radSoleado = new RadioTransparente(("SOLEADO"));
        radSoleado.setForeground(new Color(0, 0, 0));
        radSoleado.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radSoleado.setBounds(335, 426, 111, 23);
        contentPane.add(radSoleado);

        RadioTransparente radNublado = new RadioTransparente(("NUBLADO"));
        radNublado.setForeground(new Color(0, 0, 0));
        radNublado.setFont(new Font("Lucida Console", Font.BOLD, 15));
        radNublado.setBounds(550, 426, 111, 23);
        contentPane.add(radNublado);

        btnSiguiente = new JButton("SIGUIENTE");
        btnSiguiente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnSiguiente.setFont(new Font("Lucida Console", Font.BOLD, 15));
        btnSiguiente.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        btnSiguiente.setBounds(649, 467, 120, 30);
		btnSiguiente.setBorder(null);
        btnSiguiente.setOpaque(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setBorderPainted(false);
        contentPane.add(btnSiguiente);
        
        lblfFondo = new JLabel("");
        lblfFondo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblfFondo.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\fondobien.jpg"));
        lblfFondo.setBounds(0, -72, 784, 583);
        contentPane.add(lblfFondo);
    }
}

