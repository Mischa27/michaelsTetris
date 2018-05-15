package com.hoffrogge.lehreinheit04;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit03.Farbe;

public class Dreieck implements GeometrischeFigur {
	
	private int mittelpunktX;
	private int mittelpunktY;
	private int durchmesser;



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
		// TODO Auto-generated method stub

	}

	@Override
	public void zeichnen(Graphics graphics) {
	
		int seiteA = mittelpunktX - durchmesser/2;
		

	}

	@Override
	public void setMittelpunkt(int x, int y) {
		this.mittelpunktX = x;
		this.mittelpunktY = y;
	}
}
