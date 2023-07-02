package jumpingshape;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel
{

	private static final long serialVersionUID = 1L;
	public static final Color lblue = new Color(51,153,255);

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		jumpingshape.jumpingshape.repaint(g);
	}
	
}
