package com.hoffrogge.lehreinheit04;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public class TetrominoBlock implements GeometrischeFigur {

	private int mittelpunktX;
	private int mittelpunktY;
	private Farbe farbe;
	int yachse = 50;
	int xachse = 50;
	
	public TetrominoBlock() {
		mittelpunktX=10;
		mittelpunktY=10;
	}
	
	@Override
	public void setMittelpunkt(int x, int y) {
		this.mittelpunktX = x;
		this.mittelpunktY = y;
		
	}

	@Override
	public Punkt getMittelPunkt() {
		return new Punkt(mittelpunktX, mittelpunktY);
	}

	@Override
	public void setDurchmesser(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		this.farbe = farbe;		
	}

	@Override
	public void zeichnen(Graphics graphics) {
		
		graphics.setColor(farbe.konvertiereZuColor());
		
		graphics.drawLine(mittelpunktX, mittelpunktY, 50, 10);
		graphics.drawLine(mittelpunktX, yachse, x2, y2);
		
	}

}
