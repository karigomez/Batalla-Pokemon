package GIU;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Inicio {

    private JFrame frame;
    private JButton btnIniciar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Inicio window = new Inicio();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Inicio() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);

        btnIniciar = new JButton("Iniciar");
        btnIniciar.setBorder(new LineBorder(new Color(0, 128, 0), 4, true));
        btnIniciar.setBackground(new Color(0, 128, 0));
        btnIniciar.setForeground(new Color(0, 0, 0));
        btnIniciar.setFont(new Font("Hack Nerd Font", Font.BOLD, 20));
        btnIniciar.setOpaque(false);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setBorderPainted(false);
        btnIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acciones al hacer clic en el botón "Iniciar"
            }
        });
        btnIniciar.setBounds(289, 360, 250, 40);
		btnIniciar.setBorder(null);
        btnIniciar.setOpaque(false);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setBorderPainted(false);
        contentPane.add(btnIniciar);

        JLabel lblTitulo = new JLabel("BATALLA POKEMON");
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setFont(new Font("Lucida Console", Font.BOLD, 60));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(76, 256, 659, 50);
        
        contentPane.add(lblTitulo);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\karig\\OneDrive\\Imágenes\\imagenes\\fondobien.jpg"));
        lblNewLabel.setBounds(0, 0, 784, 561);
        contentPane.add(lblNewLabel);
    }
}

