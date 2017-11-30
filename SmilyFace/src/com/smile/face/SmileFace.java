package com.smile.face;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class SmileFace extends JFrame{
	
	int height, width;
	public SmileFace(int height, int width)
	{
		this.height = height;
		this.width = width;
		super.setTitle("Smile");
		super.setSize(height, width);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args)
	{
		new SmileFace(400, 400);
	}
	
	public void paint(Graphics graf)
	{
		graf.setColor(Color.gray);
		graf.fillRect(0, 0, height, width);
		graf.setColor(Color.YELLOW);
		graf.fillArc(100, 100, 200, 200, 0, 360);
		graf.setColor(Color.BLUE);
		graf.fillArc(140, 150, 40, 40, 0, 360);
		graf.fillArc(220, 150, 40, 40, 0, 360);
		graf.setColor(Color.red);
		graf.drawArc(160, 180, 80, 80, 200, 140);
	}

}
