import javax.swing.JFrame;
import javax.swing.JPanel;

JFrame f = new JFrame();
        f.setSize(20,20);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Snake");
        f.setLocation(100, 100); //standaard in de hoek van het scherm
        JPanel hoofdpaneel = new BallPanel();
        f.add(hoofdpaneel);
        f.setVisible(true);

}
public static void main(String[] args) {
	
	new GameFrame();