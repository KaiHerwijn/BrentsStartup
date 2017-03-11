import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FramePaint extends JFrame implements ActionListener{

	private int x;
	
	public FramePaint() throws HeadlessException {
		super("Paint");
		setSize(800, 600);
	    setLayout(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    JButton but = new JButton("links");
	    but.addActionListener(this);
	    but.setBounds(5,  5,  50, 15);
	    add(but);
	    x = 5;
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(128, 0, 0));
		g.fillRect(x, 100, 100, 100);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(x < getSize().getWidth()) {
			x = x + 10;
			repaint();
		}
		
		
	}
	
	
}
