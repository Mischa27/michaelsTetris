package com.hoffrogge.lehreinheit04;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public class TetrominoBlock implements GeometrischeFigur {

	private int mittelpunktX;
	private int mittelpunktY;
	private Farbe farbe;
	int kantenlänge = 50;
	private int durchmesser;
	
	public TetrominoBlock() {
		mittelpunktX=50;
		mittelpunktY=50;
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
		this.durchmesser = d;
		
	}

	@Override
	public void setLinienFarbe(Farbe farbe) {
		this.farbe = farbe;		
	}

	@Override
	public void zeichnen(Graphics graphics) {
		
		graphics.setColor(farbe.konvertiereZuColor());
		
		graphics.drawLine(mittelpunktX, mittelpunktY, mittelpunktX + durchmesser, mittelpunktY);
		graphics.drawLine(mittelpunktX + durchmesser, mittelpunktY, mittelpunktX + durchmesser, mittelpunktY + durchmesser);
		graphics.drawLine(mittelpunktX + durchmesser, mittelpunktY + durchmesser, mittelpunktX, mittelpunktY + durchmesser);
		graphics.drawLine(mittelpunktX, mittelpunktY + durchmesser, mittelpunktX, mittelpunktY);
		graphics.drawLine(mittelpunktX + 3*durchmesser, mittelpunktY + durchmesser, mittelpunktX + durchmesser, mittelpunktY + durchmesser);
		graphics.drawLine(mittelpunktX + 3*durchmesser, mittelpunktY, mittelpunktX + durchmesser, mittelpunktY);
		graphics.drawLine(mittelpunktX + 2*durchmesser, mittelpunktY, mittelpunktX + 2*durchmesser, mittelpunktY + durchmesser);
		graphics.drawLine(mittelpunktX + 3*durchmesser, mittelpunktY, mittelpunktX + 3*durchmesser, mittelpunktY + durchmesser);
		graphics.drawLine(mittelpunktX, mittelpunktY + durchmesser, mittelpunktX, mittelpunktY + 2*durchmesser);
		graphics.drawLine(mittelpunktX + durchmesser, mittelpunktY + durchmesser, mittelpunktX + durchmesser, mittelpunktY + 2*durchmesser);
		graphics.drawLine(mittelpunktX, mittelpunktY + 2*durchmesser, mittelpunktX + durchmesser, mittelpunktY + 2*durchmesser);
		
		graphics.drawLine(mittelpunktX + durchmesser*4, mittelpunktY, mittelpunktX + durchmesser*6, mittelpunktY);
		graphics.drawLine(mittelpunktX + durchmesser*5, mittelpunktY + durchmesser*2, mittelpunktX + durchmesser*5, mittelpunktY);
		graphics.drawLine(mittelpunktX + durchmesser*4, mittelpunktY + durchmesser*2, mittelpunktX + durchmesser*6, mittelpunktY + durchmesser*2);
		graphics.drawLine(mittelpunktX + durchmesser*4, mittelpunktY + durchmesser, mittelpunktX + durchmesser*6, mittelpunktY + durchmesser);
		graphics.drawLine(mittelpunktX + durchmesser*4, mittelpunktY + durchmesser*2, mittelpunktX + durchmesser*4, mittelpunktY);
		graphics.drawLine(mittelpunktX + durchmesser*6, mittelpunktY + durchmesser*2, mittelpunktX + durchmesser*6, mittelpunktY);
		
		graphics.drawLine(mittelpunktX + durchmesser*7, mittelpunktY, mittelpunktX + durchmesser*8, mittelpunktY);
		graphics.drawLine(mittelpunktX + durchmesser*7, mittelpunktY + durchmesser*4, mittelpunktX + durchmesser*7, mittelpunktY);
		graphics.drawLine(mittelpunktX + durchmesser*8, mittelpunktY + durchmesser*4, mittelpunktX + durchmesser*8, mittelpunktY);
		graphics.drawLine(mittelpunktX + durchmesser*7, mittelpunktY + durchmesser*3, mittelpunktX + durchmesser*8, mittelpunktY + durchmesser*3);
		graphics.drawLine(mittelpunktX + durchmesser*7, mittelpunktY + durchmesser*2, mittelpunktX + durchmesser*8, mittelpunktY + durchmesser*2);
		graphics.drawLine(mittelpunktX + durchmesser*7, mittelpunktY + durchmesser*1, mittelpunktX + durchmesser*8, mittelpunktY + durchmesser*1);
		graphics.drawLine(mittelpunktX + durchmesser*7, mittelpunktY + durchmesser*4, mittelpunktX + durchmesser*8, mittelpunktY + durchmesser*4);
	}

}
