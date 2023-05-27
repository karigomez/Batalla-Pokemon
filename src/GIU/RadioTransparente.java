package GIU;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RadioTransparente extends JRadioButton{
	
	 public RadioTransparente(String text) {
	        super(text);
	        setOpaque(false);
	        setContentAreaFilled(false);
	        setBorderPainted(false);
	        setFocusPainted(false);
	        setFont(new Font("Hack Nerd Font", Font.PLAIN, 12));
	        setForeground(Color.WHITE);
	 }
}
