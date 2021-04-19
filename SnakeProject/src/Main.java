
import java.awt.*;

import java.util.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame{
		

	
	public static void main(String[] args)
    {	//DisplayMode met 20x20 pixels, elke pixel is een blokje
		DisplayMode dm = new DisplayMode(20,20,16,DisplayMode.REFRESH_RATE_UNKNOWN);
		Main m=new Main();
		m.run(dm);
		
   }
	
	public void run(DisplayMode dm) {
		HashMap<String, Color> map = new  HashMap<String, Color>();
		map.put("Red", Color.RED);
		map.put("Green", Color.GREEN);
		map.put("Black", Color.BLACK);
		
		String ColorBackground = "Green";
		// Nu staat het op groen, maar het is de bedoeling dat het in een menu komt waarin je dan je kleur kan kiezen
		//Als je dan op een kleur klikt wordt de achtergrond jouw gekozen kleur
		setBackground(map.get(ColorBackground));
		//setForeground()
		//setFont(new Font("Calibri",Font.PLAIN,24));
		
		Screen s =new Screen();
		//KWABBERNOOT: deze Screen moeten we nog maken
		// https://www.youtube.com/watch?v=9wJqWfMXMMQ&ab_channel=thenewboston Dit is link video maar Screen.java moeten we nog maken
		try {
			s.setFullScreen(dm, this);
			
		}
		
	}
}
        





